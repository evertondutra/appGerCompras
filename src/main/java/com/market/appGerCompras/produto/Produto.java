package com.market.appGerCompras.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "produtos")
@Entity(name = "Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;
    private int quantidadeItem;
    private int quantidadeMedida;
    private int quantidadeKit;
    private BigDecimal precoUnidade;
    private BigDecimal precoCx;
    private String estabelecimento;

//    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private Medida medida;


    public Produto(DadosCadastroProdutos dados) {
        this.nome = dados.nome();
        this.marca = dados.marca();
        this.quantidadeItem = dados.quantidadeItem();
        this.quantidadeMedida = dados.quantidadeMedida();
        this.quantidadeKit = dados.quantidadeKit();
        this.precoUnidade = dados.precoUnidade();
        this.precoCx = dados.precoCx();
        this.estabelecimento = dados.estabelecimento();

        // retorna o valor total deste produto
//        this.total = BigDecimal.valueOf(dados.quantidadeItem()).multiply(dados.precoUnidade());


        this.tipo = dados.tipo();
        this.medida = dados.medida();

    }
}
