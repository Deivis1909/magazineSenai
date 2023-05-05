package com.senai.lab365.magazineSenai.repositors;

import com.senai.lab365.magazineSenai.models.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Long> {

    // BUSCA ESPESCIFICA POR DESCRICAO where p.descricao = ao parametro : descricao passado na url
    @Query(value = "SELECT * FROM produtos where p.descricao = :descricao")
    public Produto findByDescricao(String descricao);

    public List<Produto> findByNome(String nome);


}
