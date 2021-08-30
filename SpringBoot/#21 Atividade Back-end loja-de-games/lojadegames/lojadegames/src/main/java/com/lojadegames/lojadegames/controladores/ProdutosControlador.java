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

import com.lojadegames.lojadegames.modelos.Produtos;
import com.lojadegames.lojadegames.repositorios.ProdutosRepositorios;

@RestController
@RequestMapping("/produtos")


public class ProdutosControlador {
	@Autowired
	private ProdutosRepositorios repositorio;
	
	@GetMapping
	public ResponseEntity<List<Produtos>> ListarTudo  (){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
	@GetMapping("/idproduto/{id}")
	public ResponseEntity<Produtos> AcharPorID(@PathVariable long id){
		return repositorio.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricaoproduto/{descricao}")
	public ResponseEntity<List<Produtos>>AcharPorDescricao (@PathVariable String descricao){
		return ResponseEntity.ok(repositorio.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping("/novoproduto")
	public ResponseEntity<Produtos> AddProduto (@Valid @RequestBody Produtos produtos) {
		return ResponseEntity.ok(repositorio.save(produtos));
	}
	
	@PutMapping("/atualizarproduto")
	public ResponseEntity<Produtos> AtualizarProduto (@Valid @RequestBody Produtos produtos){
		return ResponseEntity.ok(repositorio.save(produtos));
	}
	
	@DeleteMapping("/deletarproduto/{id}")
	public void Deletar (@PathVariable Long id) {
		repositorio.deleteById(id);
	}
}
