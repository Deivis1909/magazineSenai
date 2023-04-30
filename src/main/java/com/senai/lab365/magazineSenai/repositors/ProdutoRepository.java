package com.senai.lab365.magazineSenai.repositors;

import com.senai.lab365.magazineSenai.models.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto,Long> {

}
