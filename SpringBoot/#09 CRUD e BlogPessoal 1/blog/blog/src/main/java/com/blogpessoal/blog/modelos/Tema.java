package com.blogpessoal.blog.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Tema {
	private @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)long idTema;
	private @NotBlank String tema;
	@OneToMany(mappedBy = "tema",cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({"tema"})
	private List<Postagem> postagens = new ArrayList<>();
	
	public List<Postagem> getPostagens() {
		return postagens;
	}
	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}
	public long getIdTema() {
		return idTema;
	}
	public void setIdTema(long idTema) {
		this.idTema = idTema;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
}
