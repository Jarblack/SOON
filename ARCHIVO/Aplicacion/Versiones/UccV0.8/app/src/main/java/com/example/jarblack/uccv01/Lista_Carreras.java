package com.example.jarblack.uccv01;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jarblack on 21/11/2017.
 */

public class Lista_Carreras extends AppCompatActivity {


    private Toolbar toolbar;
    ListView listaDatos;

    List<Carreras> lstUser=new ArrayList<Carreras>();
    DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_carreras);

        dbHelper=new DbHelper(getApplicationContext());
        dbHelper.createDatabase();

        toolbar=(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        listaDatos=(ListView)findViewById(R.id.lstCarreras);
        lstUser=dbHelper.getAllUsers();


        Adaptador2 miadaptador=new Adaptador2(getApplicationContext(),lstUser);

        listaDatos.setAdapter(miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Carreras obj=(Carreras)parent.getItemAtPosition(position);

                Intent paso=new Intent(getApplicationContext(),Calculadora_Creditos.class);
                paso.putExtra("objeto",(Serializable)obj);
                startActivity(paso);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listas, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu){

        int id=opcion_menu.getItemId();

        if(id==R.id.info){
            ejecutar_info(null);
            return true;
        }

        return super.onOptionsItemSelected(opcion_menu);
    }

    public void ejecutar_info(View vista){

        Intent i=new Intent(Lista_Carreras.this, InfoClase.class);
        startActivity(i);
    }




}
