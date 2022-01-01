package br.com.example.appfinancas.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.example.appfinancas.modelo.Usuario;

public class UsuarioDto {

	private Long id;
	private String nome;

	public UsuarioDto(Usuario usuario){
		this.id = usuario.getId();
		this.nome = usuario.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public static List<UsuarioDto> converter(List<Usuario> usuario) {
		return usuario.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
