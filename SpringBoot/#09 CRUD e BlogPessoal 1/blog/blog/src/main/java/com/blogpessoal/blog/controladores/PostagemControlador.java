package com.blogpessoal.blog.controladores;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blog.modelos.Postagem;
import com.blogpessoal.blog.repositorios.PostagemRespositorio;
import com.blogpessoal.blog.servicos.PostagemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/postagem")
@Api(tags = "Controlador de Postagem", description = "Utilitario de Postagens")
@CrossOrigin("*")

public class PostagemControlador {

	private @Autowired PostagemRespositorio repositorio;
	private @Autowired PostagemService servicos;

	@ApiOperation(value = "Busca lista de postagens no sistema")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Retorna lista de postagens"),
			@ApiResponse(code = 204, message = "Retorno sem postagens") })

	@GetMapping("/listarPostagem")
	public ResponseEntity<List<Postagem>> pegarTodos() {
		List<Postagem> objetoLista = repositorio.findAll();

		if (objetoLista.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoLista);
		}
	}

	@ApiOperation(value = "Salva nova postagem no sistema")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Retorna postagem cadastrada"),
			@ApiResponse(code = 400, message = "Erro na requisição: Id Tena ou Id Usuario invalido") })
	
	@PostMapping("/novaPostagem")
	public ResponseEntity<Postagem> salvarNovaPostagem(@Valid @RequestBody Postagem novaPostagem) {
		return ResponseEntity.status(201).body(repositorio.save(novaPostagem));
	}

	@ApiOperation(value = "Busca postagem por Id")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna postagem existente"),
			@ApiResponse(code = 204, message = "Retorno inexistente")
	})
	
	@GetMapping("/{idPostagem}")
	public ResponseEntity<Postagem> buscarId(@PathVariable(value = "idPostagem") long buscaId) {
		Optional<Postagem> objetoId = repositorio.findById(buscaId);
		if (objetoId.isPresent()) {
			return ResponseEntity.status(200).body(objetoId.get());
		} else {
			return ResponseEntity.status(204).build();
		}

	}
	
	@ApiOperation(value = "Busca postagems por Titulo")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna postagems existente ou inexistente"),
			@ApiResponse(code = 204, message = "Retorno inexistente")
	})

	@GetMapping("/titulo/{sTitulo}")
	public ResponseEntity<List<Postagem>> buscarTitulo(@PathVariable(value = "sTitulo") String buscaTitulo) {
		List<Postagem> objetoTitulo = repositorio.findAllByTituloContainingIgnoreCase(buscaTitulo);
		if (objetoTitulo.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {

			return ResponseEntity.status(200).body(objetoTitulo);
		}

	}
	
	@ApiOperation(value = "Busca postagems por Titulo")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna postagems existente ou inexistente"),
			@ApiResponse(code = 204, message = "Retorno inexistente")
	})

	@GetMapping("/pesquisa")
	public ResponseEntity<List<Postagem>> pesquisarTitulo(@RequestParam(defaultValue = "") String pesqTitulo) {
		List<Postagem> objetoTitulo = repositorio.findAllByTituloContainingIgnoreCase(pesqTitulo);
		if (objetoTitulo.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {

			return ResponseEntity.status(200).body(objetoTitulo);
		}
	}
	
	@ApiOperation(value = "Atualizar postagem existente")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Retorna postagem atualizada"),
			@ApiResponse(code = 400, message = "Id de postagem invalida")
	})

	@PutMapping("/atualizar")
	public ResponseEntity<Object> atualizarPostagem(@Valid @RequestBody Postagem postagemParaAtualizar) {
		Optional<?> objetoAlterado = servicos.atualizarPostagem(postagemParaAtualizar);

		if (objetoAlterado.isPresent()) {
			return ResponseEntity.status(201).body(objetoAlterado.get());
		} else {
			return ResponseEntity.status(400).build();
		}
	}
	
	@ApiOperation(value = "Deletar postagem existente")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Caso deletada!"),
			@ApiResponse(code = 400, message = "Id de postagem invalida")
	})

	@DeleteMapping("/deletar/{idPostagem}")
	public ResponseEntity<Object> deletarPostagem(@PathVariable(value = "idPostagem") long buscaId) {

		Optional<Postagem> objetoOptional = repositorio.findById(buscaId);
		if (objetoOptional.isEmpty()) {
			return ResponseEntity.status(400).build();
		} else {
			repositorio.deleteById(buscaId);
			return ResponseEntity.status(200).build();
		}
	}
}
