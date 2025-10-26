package io.github.lenilson.produtosapi.controller;

import io.github.lenilson.produtosapi.model.Produto;
import io.github.lenilson.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){

        var id = java.util.UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        System.out.println("Salvando produto" + produto);
        return produto;

    }
}
