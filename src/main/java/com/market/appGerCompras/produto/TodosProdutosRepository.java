package com.market.appGerCompras.produto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TodosProdutosRepository extends PagingAndSortingRepository<ProdutoImpl, Long> {

    @Query(value = "SELECT nome, marca, preco_unidade, estabelecimento FROM (" +
            "  SELECT p.nome, p.marca, p.preco_unidade, p.estabelecimento FROM atacadao p " +
            "  UNION " +
            "  SELECT p.nome, p.marca, p.preco_unidade, p.estabelecimento FROM giga p " +
            ") AS subquery ORDER BY subquery.nome, subquery.preco_unidade", nativeQuery = true)
    Page<Object[]> listarProdutos(Pageable paginacao);

}
