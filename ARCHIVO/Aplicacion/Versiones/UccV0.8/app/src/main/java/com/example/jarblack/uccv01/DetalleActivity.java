package com.example.jarblack.uccv01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jarblack on 18/11/2017.
 */

public class DetalleActivity extends AppCompatActivity {

    ImageView foto1,foto2,foto3,foto4,foto5,foto6,foto7,foto8,foto9,foto10;
    TextView titulo,descripcion,direccion,transporte,caracteristicas,ubicacion;

    private Toolbar toolbar;
    private Button ubicarme;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bloque1);



        foto1=(ImageView)findViewById(R.id.imgFoto1);
        foto2=(ImageView)findViewById(R.id.imgFoto2);
        foto3=(ImageView)findViewById(R.id.imgFoto3);
        foto4=(ImageView)findViewById(R.id.imgFoto4);
        foto5=(ImageView)findViewById(R.id.imgFoto5);
        foto6=(ImageView)findViewById(R.id.imgFoto6);
        foto7=(ImageView)findViewById(R.id.imgFoto7);
        foto8=(ImageView)findViewById(R.id.imgFoto8);
        foto9=(ImageView)findViewById(R.id.imgFoto9);
        foto10=(ImageView)findViewById(R.id.imgFoto10);


        titulo=(TextView)findViewById(R.id.txtTitulo);
        descripcion=(TextView)findViewById(R.id.txtDescripcion);
        direccion=(TextView)findViewById(R.id.txtDireccion);
        transporte=(TextView)findViewById(R.id.txtTransporte);
        caracteristicas=(TextView)findViewById(R.id.txtCaracteristicas);
        ubicacion=(TextView)findViewById(R.id.txtUbicacion);


        Datos obj=(Datos)getIntent().getExtras().getSerializable("objeto");

        int img[]=obj.getImagenes();

        titulo.setText(obj.getTitulo());
        descripcion.setText(obj.getDescripcion());
        direccion.setText(obj.getDireccion());
        transporte.setText(obj.getTransporte());
        caracteristicas.setText(obj.getCaracteristicas());
        ubicacion.setText(obj.getUbicacion());
        foto1.setImageResource(img[0]);
        foto2.setImageResource(img[1]);
        foto3.setImageResource(img[2]);
        foto4.setImageResource(img[3]);
        foto5.setImageResource(img[4]);
        foto6.setImageResource(img[5]);
        foto7.setImageResource(img[6]);
        foto8.setImageResource(img[7]);
        foto9.setImageResource(img[8]);
        foto10.setImageResource(img[9]);



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

        Intent i = new Intent(DetalleActivity.this, InfoClase.class);
        startActivity(i);
    }

    public void ejecutar_mapa(View vista){

        Datos obj=(Datos)getIntent().getExtras().getSerializable("objeto");
        Intent intent = new Intent(DetalleActivity.this, MapsActivity.class);
        intent.putExtra("valor1",obj.getLongi());
        intent.putExtra("valor2",obj.getLat());
        startActivity(intent);
    }





    public void salirApp(View vista) {
        finish();
    }
}




