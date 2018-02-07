package com.example.jarblack.uccv01;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jarblack on 23/11/2017.
 */

public class Emergencia extends AppCompatActivity {

    Button opcion1,opcion2,opcion3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergencia);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);


        opcion1=(Button)findViewById(R.id.opc1);
        opcion2=(Button)findViewById(R.id.opc2);
        opcion3=(Button)findViewById(R.id.opc3);

        opcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(Emergencia.this);

                dialogo.setTitle("Seguro que desea llamar?");
                dialogo.setMessage("Esta opcion puede generar costos al operador de telefonia ¿Deseas continuar?");
                dialogo.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i= new Intent(Intent.ACTION_CALL, Uri.parse("tel:3202553813"));
                        if(ActivityCompat.checkSelfPermission(Emergencia.this, Manifest.permission.CALL_PHONE)!=
                                PackageManager.PERMISSION_GRANTED)
                            return;
                        startActivity(i);
                    }
                });
                dialogo.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                dialogo.create();

                dialogo.show();
            }
        });


        opcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(Emergencia.this);

                dialogo.setTitle("Seguro que desea llamar?");
                dialogo.setMessage("Esta opcion puede generar costos al operador de telefonia ¿Deseas continuar?");
                dialogo.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i= new Intent(Intent.ACTION_CALL, Uri.parse("tel:3202553813"));
                        if(ActivityCompat.checkSelfPermission(Emergencia.this, Manifest.permission.CALL_PHONE)!=
                                PackageManager.PERMISSION_GRANTED)
                            return;
                        startActivity(i);
                    }
                });
                dialogo.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                dialogo.create();

                dialogo.show();
            }
        });



        opcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(Emergencia.this);

                dialogo.setTitle("Seguro que desea llamar?");
                dialogo.setMessage("Esta opcion puede generar costos al operador de telefonia ¿Deseas continuar?");
                dialogo.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i= new Intent(Intent.ACTION_CALL, Uri.parse("tel:3202553813"));
                        if(ActivityCompat.checkSelfPermission(Emergencia.this, Manifest.permission.CALL_PHONE)!=
                                PackageManager.PERMISSION_GRANTED)
                            return;
                        startActivity(i);
                    }
                });
                dialogo.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                dialogo.create();

                dialogo.show();
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
    public boolean onOptionsItemSelected(MenuItem opcion_menu) {

        int id = opcion_menu.getItemId();


        if (id == R.id.info) {
            ejecutar_info(null);
            return true;
        }

        return super.onOptionsItemSelected(opcion_menu);
    }

    public void ejecutar_info(View vista) {

        Intent i = new Intent(Emergencia.this, InfoClase.class);
        startActivity(i);
    }


}
