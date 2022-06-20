package com.generation.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Auto;
import com.generation.models.Usuario;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/registro") 
public class RegistroController {
	
	//inyeccion de dependencia.
	@Autowired
	UsuarioService usuarioService;

	//para entregar el objeto usuario vacio al formulario.
	@RequestMapping("") 
	public String registro(@ModelAttribute("usuario") Usuario usuario) {

		return "registro.jsp";
	}
	
	//ruta para capturar datos del formulario
	@PostMapping("/usuario/respaldo") 
	public String registroUsuario(@RequestParam(value= "nombre") String nombre,
	@RequestParam(value= "apellido") String apellido, 
	@RequestParam(value= "edad") String edad)	{
		System.out.println("Los datos del usuario ingresado son: ");
		System.out.println("Nombre= " + nombre + " \nApellido= " + apellido + " \nEdad= " + edad);
		return "registro.jsp";
	}
	
	//para capturar el objeto con los atributos ya completos.
	@PostMapping("/usuario")
	public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
			BindingResult resultado, Model model) {
		
		//capturando si existe un error en el ingreso de datos desde el jsp.	
		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Debe ingresar los datos correctamente");
			return "registro.jsp";
		}else {
		
		System.out.println(usuario.getNombre()+" "+usuario.getApellido()+" "+usuario.getEdad()+" "+usuario.getPassword());
		
		//enviar el objeto al servicio
		usuarioService.saveUsuario(usuario);
		
		//obtener una lista de usuarios
		List<Usuario> listaUsuarios= usuarioService.findAll();
		//pasamos una lista de autos al jsp
		model.addAttribute("usuariosTabla", listaUsuarios);
			return "index.jsp";
		}
	}

}
