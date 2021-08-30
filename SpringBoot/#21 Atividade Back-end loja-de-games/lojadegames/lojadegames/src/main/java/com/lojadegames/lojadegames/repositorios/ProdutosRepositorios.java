package com.lojadegames.lojadegames.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lojadegames.lojadegames.modelos.Produtos;

public interface ProdutosRepositorios extends JpaRepository <Produtos,Long> {
	public List<Produtos> findAllByDescricaoContainingIgnoreCase(String descricao);
}
