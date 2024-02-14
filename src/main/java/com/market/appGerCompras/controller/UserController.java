package com.market.appGerCompras.controller;

import com.market.appGerCompras.usuario.DadosCadastroUsuario;
import com.market.appGerCompras.usuario.DadosListagemUsuario;
import com.market.appGerCompras.usuario.Usuario;
import com.market.appGerCompras.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional   // para ter uma transação ativa com o BD
    public void cadastrar(@RequestBody @Valid DadosCadastroUsuario dadosUser){
        repository.save(new Usuario(dadosUser));
    }

    @GetMapping
    public List<DadosListagemUsuario> listar(){
        // converte uma lista de usuários para uma lista de dadosListagemMusuarios
        return repository.findAll().stream().map(DadosListagemUsuario::new).toList();
    }


}
