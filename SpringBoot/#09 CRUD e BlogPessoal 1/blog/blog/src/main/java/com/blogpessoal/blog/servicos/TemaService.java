package com.blogpessoal.blog.servicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.blogpessoal.blog.modelos.Tema;
import com.blogpessoal.blog.repositorios.TemaRespositorio;

@Service
public class TemaService {

	private @Autowired TemaRespositorio repository;
	
	public Optional<Tema> atualizarTema(Tema temaParaAlterar) {
		return repository.findById(temaParaAlterar.getIdTema()).map(temaExistente -> {
			temaExistente.setTema(temaParaAlterar.getTema());
			return Optional.ofNullable(repository.save(temaExistente));
		}).orElseGet(() -> {
			return Optional.empty();
		});
	}
	
	}
