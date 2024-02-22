package com.market.appGerCompras.estabelecimentoAtacadao;

import com.market.appGerCompras.produto.Estabelecimento;
import com.market.appGerCompras.produto.Medida;

import java.math.BigDecimal;

public record DadosListagemProdutosAtacadao(String nome, String marca, Medida medida, BigDecimal precoUnidade,
                                            Estabelecimento estabelecimento) {

    public DadosListagemProdutosAtacadao(Atacadao produto) {
        this(produto.getNome(), produto.getMarca(), produto.getMedida(), produto.getPrecoUnidade(),
                produto.getEstabelecimento());
    }
}
