package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv=(TextView)findViewById(R.id.textView);

    }


    public void sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);
        double suma =nro1+nro2;
        String result = String.valueOf(suma);
        tv.setText(result);
    }

    public void resta(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);
        double suma =nro1-nro2;
        String result = String.valueOf(suma);
        tv.setText(result);
    }

    public void multiplicacion(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);
        double res =nro1*nro2;
        String result = String.valueOf(res);
        tv.setText(result);
    }

    public void division(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);
        double res =nro1/nro2;
        String result = String.valueOf(res);
        tv.setText(result);
    }

    public void potencia(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double nro2 = Double.parseDouble(valor2);
        double res = Math.pow(nro1,nro2);
        String result = String.valueOf(res);
        tv.setText(result);
    }

    public void raiz (View view){
        String valor1 = et1.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double res =Math.sqrt(nro1);
        String result = String.valueOf(res);
        tv.setText(result);
    }

    public void logaritmoBase10 (View view){
        String valor1 = et1.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double res =Math.log10(nro1);
        String result = String.valueOf(res);
        tv.setText(result);
    }

    public void logaritmoNatural (View view){
        String valor1 = et1.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double res =Math.log(nro1);
        String result = String.valueOf(res);
        tv.setText(result);
    }

    public void seno (View view){
        String valor1 = et1.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double res =Math.sin(nro1);
        String result = String.valueOf(res);
        tv.setText(result);
    }

    public void coseno (View view){
        String valor1 = et1.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double res =Math.cos(nro1);
        String result = String.valueOf(res);
        tv.setText(result);
    }

    public void tangente (View view){
        String valor1 = et1.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double res =Math.tan(nro1);
        String result = String.valueOf(res);
        tv.setText(result);
    }

    public void cotangente (View view){
        String valor1 = et1.getText().toString();
        double nro1 = Double.parseDouble(valor1);
        double res =Math.cos(nro1)/Math.sin(nro1);
        String result = String.valueOf(res);
        tv.setText(result);
    }

}