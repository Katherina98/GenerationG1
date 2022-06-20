package com.generation.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;

/**@Service Logica de negocio o validaciones del sistema*/
@Service
public class UsuarioService {
	
	/**llamar al repository (inyeccion de dependencia)*/
	@Autowired 
	UsuarioRepository usuarioRepository;
	
	//Guardar información ingresada del objeto.
	public void saveUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);	
	}
	//Obtener la lista de los objetos registrados.
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

}
