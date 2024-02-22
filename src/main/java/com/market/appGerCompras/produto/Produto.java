package com.market.appGerCompras.produto;

import java.math.BigDecimal;


public interface Produto {

    Long getId();

    String getNome();

    String getMarca();

    int getQuantidadeItem();

    int getQuantidadeMedida();

    int getQuantidadeKit();

    BigDecimal getPrecoUnidade();

    BigDecimal getPrecoCx();

    Estabelecimento getEstabelecimento();

    Tipo getTipo();

    Medida getMedida();

    // Remova o construtor da classe original, pois interfaces não podem ter construtores
    // public Produto(DadosCadastroProdutos dados);

    // Adicione outros métodos conforme necessário para operações relacionadas a produtos
}
