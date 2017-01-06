package com.example.a4802.meusalario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton IrParaValorHora = (ImageButton) findViewById(R.id.imageButton3);

        IrParaValorHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.activity_tela2);
                Intent intent = new Intent(MainActivity.this, ValorHora.class);
                startActivity(intent);
            }
        });


        ImageButton IrParaSalarioBruto = (ImageButton) findViewById(R.id.imageButton4);

        IrParaSalarioBruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.activity_tela2);
                Intent intent = new Intent(MainActivity.this, SalarioBruto.class);
                startActivity(intent);
            }
        });
        ImageButton IrParaHoraExtra = (ImageButton) findViewById(R.id.imageButton);

        IrParaHoraExtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.activity_tela2);
                Intent intent = new Intent(MainActivity.this, HoraExtra.class);
                startActivity(intent);
            }
        });
        ImageButton IrParaSalarioliquido = (ImageButton) findViewById(R.id.imageButton2);

        IrParaSalarioliquido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setContentView(R.layout.activity_tela2);
                Intent intent = new Intent(MainActivity.this, SalarioLiquido.class);
                startActivity(intent);
            }
        });

    }
}
