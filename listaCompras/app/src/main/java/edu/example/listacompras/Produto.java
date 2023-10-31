package edu.example.listacompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Produto {
    private String nomeProduto;
    private String tipoProduto;
    private float quantidade;
    private double precoUnitario;

    public Produto() {
    }

    public Produto(String nomeProduto, String tipoProduto, float quantidade, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeProduto + "\n" +
                "Preço: " + precoUnitario + "\n" +
                "Quantidade: " + quantidade;
    }
}
