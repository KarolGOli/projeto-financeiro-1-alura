package br.com.example.appfinancas.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.example.appfinancas.controller.dto.UsuarioDto;
import br.com.example.appfinancas.modelo.Usuario;
import br.com.example.appfinancas.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;

	@PostMapping
	public ResponseEntity<UsuarioDto> addUsuario (@RequestBody Usuario usuario, UriComponentsBuilder uriBuilder){
		Usuario usuarioSalvo = usuarioRepository.save(usuario);

		URI uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuarioSalvo.getId()).toUri();
		return ResponseEntity.created(uri).body(new UsuarioDto(usuarioSalvo));

	}
	
}
