package com.blogpessoal.blog.controladores;

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

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/postagem")

public class PostagemControlador {
	
private @Autowired PostagemRespositorio repositorio;
	
	@GetMapping("/listarPostagem")
	public List<Postagem> listarPostagem(){
		return repositorio.findAll();
	}
	
	@PostMapping ("/salvar")
	public ResponseEntity<Postagem>salvar(@Valid @RequestBody Postagem novaPostagem){
		return ResponseEntity.status(201).body(repositorio.save(novaPostagem));
	}
	
	@GetMapping("/{idPostagem}")
	public ResponseEntity<Postagem>buscarId(@PathVariable(value="idPostagem")long buscaId){
		Optional<Postagem> objetoId = repositorio.findById(buscaId);
		if (objetoId.isPresent()) {
			return ResponseEntity.status(200).body(objetoId.get());
		}
		else {
			return ResponseEntity.status(204).build();
		}
	
	}
	
	@GetMapping("/titulo/{sTitulo}")
	public ResponseEntity<List<Postagem>>buscarTitulo(@PathVariable(value="sTitulo")String buscaTitulo){
		List<Postagem> objetoTitulo = repositorio.findAllByTituloContainingIgnoreCase(buscaTitulo);
		if (objetoTitulo.isEmpty()) {
			return ResponseEntity.status(204).build();
		}
		else {
			
			return ResponseEntity.status(200).body(objetoTitulo);
		}
	
	}
	@GetMapping("/pesquisa")
	public ResponseEntity<List<Postagem>>buscar(@RequestParam(defaultValue="")String pesqTitulo){
		List<Postagem> objetoTitulo = repositorio.findAllByTituloContainingIgnoreCase(pesqTitulo);
		if (objetoTitulo.isEmpty()) {
			return ResponseEntity.status(204).build();
		}
		else {
			
			return ResponseEntity.status(200).body(objetoTitulo);
		}
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Postagem>atualizar(@Valid @RequestBody Postagem atuaPostagem){
		return ResponseEntity.status(201).body(repositorio.save(atuaPostagem));
	}
	
	@DeleteMapping("/deletar/{idPostagem}")
	public void deletarPostagem(@PathVariable (value="idPostagem")long buscaId) {
		repositorio.deleteById(buscaId);
	}
}
