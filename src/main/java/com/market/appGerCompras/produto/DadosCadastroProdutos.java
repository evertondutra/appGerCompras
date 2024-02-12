package com.market.appGerCompras.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosCadastroProdutos(

        @NotBlank
        String nome,
        @NotBlank
        String marca,
        Tipo tipo,
        @NotNull
        int quantidadeItem,
        @NotNull
        int quantidadeMedida,
        Medida medida,
        int quantidadeKit,
        @NotNull
        BigDecimal precoUnidade,
        BigDecimal precoCx,
        @NotBlank
        String estabelecimento

//        BigDecimal total
) {

}
