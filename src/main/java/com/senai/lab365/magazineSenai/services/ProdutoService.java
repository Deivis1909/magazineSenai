package com.senai.lab365.magazineSenai.services;

import com.senai.lab365.magazineSenai.models.Produto;
import com.senai.lab365.magazineSenai.repositors.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class  ProdutoService {
    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository){

        //injetando dependencia ProdutoRepository na class prodotoService
        // recebendo ele pronto
        this.repository = repository;

    }

    // salvar no banco sera
    // insert no banco tudo pronto
    public void salvar(Produto produto){

        repository.save(produto);

    }

    public void excluir(Produto produto){
        repository.delete(produto);

    }
    public List<Produto> buscaTodos(){

        return (List<Produto>) repository.findAll();

    }

    // public Produto == public retorna um produto
    public Produto buscaPorId(Long id){

        return repository.findById(id).get();
    }

}
