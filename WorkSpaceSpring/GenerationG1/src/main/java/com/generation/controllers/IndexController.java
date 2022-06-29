package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Usuario;

//Para establecer nuestra ruta controlador se debe indicar con anotaciones e importar.

@Controller
public class IndexController {
	
	//http://localhost:8080/ -- Con el / indicamos que es nuestra página por default.	
	@RequestMapping("/") 
	public String index(Model model) {
		model.addAttribute("apellidos", "Orellana Silva");
		model.addAttribute("nombres", "Katherina Scarlett");
		model.addAttribute("edad", 24);
		
		Usuario usuario = new Usuario("Ana", "Morales", 29, "1234*");
		model.addAttribute("usuario", usuario);
		
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Mario");
		usuario1.setApellido("Lopez");
		usuario1.setEdad(25);
		
		model.addAttribute("usuario1", usuario1);
		
		
		return "index.jsp";
	
	}
}
