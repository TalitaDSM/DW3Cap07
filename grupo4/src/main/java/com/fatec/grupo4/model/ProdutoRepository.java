package com.fatec.grupo4.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Produto findByProdutoId(Long codigo);
}
