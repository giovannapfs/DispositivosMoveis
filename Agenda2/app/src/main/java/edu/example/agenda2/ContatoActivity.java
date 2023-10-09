package edu.example.agenda2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ContatoActivity extends AppCompatActivity {

    private EditText txtNome, txtEmail, txtTelefone;
    private Button btnGravar, btnPesquisar;

    private List<Contato> listaContatos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contato_activity);

        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtTelefone = findViewById(R.id.txtTelefone);
        btnGravar = findViewById(R.id.btnGravar);
        btnPesquisar = findViewById(R.id.btnPesquisar);

        btnGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarContato();
            }
        });

        btnPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pesquisarContato();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        carregarPrefs();
    }

    private void salvarContato() {
        String nome = txtNome.getText().toString();
        String email = txtEmail.getText().toString();
        String telefone = txtTelefone.getText().toString();

        if (!nome.isEmpty()) {
            Contato contato = new Contato(System.currentTimeMillis(), nome, email, telefone);
            listaContatos.add(contato);
            salvarPrefs();
            limparCampos();
            Toast.makeText(this, "Contato gravado com sucesso", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Digite o nome do contato", Toast.LENGTH_SHORT).show();
        }
    }

    private void pesquisarContato() {
        String nomePesquisa = txtNome.getText().toString();

        if (nomePesquisa.isEmpty()) {
            Toast.makeText(this, "Digite para pesquisar", Toast.LENGTH_SHORT).show();
        } else {
            for (Contato contato : listaContatos) {
                if (contato.getNome().contains(nomePesquisa)) {
                    txtNome.setText(contato.getNome());
                    txtEmail.setText(contato.getEmail());
                    txtTelefone.setText(contato.getTelefone());
                    return;
                }
            }

            limparCampos();
            Toast.makeText(this, "Contato não encontrado", Toast.LENGTH_SHORT).show();
        }
    }

    private void salvarPrefs() {
        SharedPreferences sharedPreferences = getSharedPreferences("Contatos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        StringBuilder contatosStr = new StringBuilder();

        for (Contato contato : listaContatos) {
            contatosStr.append(contato.getId()).append(",")
                    .append(contato.getNome()).append(",")
                    .append(contato.getEmail()).append(",")
                    .append(contato.getTelefone()).append(";");
        }

        editor.putString("contatos", contatosStr.toString());
        editor.apply();
    }

    private void carregarPrefs() {
        SharedPreferences sharedPreferences = getSharedPreferences("Contatos", Context.MODE_PRIVATE);
        String contatosStr = sharedPreferences.getString("contatos", "");

        if (!contatosStr.isEmpty()) {
            listaContatos.clear();
            String[] contatosArray = contatosStr.split(";");

            for (String contatoStr : contatosArray) {
                String[] campos = contatoStr.split(",");
                if (campos.length == 4) {
                    Contato contato = new Contato(
                            Long.parseLong(campos[0]),
                            campos[1],
                            campos[2],
                            campos[3]
                    );
                    listaContatos.add(contato);
                }
            }
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
    }
}
