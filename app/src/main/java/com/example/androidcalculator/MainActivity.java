package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private CheckBox checkBox;
    private RadioGroup operaciones;
    private Button buttonSuma; private Button buttonResta; private Button buttonMultplicar; private Button buttonDividir;
    private RadioButton suma; private RadioButton resta; private RadioButton division; private RadioButton multiplicar;
    double result = 0;
    String aux = "0",aux2= "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.MostrarOpciones);
        operaciones = findViewById(R.id.operaciones);
        operaciones.setVisibility(View.GONE);

        buttonSuma = findViewById(R.id.sumar);
        buttonDividir = findViewById(R.id.dividir);
        buttonMultplicar = findViewById(R.id.multiplicacion);
        buttonResta = findViewById(R.id.restar);

        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        multiplicar = findViewById(R.id.multiplicar);
        division = findViewById(R.id.division);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()){
                    operaciones.setVisibility(View.VISIBLE);
                } else {
                    operaciones.setVisibility(View.GONE);
                    buttonSuma.setVisibility(View.VISIBLE);
                    buttonResta.setVisibility(View.VISIBLE);
                    buttonMultplicar.setVisibility(View.VISIBLE);
                    buttonDividir.setVisibility(View.VISIBLE);
                }
            }
        });
        operaciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (suma.isChecked()){
                    buttonSuma.setVisibility(View.INVISIBLE);
                    buttonResta.setVisibility(View.VISIBLE);
                    buttonMultplicar.setVisibility(View.VISIBLE);
                    buttonDividir.setVisibility(View.VISIBLE);
                } else if (resta.isChecked()){
                    buttonSuma.setVisibility(View.VISIBLE);
                    buttonResta.setVisibility(View.INVISIBLE);
                    buttonMultplicar.setVisibility(View.VISIBLE);
                    buttonDividir.setVisibility(View.VISIBLE);
                } else if (multiplicar.isChecked()) {
                    buttonSuma.setVisibility(View.VISIBLE);
                    buttonResta.setVisibility(View.VISIBLE);
                    buttonMultplicar.setVisibility(View.INVISIBLE);
                    buttonDividir.setVisibility(View.VISIBLE);
                } else if (division.isChecked()) {
                    buttonSuma.setVisibility(View.VISIBLE);
                    buttonResta.setVisibility(View.VISIBLE);
                    buttonMultplicar.setVisibility(View.VISIBLE);
                    buttonDividir.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    public void buttonClear(View view){
        textView = findViewById(R.id.Resultado);
        textView.setText("0");
        if (aux.equals("0")){
            aux = "";
        }else {
            aux = "0";
        }
    }
    public void buttonZero(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "0";
        }else{
            aux += "0";
        }
        textView.setText(aux);
    }
    public void buttonOne(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "1";
        }else {
            aux += "1";
        }
        textView.setText(aux);
    }
    public void buttonTwo(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "2";
        }else {
            aux += "2";
        }
        textView.setText(aux);
    }
    public void buttonThree(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "3";
        }else {
            aux += "3";
        }
        textView.setText(aux);
    }
    public void buttonFour(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "4";
        }else {
            aux += "4";
        }
        textView.setText(aux);
    }
    public void buttonFive(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "5";
        }else {
            aux += "5";
        }
        textView.setText(aux);
    }
    public void buttonSix(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "6";
        }else {
            aux += "6";
        }
        textView.setText(aux);
    }
    public void buttonSeven(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "7";
        }else {
            aux += "7";
        }
        textView.setText(aux);
    }
    public void buttonEight(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "8";
        }else {
            aux += "8";
        }
        textView.setText(aux);
    }
    public void buttonNine(View view){
        textView = findViewById(R.id.Resultado);
        if (aux.equals("0")){
            aux = "9";
        }else {
            aux += "9";
        }
        textView.setText(aux);
    }
    public void buttonSum(View view){
        textView = findViewById(R.id.Resultado);
        aux += "+";
        textView.setText(aux);
    }
    public void buttonDot(View view){
        textView = findViewById(R.id.Resultado);
        aux += ".";
        textView.setText(aux);
    }
    public void buttonSubtract(View view){
        textView = findViewById(R.id.Resultado);
        aux += "-";
        textView.setText(aux);
    }
    public void buttonMultiply(View view){
        textView = findViewById(R.id.Resultado);
        aux += "x";
        textView.setText(aux);
    }
    public void buttonSplit(View view){
        textView = findViewById(R.id.Resultado);
        aux += "÷";
        textView.setText(aux);
    }
    public void buttonEquals(View view) {
        textView = findViewById(R.id.Resultado);
        String aux2 = "", aux3 = "";
        char signo = 0;
        int pos = 0;

        for (int i = 0; i < aux.length(); i++) {
            if ((char) aux.charAt(i) == (char) 43 || (char) aux.charAt(i) == (char) 45 || (char) aux.charAt(i) == (char) 120 || (char) aux.charAt(i) == (char) 247) {
                pos = i;
                signo = (char) aux.charAt(i);
            }
        }

            for (int i = 0; i < aux.length(); i++) {
                if (i < pos)
                    aux2 += String.valueOf(aux.charAt(i));
            }
            for (int i = 0; i < aux.length(); i++) {
                if (i > pos)
                    aux3 += String.valueOf(aux.charAt(i));

            }

            if (signo == (char) 43) {
                result = Double.parseDouble(aux2) + Double.parseDouble(aux3);
            } else if (signo == (char) 45) {
                result = Double.parseDouble(aux2) - Double.parseDouble(aux3);
            } else if (signo == (char) 120) {
                result = Double.parseDouble(aux2) * Double.parseDouble(aux3);
            } else if (signo == (char) 247) {
                result = Double.parseDouble(aux2) / Double.parseDouble(aux3);
            }
            textView.setText(String.valueOf(result));
        }

    }
