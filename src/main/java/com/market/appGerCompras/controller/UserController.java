package com.market.appGerCompras.controller;

import com.market.appGerCompras.usuario.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional   // para ter uma transação ativa com o BD
    public void cadastrar(@RequestBody @Valid DadosCadastroUsuario dadosUser) {
        repository.save(new Usuario(dadosUser));
    }

    @GetMapping
    public Page<DadosListagemUsuario> listar(Pageable paginacao) {
        // converte uma lista de usuários para uma lista de dadosListagemMusuarios
        return repository.findAll(paginacao).map(DadosListagemUsuario::new);
    }

//    @GetMapping("/{nivel}")
//    public List<DadosListagemUsuario> listarUsuarioNivel(@PathVariable String nivel) {
//        // Converte uma lista de usuários para uma lista de dadosListagemMusuarios
//        return repository.findAll().stream()
//                .filter(usuario -> nivel.equalsIgnoreCase(usuario.getNivel().name())) // Comparação com o nome do Enum
//                .map(DadosListagemUsuario::new)
//                .collect(Collectors.toList());
//    }

    @GetMapping("/{nivel}")
    public Page<DadosListagemUsuario> listarUsuarioNivel(@PathVariable Nivel nivel, Pageable paginacao) {
        // Use o método do repositório para buscar usuários por nível e aplicar paginação
        Page<Usuario> usuariosPorNivel = repository.findByNivel(nivel, paginacao);

        // Converta a Page de usuários para uma Page de DadosListagemUsuario
        return usuariosPorNivel.map(DadosListagemUsuario::new);
    }

}
