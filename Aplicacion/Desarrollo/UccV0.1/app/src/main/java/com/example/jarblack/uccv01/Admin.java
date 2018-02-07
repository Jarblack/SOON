package com.example.jarblack.uccv01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jarblack on 19/11/2017.
 */

public class Admin extends AppCompatActivity {

    Button miboton;
    EditText nombre,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingreso_admin);

        miboton=(Button)findViewById(R.id.ingreso);
        nombre=(EditText) findViewById(R.id.name);
        password=(EditText) findViewById(R.id.pass);

        miboton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                if(nombre.getText().toString().equals("primiparos")&& password.getText().toString().equals("9mspvbswX")){

                    Intent i=new Intent(Admin.this, Lista_Carreras.class);
                    startActivity(i);

                }else{

                    Toast.makeText(getApplicationContext(),"El nombre o la contraseña son incorrectos", Toast.LENGTH_LONG).show();

                }

            }

        });

}
}
