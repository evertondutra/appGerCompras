package com.market.appGerCompras.controller;


import com.market.appGerCompras.estabelecimentoGiga.DadosListagemProdutosGiga;
import com.market.appGerCompras.estabelecimentoGiga.GigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/giga")
public class GigaController {


    @Autowired
    private GigaRepository repository;


    @GetMapping
    public Page<DadosListagemProdutosGiga> listar(Pageable paginacao) {
        // converte uma lista de usuários para uma lista de dadosListagemMusuarios
        return repository.findAll(paginacao).map(DadosListagemProdutosGiga::new);
    }

}