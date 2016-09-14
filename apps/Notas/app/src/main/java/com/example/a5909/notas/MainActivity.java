package com.example.a5909.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private EditText goku;
    private EditText goku01;
    private Button button;
    private TextView goku3;
    private double deby01;
    private double deby02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goku = (EditText) findViewById(R.id.goku);
        goku01 = (EditText) findViewById(R.id.goku01);
        button = (Button) findViewById(R.id.button)
        goku3 = (TextView) findViewById(R.id.goku3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                deby01 = Double.parseDouble(goku.getText();
                deby02 = Double.parseDouble(goku01.getText();
                Double media = calcularMedia(deby01, deby02);
                goku3.setText(media.toString());
                )
            }

        });

    }
}
private double calcularMedia(double n1, double n2) {
    double mediafinal = (n1 + n2)/2;
    return mediafinal;
}