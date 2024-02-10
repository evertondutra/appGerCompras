package com.market.appGerCompras.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}


// primeiro o tipo da entidade que o repository vai trabalhar
// segundo é o tipo de atributo da chave primária desta entidade