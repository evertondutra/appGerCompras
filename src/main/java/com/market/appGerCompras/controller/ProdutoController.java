package com.market.appGerCompras.controller;

import com.market.appGerCompras.estabelecimento.Atacadao;
import com.market.appGerCompras.estabelecimento.AtacadaoRepository;
import com.market.appGerCompras.estabelecimento.Giga;
import com.market.appGerCompras.estabelecimento.GigaRepository;
import com.market.appGerCompras.produto.DadosCadastroProdutos;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    @Autowired
    private GigaRepository repository;
    @Autowired
    private AtacadaoRepository atacadaoRepository;



    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroProdutos dados){
        switch (dados.estabelecimento()) {
            case "Giga":
                repository.save(new Giga(dados));
                break;
            case "Atacadao":
                atacadaoRepository.save(new Atacadao(dados));
                break;
        }

    }

}
