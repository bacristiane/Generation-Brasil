package com.blogpessoal.blog.controladores;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blog.modelos.Usuario;
import com.blogpessoal.blog.modelos.UsuarioLogin;
import com.blogpessoal.blog.repositorios.UsuarioRepository;
import com.blogpessoal.blog.servicos.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("/usuarios")
@Api(tags = "Controlador de Usuario", description = "Utilitario de Usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@ApiOperation(value = "Busca lista de usuarios no sistema")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna lista de usuarios"),
			@ApiResponse(code = 204, message = "Retorno sem usuarios")
	})
	
	@GetMapping
	public ResponseEntity<List<Usuario>> pegarTodes() {
		List<Usuario> objetoLista = usuarioRepository.findAll();

		if (objetoLista.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoLista);
		}
	}
	
	@ApiOperation(value = "Busca usuario por Id")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna usuario existente"),
			@ApiResponse(code = 204, message = "Retorno inexistente")
	})
	@GetMapping("/{idUsuario}")
	public ResponseEntity<Usuario> buscarPorId(@PathVariable(value = "idUsuario") Long idUsuario) {
		Optional<Usuario> objetoUsuario = usuarioRepository.findById(idUsuario);

		if (objetoUsuario.isPresent()) {
			return ResponseEntity.status(200).body(objetoUsuario.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}
	
	@ApiOperation(value = "Autentica usuario no sistema")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Retorna credenciais de usuario"),
			@ApiResponse(code = 400, message = "Erro na requisição ou usuario não credenciado")
	})
	
	@PostMapping("/login")
	public ResponseEntity<UsuarioLogin> Autentication (@RequestBody Optional<UsuarioLogin> user){
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@ApiOperation(value = "Salva novo usuario no sistema")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Retorna usuario cadastrado"),
			@ApiResponse(code = 400, message = "Erro na requisição")
	})
	
	@PostMapping ("/cadastro")
	public ResponseEntity<Usuario> novoUsuario (@RequestBody Usuario usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.CadastrarUsuario(usuario));
	}
	
	@ApiOperation(value = "Atualizar usuario existente")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Retorna usuario atualizado"),
			@ApiResponse(code = 400, message = "Id de usuario invalido")
	})
	
	@PutMapping("/atualizar")
	public ResponseEntity<Object> atualizar(@Valid @RequestBody UsuarioLogin usuarioParaAlterar) {
		Optional<?> objetoAlterado = usuarioService.alterarUsuario(usuarioParaAlterar);

		if (objetoAlterado.isPresent()) {
			return ResponseEntity.status(201).body(objetoAlterado.get());
		} else {
			return ResponseEntity.status(400).build();
		}
	}
	
	@ApiOperation(value = "Deletar usuario existente")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Caso deletado!"),
			@ApiResponse(code = 400, message = "Id de usuario invalido")
	})
	@DeleteMapping("/deletar/{id_usuario}")
	public ResponseEntity<Object> deletarUsuarioPorId(@PathVariable(value = "id_usuario") Long idUsuario) {
		Optional<Usuario> objetoOptional = usuarioRepository.findById(idUsuario);
		if (objetoOptional.isEmpty()) {
			return ResponseEntity.status(400).build();
		} else {
			usuarioRepository.deleteById(idUsuario);
			return ResponseEntity.status(200).build();
		}
	}

}
