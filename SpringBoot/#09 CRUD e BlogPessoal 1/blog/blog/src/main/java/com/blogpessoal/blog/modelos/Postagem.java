package com.blogpessoal.blog.modelos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Postagem {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long idPostagem;
	private @NotBlank String titulo;
	private @NotBlank String descricao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	
	@ManyToOne
	@JsonIgnoreProperties({"postagens"})
	private Usuario usuario;

	@ManyToOne
	@JsonIgnoreProperties({"postagens"})
	private Tema tema;
	
	
	
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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
