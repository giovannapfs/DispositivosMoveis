package edu.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextPeso, editTextAltura;
    TextView textViewResultado;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultado);
        editTextPeso = findViewById(R.id.editTextPeso);
        editTextAltura= findViewById(R.id.editTextAltura);

        btnCalcular = findViewById(R.id.btnCalcular);
    }

    public void CalcularIMC(View view) {
        float peso = Float.parseFloat(editTextPeso.getText().toString());
        float altura = Float.parseFloat(editTextAltura.getText().toString());

        float imc = peso / (altura * altura);

        textViewResultado.setText("seu IMC é: "+ String.format("%.2f", imc));

        setResultColor(imc);
    }

    private void setResultColor(float imc) {
        int color;

        if (imc <17) {
            color = Color.RED;
        } else if (imc < 18.5) {
            color = Color.YELLOW;
        } else if (imc < 25) {
            color = Color.GREEN;
        } else if (imc < 30) {
            color = Color.parseColor("#FFA500");
        } else {
            color = Color.RED;
        }

        textViewResultado.setBackgroundColor(color);
    }
}

