package com.example.estudiantes.aplicacionsumaresta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
public class calculos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos);
    }
    public void sumar(View vista) {
        EditText miA =(EditText) findViewById(R.id.a);
        EditText miB =(EditText) findViewById(R.id.b);
        Button miSuma=(Button) findViewById(R.id.suma);
        TextView miResultado=(TextView) findViewById(R.id.resultado);

        double numero = Double.parseDouble(String.valueOf(miA.getText())) ;
        double numero1 = Double.parseDouble(String.valueOf(miB.getText())) ;
        double r=numero+numero1;
        miResultado.setText("El resultado de la suma fue "+r);


    }
    public void restar(View vista) {
        EditText miA =(EditText) findViewById(R.id.a);
        EditText miB =(EditText) findViewById(R.id.b);
        Button miResta=(Button) findViewById(R.id.resta);
        TextView miResultado=(TextView) findViewById(R.id.resultado);
        double numero = Double.parseDouble(String.valueOf(miA.getText())) ;
        double numero1 = Double.parseDouble(String.valueOf(miB.getText())) ;
        double r=numero-numero1;
        miResultado.setText("El resultado de la resta fue "+r);
    }
    public void convertir(View vista) {
        EditText miA =(EditText) findViewById(R.id.a);
        Button miConvertidor=(Button) findViewById(R.id.convertir);
        TextView miResultado=(TextView) findViewById(R.id.resultado);
        double numero1 = Double.parseDouble(String.valueOf(miA.getText())) ;
        double r= numero1*1.8+32;
        miResultado.setText("La conversion es"+r);


    }
}
