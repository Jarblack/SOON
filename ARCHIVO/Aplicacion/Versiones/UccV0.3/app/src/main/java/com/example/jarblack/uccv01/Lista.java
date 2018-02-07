package com.example.jarblack.uccv01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Jarblack on 9/11/2017.
 */

public class Lista extends AppCompatActivity{
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_bloques);

        toolbar=(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

        Intent i=new Intent(Lista.this, InfoClase.class);
        startActivity(i);
    }

    public void ejecutar_bloque1(View vista){

        Intent i=new Intent(Lista.this, Bloque1.class);
        startActivity(i);
    }
    public void ejecutar_bloque2(View vista){

        Intent i=new Intent(Lista.this, Bloque2.class);
        startActivity(i);
    }
    public void ejecutar_bloque3(View vista){

        Intent i=new Intent(Lista.this, Bloque3.class);
        startActivity(i);
    }
    public void ejecutar_bloque4(View vista){

        Intent i=new Intent(Lista.this, Bloque4.class);
        startActivity(i);
    }
    public void ejecutar_bloque5(View vista){

        Intent i=new Intent(Lista.this, Bloque5.class);
        startActivity(i);
    }
    public void ejecutar_bloque6(View vista){

        Intent i=new Intent(Lista.this, Bloque6.class);
        startActivity(i);
    }
    public void ejecutar_bloque7(View vista){

        Intent i=new Intent(Lista.this, Bloque7.class);
        startActivity(i);
    }
    public void ejecutar_bloque8(View vista){

        Intent i=new Intent(Lista.this, Bloque8.class);
        startActivity(i);
    }
    public void ejecutar_bloque9(View vista){

        Intent i=new Intent(Lista.this, Bloque9.class);
        startActivity(i);
    }
    public void ejecutar_bloque10(View vista){

        Intent i=new Intent(Lista.this, Bloque10.class);
        startActivity(i);
    }
    public void ejecutar_bloque11(View vista){

        Intent i=new Intent(Lista.this, Bloque11.class);
        startActivity(i);
    }
    public void ejecutar_bloque12(View vista){

        Intent i=new Intent(Lista.this, Bloque12.class);
        startActivity(i);
    }
    public void ejecutar_bloque13(View vista){

        Intent i=new Intent(Lista.this, Bloque13.class);
        startActivity(i);
    }
    public void ejecutar_bloque14(View vista){

        Intent i=new Intent(Lista.this, Bloque14.class);
        startActivity(i);
    }
    public void ejecutar_bloque15(View vista){

        Intent i=new Intent(Lista.this, Bloque15.class);
        startActivity(i);
    }
    public void ejecutar_bloque16(View vista){

        Intent i=new Intent(Lista.this, Bloque16.class);
        startActivity(i);
    }
    public void ejecutar_bloque17(View vista){

        Intent i=new Intent(Lista.this, Bloque17.class);
        startActivity(i);
    }
    public void ejecutar_bloque18(View vista){

        Intent i=new Intent(Lista.this, Bloque18.class);
        startActivity(i);
    }
    public void ejecutar_bloque19(View vista){

        Intent i=new Intent(Lista.this, Bloque19.class);
        startActivity(i);
    }
    public void ejecutar_bloque20(View vista){

        Intent i=new Intent(Lista.this, Bloque20.class);
        startActivity(i);
    }
    public void ejecutar_bloque21(View vista){

        Intent i=new Intent(Lista.this, Bloque21.class);
        startActivity(i);
    }
    public void ejecutar_bloque22(View vista){

        Intent i=new Intent(Lista.this, Bloque22.class);
        startActivity(i);
    }
    public void ejecutar_bloque23(View vista){

        Intent i=new Intent(Lista.this, Bloque23.class);
        startActivity(i);
    }
    public void ejecutar_bloque24(View vista){

        Intent i=new Intent(Lista.this, Bloque24.class);
        startActivity(i);
    }
    public void ejecutar_bloque25(View vista){

        Intent i=new Intent(Lista.this, Bloque25.class);
        startActivity(i);
    }
    public void ejecutar_bloque26(View vista){

        Intent i=new Intent(Lista.this, Bloque26.class);
        startActivity(i);
    }
    public void ejecutar_bloque27(View vista){

        Intent i=new Intent(Lista.this, Bloque27.class);
        startActivity(i);
    }
    public void ejecutar_bloque28(View vista){

        Intent i=new Intent(Lista.this, Bloque28.class);
        startActivity(i);
    }
    public void ejecutar_bloque29(View vista){

        Intent i=new Intent(Lista.this, Bloque29.class);
        startActivity(i);
    }
    public void ejecutar_bloque30(View vista){

        Intent i=new Intent(Lista.this, Bloque30.class);
        startActivity(i);
    }

    public void ejecutar_bloque31(View vista){

        Intent i=new Intent(Lista.this, Bloque31.class);
        startActivity(i);
    }





}
