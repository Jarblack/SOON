package com.example.jarblack.uccv01;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jarblack on 18/11/2017.
 */

public class Calculadora_Creditos extends AppCompatActivity {


    TextView carrera,creditos,valor_credito,cantidad_semestres,ciudad,snies,total;
    EditText num;
    Button calcular;

    private Toolbar toolbar;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_creditos);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);




        carrera=(TextView)findViewById(R.id.txtCarrera);
        creditos=(TextView)findViewById(R.id.txtCreditos);
        valor_credito=(TextView)findViewById(R.id.txtValor);
        cantidad_semestres=(TextView)findViewById(R.id.txtSemestres);
        ciudad=(TextView)findViewById(R.id.txtCiudad);
        snies=(TextView)findViewById(R.id.txtSnies);
        total=(TextView)findViewById(R.id.txtTotal);

        num=(EditText)findViewById(R.id.num);

        calcular=(Button)findViewById(R.id.calcular);


        Carreras obj=(Carreras)getIntent().getExtras().getSerializable("objeto");



        carrera.setText(obj.getCarrera().toString());
        creditos.setText(Integer.toString(obj.getCreditos()));
        valor_credito.setText(Double.toString(obj.getValor_credito()));
        cantidad_semestres.setText(Integer.toString(obj.getSemestres()));
        ciudad.setText(obj.getCiudad().toString());
        snies.setText(Integer.toString(obj.getSnies()));
        double valor=obj.getValor_credito();



        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Carreras obj=(Carreras)getIntent().getExtras().getSerializable("objeto");
                double valor=obj.getValor_credito();
                double totalx=Double.parseDouble(num.getText().toString())*(valor);
                total.setText(String.format("%.2f",totalx));
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_creditos, menu);
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

        Intent i = new Intent(Calculadora_Creditos.this, InfoClase.class);
        startActivity(i);
    }






}




