package com.example.a4802.meusalario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HoraExtra extends AppCompatActivity {
// declarando variaveis
    private EditText editText10;
    private  EditText editText3;
    private  EditText editText4;
    private Button calcular;
    private TextView resu;
    private double cem;
    private double cinquenta;
    private double cal5;
    private double cal10;
    private double salHora;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora_extra);

        Button VoltarTelaInicial = (Button) findViewById(R.id.volta1);


        VoltarTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HoraExtra.this.finish();
            }
        });


        editText10 = (EditText) findViewById(R.id.editText10);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText3 = (EditText) findViewById(R.id.editText3);
        calcular = (Button) findViewById(R.id.calcular);
        resu = (TextView) findViewById(R.id.resu);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cem = Double.parseDouble(editText4.getText().toString());
                cinquenta = Double.parseDouble(editText3.getText().toString());
                salHora = Double.parseDouble(editText10.getText().toString());


                cal5 =  (((salHora* 50)/100) * cinquenta);
                cal10 = (salHora * cem );

                double horaextra  = cal(cal10,cal5);
                resu.setText(String.valueOf(horaextra) + " Reais");
            }
        });
    }
// Soma
    private double cal(double cal10, double cal5) {
        double resutadoo = (cal5 + cal10);
        return resutadoo;
    }
}
