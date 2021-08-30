package com.lojadegames.lojadegames.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojadegames.lojadegames.modelos.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository <Categoria,Long> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}
