package com.lojadegames.lojadegames.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojadegames.lojadegames.modelos.Categoria;
import com.lojadegames.lojadegames.repositorios.CategoriaRepositorio;

@RestController
@RequestMapping
public class CategoriaControlador {
	
	@Autowired
	private CategoriaRepositorio repositorio;
	
	@GetMapping
	public ResponseEntity<List<Categoria>>ListarTudo (){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Categoria> AcharPorID(@PathVariable long id){
		return repositorio.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> AcharPorDescricao (@PathVariable String descricao){
		return ResponseEntity.ok(repositorio.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping("/novacategoria")
	public ResponseEntity<Categoria> AddCategoria (@Valid @RequestBody Categoria categoria){
		return ResponseEntity.ok(repositorio.save(categoria));
	}
	
	@PutMapping("/atualizarcategoria")
	public ResponseEntity<Categoria> AtualizarCategoria (@Valid @RequestBody Categoria categoria){
		return ResponseEntity.ok(repositorio.save(categoria));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void Deletar (@PathVariable Long id) {
		repositorio.deleteById(id);
	}
}
