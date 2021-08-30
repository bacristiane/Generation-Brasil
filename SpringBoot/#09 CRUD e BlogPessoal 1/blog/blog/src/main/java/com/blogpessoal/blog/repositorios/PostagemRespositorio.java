package com.blogpessoal.blog.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blog.modelos.Postagem;

@Repository
public interface PostagemRespositorio extends JpaRepository <Postagem,Long> {

	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
