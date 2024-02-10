package com.market.appGerCompras.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity(name = "Usuarios")
@Getter  // gera os métodos getters
@NoArgsConstructor  // gera um construtor default
@AllArgsConstructor  // gera um construtor que recebe todos os campos
@EqualsAndHashCode(of = "id")   // ele gera somente em cima do id
public class Usuario {

    // entidade JPA
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;


    public Usuario(DadosCadastroUsuario dadosUser) {
        this.nome = dadosUser.nome();
        this.email = dadosUser.email();
        this.senha = dadosUser.senha();
    }
}
