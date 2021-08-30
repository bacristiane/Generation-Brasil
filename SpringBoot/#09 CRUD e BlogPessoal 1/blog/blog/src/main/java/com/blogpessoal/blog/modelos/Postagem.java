package com.blogpessoal.blog.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Postagem {

	private @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)long idPostagem;
	private @NotBlank String titulo;
	private @NotBlank String descricao;
	@ManyToOne
	@JoinColumn(name = "criadorId")
	@JsonIgnoreProperties({"minhasPostagens"})
	private Usuarios criador;
	
	public Usuarios getCriador() {
		return criador;
	}
	public void setCriador(Usuarios criador) {
		this.criador = criador;
	}
	public long getIdPostagem() {
		return idPostagem;
	}
	public void setIdPostagem(long idPostagem) {
		this.idPostagem = idPostagem;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
