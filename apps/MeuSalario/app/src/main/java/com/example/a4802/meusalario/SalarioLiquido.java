package com.example.a4802.meusalario;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SalarioLiquido extends AppCompatActivity {
// delcarando variaveis
    private EditText editText6;
    private TextView resu;
    private  Button calcular;
    private double inss;
    private  double irf;
    private double sal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salario_liquido);


        Button VoltarTelaInicial = (Button) findViewById(R.id.volta1);


        VoltarTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SalarioLiquido.this.finish();}
        });

        editText6 = (EditText) findViewById(R.id.editText6);
        calcular = (Button) findViewById(R.id.calcular);
        resu = (TextView) findViewById(R.id.resu);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sal = Double.parseDouble(editText6.getText().toString());

                double desconto = descontado(sal, inss);

                if (sal <=1399)
                    inss = ((sal * 8) / 100);

                else if (sal>= 1400 && sal <= 2331)
                inss = ((sal * 9)/100);

                else if (sal >=2332 && sal <= 4663)
                    inss = ((sal * 11)/ 100);
                else {
                    resu.setText("Livre dos descontos");
                }
                resu.setText(String.valueOf(desconto + " Reais"));
            }

        });

    }
// Subtração
    private double descontado(double sal, double inss) {
        double resutadoo = (sal - inss);
        return resutadoo;
    }
}