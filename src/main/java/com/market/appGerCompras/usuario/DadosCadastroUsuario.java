package com.market.appGerCompras.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DadosCadastroUsuario(

        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank @Size(min = 7, max = 15)
        String senha) { }
