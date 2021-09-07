package com.farmacia.farmacia.controller;

import java.util.List;

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

import com.farmacia.farmacia.model.Categoria;
import com.farmacia.farmacia.repository.CatergoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CatergoriaRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> FindAll(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/idCategoria/{id}")
	public ResponseEntity<Categoria> FindById (@PathVariable long id){
		return repositorio.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomeCategoria/{nome}")
	public ResponseEntity<List<Categoria>> FindByNome(@PathVariable String nome){
		return ResponseEntity.ok(repositorio.findAllByNomeContainingIgnoreCase(nome));
	}
    
	@PostMapping("/novaCategoria")
	public ResponseEntity<Categoria> PostCategoria (@RequestBody Categoria categoria){
		return ResponseEntity.ok(repositorio.save(categoria));
	}
	
	@PutMapping("/atualizarCategoria")
	public ResponseEntity<Categoria> PutCategoria (@RequestBody Categoria categoria){
		return ResponseEntity.ok(repositorio.save(categoria));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void DeleteById (@PathVariable long id){
		repositorio.deleteById(id);
	}
}
