package com.mock;

import java.util.Observer;

public class MockObservadorCarrinho implements ObservadorCarrinho{

    private String nomeRecebido;
    private int valorRecebido;
    private boolean Problema = false;

    @Override
    public void produtoFoiAdcionado(String nome, int valor) {
        if (Problema)
            throw  new RuntimeException("Problema Simulado Pelo Mock");
        this.nomeRecebido = nome;
        this.valorRecebido = valor;
    }

    public void verificaRecebimentoProduto(String nomeEsperado, int valorEsperado ) {
        assert(nomeEsperado.equals(nomeRecebido) && valorEsperado == valorRecebido);

    }

    public void queroQueDeProblema() {
        Problema = true;
    }
}
