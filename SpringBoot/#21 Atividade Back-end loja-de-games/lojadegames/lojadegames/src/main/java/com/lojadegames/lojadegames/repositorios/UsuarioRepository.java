package com.lojadegames.lojadegames.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadegames.lojadegames.modelos.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);
}
