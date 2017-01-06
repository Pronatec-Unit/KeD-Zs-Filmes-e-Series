package com.example.a4802.meusalario;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ValorHora extends AppCompatActivity {
// Declarando variaveiu
    private EditText editText;
    private  EditText editText2;
    private Button calcular;
    private TextView resu;
    private double  salario;
    private double horas;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_hora);

        Button VoltarTelaInicial = (Button) findViewById(R.id.volta1);


        VoltarTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValorHora.this.finish();
            }
        });

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        calcular = (Button) findViewById(R.id.calcular);
        resu = (TextView) findViewById(R.id.resu);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salario = Double.parseDouble(editText.getText().toString());
                horas = Double.parseDouble(editText2.getText().toString());

             double valorHora = resutado(salario,horas);
                resu.setText(String.valueOf(valorHora) + " Reais");

            }
        });
    }

    private double resutado(double salario, double horas) {
        double resutadoo = (salario / horas);
        return resutadoo;

    }
}