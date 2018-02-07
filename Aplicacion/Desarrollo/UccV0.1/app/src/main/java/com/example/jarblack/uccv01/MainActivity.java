package com.example.jarblack.uccv01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button ingresar,carreras,emergencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       toolbar=(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        ingresar = (Button) findViewById(R.id.ingresar);
        carreras=(Button)findViewById(R.id.creditos);
        emergencia=(Button)findViewById(R.id.emergencia);

        ingresar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                ejecutar_lista(null);

            }

        });
        carreras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Lista_Carreras.class);
                startActivity(intent);
            }
        });

        emergencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Emergencia.class);
                startActivity(intent);
            }
        });

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

        Intent i=new Intent(MainActivity.this, InfoClase.class);
        startActivity(i);
    }

    public void ejecutar_lista(View vista){

        Intent i=new Intent(MainActivity.this, Lista.class);
        startActivity(i);
    }



    public void salir(View vista){

        System.exit(0);
    }





}
