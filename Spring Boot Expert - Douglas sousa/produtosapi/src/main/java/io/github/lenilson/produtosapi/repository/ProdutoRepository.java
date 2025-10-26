package io.github.lenilson.produtosapi.repository;

import io.github.lenilson.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
