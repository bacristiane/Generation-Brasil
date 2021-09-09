package com.lojadegames.lojadegames.servicos;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.lojadegames.lojadegames.modelos.Usuario;
import com.lojadegames.lojadegames.modelos.UsuarioLogin;
import com.lojadegames.lojadegames.repositorios.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario CadastrarUsuario(Usuario novoUsuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(novoUsuario.getSenha());
		novoUsuario.setSenha(senhaEncoder);

		return repository.save(novoUsuario);
	}

	public Optional<UsuarioLogin> Logar(Optional<UsuarioLogin> userParaAuth) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		Optional<Usuario> usuario = repository.findByEmail(userParaAuth.get().getEmail());

		if (usuario.isPresent()) {
			if (encoder.matches(userParaAuth.get().getSenha(), usuario.get().getSenha())) {

				String auth = userParaAuth.get().getEmail() + ":" + userParaAuth.get().getSenha();
				byte[] authBase64 = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(authBase64);

				userParaAuth.get().setToken(authHeader);
				userParaAuth.get().setNome(usuario.get().getNome());

				return userParaAuth;
			}
		}
		return null;
	}
}
