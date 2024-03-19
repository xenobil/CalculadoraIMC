package com.example.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnCalcular;
    private EditText editPeso;
    private EditText editAltura;
      // Projeto de aprendizado
      // Configurando imputText e botão*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcular = findViewById(R.id.btn_calcular);
        editPeso = findViewById(R.id.edit_peso);
        editAltura= findViewById(R.id.edit_altura);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);

                String peso = editPeso.getText().toString();
                String altura = editAltura.getText().toString();

                if (!peso.isEmpty() && !altura.isEmpty()) {
                    intent.putExtra("peso", Double.parseDouble(peso));
                    intent.putExtra("altura", Double.parseDouble(altura));
                }

                startActivity(intent);
            }
        });
    }
}
