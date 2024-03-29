package com.market.appGerCompras.estabelecimentoAtacadao;

import com.market.appGerCompras.produto.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "atacadao")
@Entity(name = "Atacadao")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
public class Atacadao implements Produto {

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
    @Enumerated(EnumType.STRING)
    private Estabelecimento estabelecimento;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @Enumerated(EnumType.STRING)
    private Medida medida;

    // Construtor da classe Giga
    public Atacadao(DadosCadastroProdutos dados) {
        this.nome = dados.nome();
        this.marca = dados.marca();
        this.quantidadeItem = dados.quantidadeItem();
        this.quantidadeMedida = dados.quantidadeMedida();
        this.quantidadeKit = dados.quantidadeKit();
        this.precoUnidade = dados.precoUnidade();
        this.precoCx = dados.precoCx();
        this.estabelecimento = dados.estabelecimento();
        this.tipo = dados.tipo();
        this.medida = dados.medida();
    }

}
