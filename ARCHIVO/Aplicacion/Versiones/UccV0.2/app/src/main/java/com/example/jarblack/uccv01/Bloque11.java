package com.example.jarblack.uccv01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jarblack on 9/11/2017.
 */

public class Bloque11 extends AppCompatActivity {

    private Toolbar toolbar;
    private Button ubicarme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bloque11);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        ubicarme = (Button) findViewById(R.id.ubicarse);

        ubicarme.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                ejecutar_mapa(null);

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bloques, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu) {

        int id = opcion_menu.getItemId();

        if (id == R.id.mapa) {
            ejecutar_mapa(null);
            return true;
        }
        if (id == R.id.info) {
            ejecutar_info(null);
            return true;
        }
        return super.onOptionsItemSelected(opcion_menu);
    }

    public void ejecutar_info(View vista) {

        Intent i = new Intent(Bloque11.this, InfoClase.class);
        startActivity(i);
    }

    public void ejecutar_mapa(View vista){


        Intent inten = new Intent(Bloque11.this, Bloque11Maps.class);
        startActivity(inten);
    }


    public void salirApp(View vista) {
        finish();
    }
}