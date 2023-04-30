package com.senai.lab365.magazineSenai.models;


import jakarta.persistence.*;

// FAZENDO O ORM MAPEAMENTO OBJETO RELACIONAL
// TABELA RELACIONAL COM OBJETOS  java jpa

// entity - tabela do banco de dados
@Entity
@Table(name="produtos")
public class Produto {

    // id anotation para dizer que e id e primary key

    //genarate value vai dizer que valor e auto increment se auto gera no banco
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }





    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
