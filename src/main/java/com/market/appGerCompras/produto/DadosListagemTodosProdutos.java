package com.market.appGerCompras.produto;

import java.math.BigDecimal;

public record DadosListagemTodosProdutos(String nome, String marca, BigDecimal precoUnidade, Estabelecimento estabelecimento) {

    public DadosListagemTodosProdutos (ProdutoImpl produto){
        this(produto.getNome(), produto.getMarca(), produto.getPrecoUnidade(), produto.getEstabelecimento());
    }
}
