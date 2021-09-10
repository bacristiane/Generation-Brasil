package com.blogpessoal.blog.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blogpessoal.blog.modelos.Usuario;
import com.blogpessoal.blog.repositorios.UsuarioRepository;


@Service
public class UserDetailsServiceImplements implements UserDetailsService {
	@Autowired
	private UsuarioRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Usuario> user = userRepository.findByEmail(email);

		user.orElseThrow(() -> new UsernameNotFoundException(email + "Not found."));

		return user.map(UserDetailsImpl::new).get();
	}
}
