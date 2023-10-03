package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Pantalla2 extends AppCompatActivity {

    Button btnregresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        btnregresar=(Button)findViewById(R.id.btnregresar);


        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(Pantalla2.this, MainActivity.class);
                startActivity(i);


            }
        });


    }
}