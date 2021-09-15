package com.blogpessoal.blog.modelos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UsuarioLogin {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuarioL;
	private String nome; 
	private String email;
	private String senha;
	private String token;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public long getIdUsuarioL() {
		return idUsuarioL;
	}
	public void setIdUsuarioL(long idUsuarioL) {
		this.idUsuarioL = idUsuarioL;
	}
	
	
}
