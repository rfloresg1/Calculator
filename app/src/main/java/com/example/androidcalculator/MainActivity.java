package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String aux = "0";
    String aux2= "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public int sumar(int aux , int aux2){
        return aux + aux2;
    }
    public int restar(int aux, int aux2){
        return aux-aux2;
    }
    public int multiplicar(int aux, int aux2){
        return aux * aux2;
    }
    public int dividir(int aux,int aux2){
        return aux/aux2;
    }
    public void buttonEquals(View view) {
        textView = findViewById(R.id.Resultado);
        int aux2 = 0, aux3 = 0,result = 0;
        char signo = 0;
        int pos = 0;

        for (int i = 0; i < aux.length(); i++) {
            if ((char) aux.charAt(i) == (char) 43 || (char) aux.charAt(i) == (char) 45 || (char) aux.charAt(i) == (char) 120 || (char) aux.charAt(i) == (char) 246) {
                pos = i;
                signo = (char) aux.charAt(i);
            }
        }

            for (int i = 0; i < pos; i++) {
                if (i < pos)
                    aux2 = Integer.parseInt(String.valueOf(aux.charAt(i)));
            }
            for (int i = 0; i < aux.length(); i++) {
                if (i > pos)
                    aux3 = Integer.parseInt(String.valueOf(aux.charAt(i)));

            }

            if (signo == (char) 43) {
                result = aux2 + aux3;
            } else if (signo == (char) 45) {
                result = aux2 - aux3;
            } else if (signo == (char) 120) {
                result = aux2 * aux3;
            } else if (signo == (char) 246) {
                result = aux2 / aux3;
            }
            textView.setText(result);
        }

    }
