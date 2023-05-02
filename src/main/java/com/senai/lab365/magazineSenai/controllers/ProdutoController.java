package com.senai.lab365.magazineSenai.controllers;

import com.senai.lab365.magazineSenai.models.Produto;
import com.senai.lab365.magazineSenai.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
