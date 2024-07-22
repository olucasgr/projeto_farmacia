package com.generation.farma.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farma.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Object findAllByNomeContainingIgnoreCase(String nome);
}