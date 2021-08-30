package com.blogpessoal.blog.servicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogpessoal.blog.modelos.Usuarios;
import com.blogpessoal.blog.repositorios.UsuarioRespositorio;

@Service
public class UsuarioServico {
	@Autowired private UsuarioRespositorio repositorio1;
	
	public Optional<Object>cadastrar(Usuarios novoUsuario){
		return repositorio1.findByEmail(novoUsuario.getEmail()).map(usuarioExistente -> {
			return Optional.empty();
		}).orElseGet(()->{
			return Optional.ofNullable(repositorio1.save(novoUsuario));
		});
	}
		
}
