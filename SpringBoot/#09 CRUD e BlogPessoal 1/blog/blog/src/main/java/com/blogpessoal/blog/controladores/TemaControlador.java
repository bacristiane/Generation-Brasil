package com.blogpessoal.blog.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blog.modelos.Tema;
import com.blogpessoal.blog.repositorios.TemaRespositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/tema")

public class TemaControlador {
private @Autowired TemaRespositorio repositorio;
	
	@GetMapping("/listarTema")
	
	public List<Tema> listarTema(){
		return repositorio.findAll();
	}

}
