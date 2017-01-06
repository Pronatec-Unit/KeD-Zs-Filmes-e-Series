package com.example.a4802.meusalario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SalarioBruto extends AppCompatActivity {
//declarando variaveis
    private EditText editText8;
    private  EditText editText9;
    private Button calcular;
    private TextView resu;
    private double  dias;
    private double  diaria;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salario_bruto);

        Button VoltarTelaInicial = (Button) findViewById(R.id.volta1);


        VoltarTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SalarioBruto.this.finish();
            }
        });

        editText8 = (EditText) findViewById(R.id.editText8);
        editText9 = (EditText) findViewById(R.id.editText9);
        calcular = (Button) findViewById(R.id.calcular);
        resu = (TextView) findViewById(R.id.resu);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dias = Double.parseDouble(editText9.getText().toString());
                diaria = Double.parseDouble(editText8.getText().toString());

                double salarioBruto = resutado(dias,diaria);
                resu.setText(String.valueOf(salarioBruto) + " Reais");
            }
        });
    }
// Multiplicação
    private double resutado(double dias, double diaria) {
        double resutadoo = (diaria * dias);
        return resutadoo;
    }
}