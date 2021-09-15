package com.blogpessoal.blog.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.blogpessoal.blog.modelos.Tema;

@Repository
public interface TemaRespositorio extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByTemaContainingIgnoreCase(String tema);
}
