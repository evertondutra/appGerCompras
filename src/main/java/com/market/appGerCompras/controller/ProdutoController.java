package com.market.appGerCompras.controller;

import com.market.appGerCompras.estabelecimentoAtacadao.Atacadao;
import com.market.appGerCompras.estabelecimentoAtacadao.AtacadaoRepository;
import com.market.appGerCompras.estabelecimentoGiga.DadosListagemProdutosGiga;
import com.market.appGerCompras.estabelecimentoGiga.Giga;
import com.market.appGerCompras.estabelecimentoGiga.GigaRepository;
import com.market.appGerCompras.produto.DadosCadastroProdutos;
import com.market.appGerCompras.produto.DadosListagemTodosProdutos;
import com.market.appGerCompras.produto.ProdutoImpl;
import com.market.appGerCompras.produto.TodosProdutosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    @Autowired
    private GigaRepository repository;
    @Autowired
    private AtacadaoRepository atacadaoRepository;

    @Autowired
    private TodosProdutosRepository todosRepository;


    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        // Log do erro
        // Pode ser útil para gravar o erro em um log para análise posterior
        ex.printStackTrace();

        // Resposta de erro com mensagem personalizada
        String errorMessage = "Erro na digitação de dados. Certifique-se de que os dados estão corretos.";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }


    @PostMapping
    @Transactional
    public ResponseEntity<String> cadastrar(@RequestBody @Valid DadosCadastroProdutos dados) {
        try {
            switch (dados.estabelecimento().toString()) {
                case "GIGA" -> repository.save(new Giga(dados));
                case "ATACADAO" -> atacadaoRepository.save(new Atacadao(dados));
            }
            return ResponseEntity.ok("Produto cadastrado com sucesso.");

        } catch (HttpMessageNotReadableException e) {
            // Lidar com outras exceções aqui
            return handleHttpMessageNotReadableException(e);
        }

    }

//    @GetMapping("/todosprodutos")
//    public Page<DadosListagemProdutosGiga> listar(Pageable paginacao) {
//        // converte uma lista de usuários para uma lista de dadosListagemMusuarios
//        return repository.findAll(paginacao).map(DadosListagemProdutosGiga::new);
//    }

    @GetMapping
    public Page<Object[]> listar(Pageable paginacao) {
        return todosRepository.listarProdutos(paginacao);
    }


}
