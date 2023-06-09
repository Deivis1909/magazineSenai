package com.senai.lab365.magazineSenai.controllers;

import com.senai.lab365.magazineSenai.models.Produto;
import com.senai.lab365.magazineSenai.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//mapenado a requisicao da url
@RequestMapping("/produtos")
public class ProdutoController {
    // trabalhando endPoint do banco

    @Autowired
    ProdutoService service;

    // sempre que chegar uma requisicao http da url tipo post
    // ele chama essa funcao
    //@requestBody requisicao vai vim no corpo da requisicao http
    @PostMapping
    public void Cadastrar(@RequestBody Produto produto){

        service.salvar(produto);

    }

    // recebe um request body de produto pq vai atualizar produto
    // usando o mesmo save do repository
    @PutMapping
    public void atualizar(@RequestBody Produto produto){
        service.salvar(produto);

    }

    @DeleteMapping
    public void excluir(@RequestBody Produto produto){

        service.excluir(produto);



    }

    @GetMapping("/lista")
    public List<Produto> listaTodos(){
        return service.buscaTodos();

    }



    // {Pegaparamentro} // depois usar o @PatVariable
    @GetMapping("/{id}")
    public Produto buscaporId(@PathVariable Long id){
        return service.buscaPorId(id);

    }



}
