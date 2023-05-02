package com.senai.lab365.magazineSenai.services;

import com.senai.lab365.magazineSenai.models.Produto;
import com.senai.lab365.magazineSenai.repositors.ProdutoRepository;
import org.springframework.stereotype.Service;

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
}
