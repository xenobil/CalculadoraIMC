package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textPeso;
    private TextView textAltura;
    private TextView textResultado;
// implementando a lógica*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        textPeso = findViewById(R.id.peso);
        textAltura = findViewById(R.id.altura);
        textResultado = findViewById(R.id.text_resultado);

        Bundle bundle = getIntent(). getExtras();
        if (bundle != null){
            double peso = bundle.getDouble("peso");
            double altura = bundle.getDouble("altura");
            textPeso.setText("Peso informado " + peso + " kg");
            textAltura.setText("Altura informada " + altura + " m");
            double imc = peso / (altura * altura);
            DecimalFormat decimalFormat = new DecimalFormat("#.#"); // Define o formato para um decimal
            String imcArredondado = decimalFormat.format(imc); // Arredonda o IMC para um decimal

            String resultado;

            if (imc < 18.5) {
                resultado = "Seu IMC é : " + imcArredondado + "  Você está abaixo do peso" ;
            }
            else if (imc >= 18.5 && imc <= 24.9){
                resultado = "Seu IMC é : " + imcArredondado + "  Você está normal";
            }
            else if (imc >= 24.9 && imc <=29.9){
                resultado = "Seu IMC é : " + imcArredondado + "  Você está com nobrepeso";
            }
            else {
                resultado ="Seu IMC é : " + imcArredondado + "  Você está nbeso";
            }
            textResultado.setText(resultado);
        }

    }
}