package com.generation.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
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
	public boolean saveUsuario(Usuario usuario) {
		//validaciones de insercion
		//Paso 1.Validar si email existe en la base de datos
		Usuario existeUsuario = usuarioRepository.findByEmail(usuario.getEmail());
		
			//si no existe el usuario, lo creamos y retornamos un false.
			if(existeUsuario == null) {
				
				//Paso 2.Encriptar el password.
				//Al encriptar nuestra password lo convierte en caracteres alfanumericos ej: 11112 -> asd213!3asd$%%&&
				String passwordEncriptado = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
				usuario.setPassword(passwordEncriptado);
				
				usuarioRepository.save(usuario);
				return false; //si retornamos false significa que no hubo problema.
			}
			//si existe el usuario, retornamos un boolean true.
			else {
				return true; //si retornamos true significa que el usuario existe un error en la creacion.
			}
	}
	//Obtener la lista de los objetos registrados.
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	
	public boolean validarUsuario(String email, String password) {
		boolean error = true;
		// verificar el email
		Usuario existeUsuario = usuarioRepository.findByEmail(email);
		if (existeUsuario == null) {//no existe el usuario, error de ingreso
			error = true;
		}else {
			// verificar password contra password base datos desencriptada
			if(BCrypt.checkpw(password, existeUsuario.getPassword())) {
				//password iguales, email y password igual a la base datos
				error= false;
			}else {
				//password distintos, error 
				error = true;
			}
		}
		return error;
	}

}