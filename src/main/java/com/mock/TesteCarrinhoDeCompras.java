package com.mock;

import org.junit.jupiter.api.Test;

public class TesteCarrinhoDeCompras {

    @Test
    public void totalCarrinhoDeCompras() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionarProduto(new Produto("tenis", 200));
        c.adicionarProduto(new Produto("camisa", 300));

    }

    @Test
    public void escutaAdcDeProdutos(){
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        MockObservadorCarrinho mock = new MockObservadorCarrinho();
        c.adicionaObservador(mock);
        c.adicionarProduto(new Produto("tenis", 200));
        mock.verificaRecebimentoProduto("tenis", 200);
    }


}
