package io.github.lenilson.produtosapi.controller;

import io.github.lenilson.produtosapi.model.Produto;
import io.github.lenilson.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Produto obterProduto(@PathVariable("id") String id){
        System.out.println("Obtendo produto com id: " + id);
        return produtoRepository.findById(id).orElse(null);

    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id){
        produtoRepository.deleteById(id);
        System.out.println("Deletando produto com id: " + id);
    }

    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") String id,
                          @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
        System.out.println("Atualizando produto com id: " + id);

    }
}
