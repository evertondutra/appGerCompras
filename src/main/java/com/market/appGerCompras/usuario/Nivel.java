package com.market.appGerCompras.usuario;

public enum Nivel {
    SOL,
    MERCURIO,
    VENUS,
    TERRA,
    MARTE,
    JUPTER,
    SATURNO,
    URANO,
    NETUNO;

    public static Nivel retornarEnumPorPontos(DadosCadastroUsuario dadosUser) {
        if (dadosUser.pontos() < 50) {
            return Nivel.NETUNO;
        } else if (dadosUser.pontos() < 100) {
            return Nivel.URANO;
        } else if (dadosUser.pontos() < 150) {
            return Nivel.SATURNO;
        } else if (dadosUser.pontos() < 200) {
            return Nivel.JUPTER;
        } else if (dadosUser.pontos() < 250) {
            return Nivel.MARTE;
        } else if (dadosUser.pontos() < 300) {
            return Nivel.TERRA;
        } else if (dadosUser.pontos() < 350) {
            return Nivel.VENUS;
        } else if (dadosUser.pontos() < 400) {
            return Nivel.MERCURIO;
        } else {
            return Nivel.SOL;
        }
    }
}
