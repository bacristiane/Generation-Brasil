package com.blogpessoal.blog.servicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogpessoal.blog.modelos.Postagem;
import com.blogpessoal.blog.modelos.Tema;
import com.blogpessoal.blog.modelos.Usuario;
import com.blogpessoal.blog.repositorios.PostagemRespositorio;
import com.blogpessoal.blog.repositorios.TemaRespositorio;
import com.blogpessoal.blog.repositorios.UsuarioRepository;

@Service
public class PostagemService {

	private @Autowired PostagemRespositorio repositorioP;
	private @Autowired UsuarioRepository repositorioU;
	private @Autowired TemaRespositorio repositorioT;

	public Optional<?> atualizarPostagem(Postagem postagemParaAlterar) {
		return repositorioP.findById(postagemParaAlterar.getIdPostagem()).map(postagemExistente -> {
			Optional<Usuario> optionalUsuario = repositorioU.findById(postagemParaAlterar.getUsuario().getIdUsuario());
			Optional<Tema> optionalTema = repositorioT.findById(postagemParaAlterar.getTema().getIdTema());
			if (optionalUsuario.isPresent() && optionalTema.isPresent()) {
				postagemExistente.setTitulo(postagemParaAlterar.getTitulo());
				postagemExistente.setDescricao(postagemParaAlterar.getDescricao());
				return Optional.ofNullable(repositorioP.save(postagemExistente));
			} else {
				return Optional.empty();
			}
		}).orElseGet(() -> {
			return Optional.empty();
		});
	}

	public Optional<?> cadastrarPostagem(Postagem novaPostagem) {
		Optional<Tema> objetoExistente = repositorioT.findById(novaPostagem.getTema().getIdTema());
		return repositorioU.findById(novaPostagem.getUsuario().getIdUsuario()).map(usuarioExistente -> {
			if (objetoExistente.isPresent()) {
				novaPostagem.setUsuario(usuarioExistente);
				novaPostagem.setTema(objetoExistente.get());
				return Optional.ofNullable(repositorioP.save(novaPostagem));
			} else {
				return Optional.empty();
			}
		}).orElseGet(() -> {
			return Optional.empty();
		});
	}
}
