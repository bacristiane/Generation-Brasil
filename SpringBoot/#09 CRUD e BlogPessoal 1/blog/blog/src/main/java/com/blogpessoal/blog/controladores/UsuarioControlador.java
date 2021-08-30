package com.blogpessoal.blog.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blog.modelos.Usuarios;
import com.blogpessoal.blog.repositorios.UsuarioRespositorio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/usuario")

public class UsuarioControlador {

	private @Autowired UsuarioRespositorio repositorio;
	
	@GetMapping("/listarUsuaries")
	
	public List<Usuarios> listarUsuaries(){
		return repositorio.findAll();
	}
	

}
