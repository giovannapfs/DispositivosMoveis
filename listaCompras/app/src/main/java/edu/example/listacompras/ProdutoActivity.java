package edu.example.listacompras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ProdutoActivity extends AppCompatActivity {
    private static final String URL_FIREBASE_RTD = "https://listacompras-gigisteps-default-rtdb.firebaseio.com/";

    private EditText txtNome, txtTipo, txtQuantidade, txtPreco;
    private Button btnSalvar, btnPesquisar;
    private List<Produto> listaProdutos;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compras_layout);

        txtNome = findViewById(R.id.txtNome);
        txtTipo = findViewById(R.id.txtTipo);
        txtQuantidade = findViewById(R.id.txtQuantidade);
        txtPreco = findViewById(R.id.txtPreco);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnPesquisar = findViewById(R.id.btnPesquisar);

        listaProdutos = new ArrayList<>();
        databaseReference = FirebaseDatabase.getInstance().getReference();

        btnPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pesquisar();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Produto produto = paraEntidade();
                salvarFirebase(produto);
            }
        });
    }

    private Produto paraEntidade() {
        String nomeProduto = txtNome.getText().toString();
        String tipoProduto = txtTipo.getText().toString();
        float quantidade = Float.parseFloat(txtQuantidade.getText().toString());
        double precoUnitario = Double.parseDouble(txtPreco.getText().toString());

        return new Produto(nomeProduto, tipoProduto, quantidade, precoUnitario);
    }

    private void paraTela(Produto p) {
        txtNome.setText(p.getNomeProduto());
        txtTipo.setText(p.getTipoProduto());
        txtQuantidade.setText(String.valueOf(p.getQuantidade()));
        txtPreco.setText(String.valueOf(p.getPrecoUnitario()));
    }

    private void carregarFirebase() {
        listaProdutos.clear();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Produto produto = dataSnapshot.getValue(Produto.class);
                    listaProdutos.add(produto);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void salvarFirebase(Produto p) {
        String key = databaseReference.push().getKey();
        databaseReference.child(key).setValue(p);
        Toast.makeText(this, "Produto salvo com sucesso.", Toast.LENGTH_SHORT).show();
        carregarFirebase();
    }

    private void pesquisar() {
        String nomePesquisa = txtNome.getText().toString();
        for (Produto p : listaProdutos) {
            if (p.getNomeProduto().contains(nomePesquisa)) {
                paraTela(p);
                break;
            }
        }
    }
}
