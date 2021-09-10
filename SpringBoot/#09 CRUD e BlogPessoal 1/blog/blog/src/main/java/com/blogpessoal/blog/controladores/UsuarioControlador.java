package com.blogpessoal.blog.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blog.modelos.Usuario;
import com.blogpessoal.blog.modelos.UsuarioLogin;
import com.blogpessoal.blog.repositorios.UsuarioRepository;
import com.blogpessoal.blog.servicos.UsuarioService;



@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping("/login")
	public ResponseEntity<UsuarioLogin> Autentication (@RequestBody Optional<UsuarioLogin> user){
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping ("/cadastro")
	public ResponseEntity<Usuario> novoUsuario (@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.CadastrarUsuario(usuario));
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> pegarTodes() {
		List<Usuario> objetoLista = usuarioRepository.findAll();

		if (objetoLista.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoLista);
		}
	}
	
	@DeleteMapping("/deletar/{id_usuario}")
	public void deletarUsuarioPorId(@PathVariable(value = "id_usuario") Long idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}

}
