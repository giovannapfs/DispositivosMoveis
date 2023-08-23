package edu.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.view.View;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome, editTextTelefone, editTextEmail;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextTelefone = findViewById(R.id.editTextTelefone);
        editTextEmail = findViewById(R.id.editTextEmail);

        btnSalvar = findViewById(R.id.btnSalvar);
    }

    public void btnSalvarClicado(View view) {
        String name = editTextNome.getText().toString();
        String email = editTextEmail.getText().toString();
        String telefone = editTextTelefone.getText().toString();

        Log.d("agenda", "Nome: " + name + ", Email: " + email + ", Telefone: " + telefone);

        //limpar a tela após contato criado
        editTextNome.setText("");
        editTextEmail.setText("");
        editTextTelefone.setText("");

        //pop-up de aviso após criar contato
        popUpContatoCriado();
    }

    private void popUpContatoCriado() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Contato Salvo");
        builder.setMessage("O contato foi salvo com sucesso!");
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}