package com.mock;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens = new ArrayList<>();
    private List<ObservadorCarrinho> observadores = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        itens.add(p);
        for(ObservadorCarrinho observador : observadores) {
            try {
                observador.produtoFoiAdcionado(p.getNome(), p.getValor());
            } catch (Exception e) {}
        }
    }
    public int total(){
        int total = 0;
        for (Produto p : itens) {
            total += p.getValor();

        }
        return total;
    }

    public void adicionaObservador(ObservadorCarrinho observador) {
        observadores.add(observador);
    }
}
