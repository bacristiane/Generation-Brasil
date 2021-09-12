package com.blogpessoal.blog.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogpessoal.blog.modelos.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByEmail(String email);
	public Usuario findByNome(String nome);
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
}
