package com.market.appGerCompras.controller;


import com.market.appGerCompras.estabelecimentoAtacadao.AtacadaoRepository;
import com.market.appGerCompras.estabelecimentoAtacadao.DadosListagemProdutosAtacadao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atacadao")
public class AtacadaoController {

    @Autowired
    private AtacadaoRepository atacadaoRepository;


    @GetMapping
    public Page<DadosListagemProdutosAtacadao> listar(Pageable paginacao) {
        // converte uma lista de usuários para uma lista de dadosListagemMusuarios
        return atacadaoRepository.findAll(paginacao).map(DadosListagemProdutosAtacadao::new);
    }

}
