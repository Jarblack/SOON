package com.example.jarblack.uccv01;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jarblack on 22/11/2017.
 */

public class DbHelper extends SQLiteOpenHelper {

    private static String DB_PATH="";
    private static String DB_NAME="CarrerasUcc.db";
    private SQLiteDatabase mDataBase;
    private Context mContext=null;

    public DbHelper(Context context) {
        super(context, DB_NAME, null, 1);
        if(Build.VERSION.SDK_INT >=17)
            DB_PATH=context.getApplicationInfo().dataDir+"/databases/";
        else
            DB_PATH="/data/data/"+context.getPackageName()+"/databases";

        mContext=context;
    }

    @Override
    public synchronized void close() {
        if(mDataBase != null)
            mDataBase.close();
        super.close();
    }

    private boolean checkDataBase(){
        SQLiteDatabase tempDB=null;
        try{
            String path=DB_PATH+DB_NAME;
            tempDB=SQLiteDatabase.openDatabase(path,null,SQLiteDatabase.OPEN_READWRITE);

        }catch(Exception ex){}
            if(tempDB !=null)
                tempDB.close();
            return tempDB!=null?true:false;

    }

    public void copyDataBase(){
        try{
            InputStream myInput=mContext.getAssets().open(DB_NAME);
            String outputFileName=DB_PATH+DB_NAME;
            OutputStream myOutput=new FileOutputStream(outputFileName);

            byte[] buffer=new byte[1024];
            int length;
            while((length= myInput.read(buffer))>0){
                myOutput.write(buffer,0,length);
            }

            myOutput.flush();
            myOutput.close();
            myInput.close();

        }catch (Exception ex){}

    }

    public void openDataBase(){
        String path=DB_PATH+DB_NAME;
        mDataBase=SQLiteDatabase.openDatabase(path,null,SQLiteDatabase.OPEN_READWRITE);

    }

    public void createDatabase(){
        boolean isDBExist=checkDataBase();
        if(isDBExist){


        }
        else{
            this.getReadableDatabase();
            try{
                copyDataBase();
            }catch(Exception ex){

            }

        }

    }

    //Select all Data
    public List<Carreras> getAllUsers(){
        List<Carreras> temp=new ArrayList<Carreras>();
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor c;
        try{
            c=db.rawQuery("SELECT * FROM Carreras",null);
            if(c==null)return null;

            c.moveToFirst();

            do{
                Carreras carrer=new Carreras(c.getInt(c.getColumnIndex("Id")),c.getString(c.getColumnIndex("Carrera")),c.getInt(c.getColumnIndex("Creditos")),c.getDouble(c.getColumnIndex("Valor_Credito")),c.getInt(c.getColumnIndex("Cantidad_Semestres")),c.getString(c.getColumnIndex("Ciudad")),c.getInt(c.getColumnIndex("SNIES")));
                temp.add(carrer);
            }while(c.moveToNext());
            c.close();

        }catch(Exception e){

        }
        db.close();
        return temp;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
