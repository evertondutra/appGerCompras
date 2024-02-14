package com.market.appGerCompras.usuario;

public record DadosListagemUsuario(String nome, String email, int pontos, Nivel nivel) {

    public DadosListagemUsuario(Usuario usuario) {
        this(usuario.getNome(), usuario.getEmail(), usuario.getPontos(), usuario.getNivel());

    }

}
