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

import com.farmacia.farmacia.model.Produto;
import com.farmacia.farmacia.repository.ProdutoRepository;



@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repositorio;
	
	@GetMapping
	public ResponseEntity<List<Produto>> FindAll(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/idProduto/{id}")
	public ResponseEntity<Produto> FindById (@PathVariable long id){
		return repositorio.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomeProduto/{nome}")
	public ResponseEntity<List<Produto>> FindByNome(@PathVariable String nome){
		return ResponseEntity.ok(repositorio.findAllByNomeContainingIgnoreCase(nome));
	}
    
	@PostMapping("/novoProduto")
	public ResponseEntity<Produto> PostProduto (@RequestBody Produto produto){
		return ResponseEntity.ok(repositorio.save(produto));
	}
	
	@PutMapping("/atualizarProduto")
	public ResponseEntity<Produto> PutCategoria (@RequestBody Produto produto){
		return ResponseEntity.ok(repositorio.save(produto));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void DeleteById (@PathVariable long id){
		repositorio.deleteById(id);
	}
}
