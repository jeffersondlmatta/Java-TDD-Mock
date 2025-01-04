package com.mock;

import java.util.Observer;

public class MockObservadorCarrinho implements ObservadorCarrinho{

    private String nomeRecebido;
    private int valorRecebido;

    @Override
    public void produtoFoiAdcionado(String nome, int valor) {
        this.nomeRecebido = nome;
        this.valorRecebido = valor;
    }

    public void verificaRecebimentoProduto(String nomeEsperado, int valorEsperado ) {
        assert(nomeEsperado.equals(nomeRecebido) && valorEsperado == valorRecebido);

    }
}
