package com.market.appGerCompras.estabelecimentoGiga;

import com.market.appGerCompras.produto.Estabelecimento;
import com.market.appGerCompras.produto.Medida;

import java.math.BigDecimal;

public record DadosListagemProdutosGiga(String nome, String marca, Medida medida, Estabelecimento estabelecimento,
                                        BigDecimal precoUnidade) {

    public DadosListagemProdutosGiga(Giga produto) {
        this(produto.getNome(), produto.getMarca(), produto.getMedida(), produto.getEstabelecimento(), produto.getPrecoUnidade());
    }
}
