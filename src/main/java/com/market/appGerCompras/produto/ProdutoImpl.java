package com.market.appGerCompras.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "produtoImpl")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@Entity(name = "ProdutoImpl" )
public class ProdutoImpl implements Produto {

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

    // Implementação dos métodos da interface

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    // Implemente os outros métodos da interface

    // Getters e setters

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Medida getMedida() {
        return medida;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }
}

