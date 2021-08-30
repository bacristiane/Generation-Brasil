package com.blogpessoal.blog.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blog.modelos.Usuarios;

@Repository
public interface UsuarioRespositorio extends JpaRepository <Usuarios,Long> {
	Optional<Usuarios>findByEmail (String email);

}
