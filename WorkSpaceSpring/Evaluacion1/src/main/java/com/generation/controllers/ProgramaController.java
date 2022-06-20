package com.generation.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.generation.models.Programa;
import com.generation.services.ProgramaService;

@Controller
@RequestMapping("/programa")
public class ProgramaController {

	@Autowired
	ProgramaService programaService;
	
	//Ruta1
	@RequestMapping("") 
	public String registro(@ModelAttribute("programa") Programa programa) {

		return "programa.jsp";
	}
	
	//Ruta2
	@PostMapping("/registro")
	public String guardarPrograma(@Valid @ModelAttribute("programa") Programa programa,
			BindingResult resultado, Model model) {
		
		if (resultado.hasErrors()) {
			model.addAttribute ("msgError", "Datos incorrectos, por favor revisar ");
			return "programa.jsp";
		} else {
			
			programaService.savePrograma(programa);
			
			List<Programa> listaProgramas = programaService.findAll();
			model.addAttribute("programasRegistrados", listaProgramas);
			return "tablaProgramas.jsp";
		}
	
	}
	
	//Ruta3
	@RequestMapping("/mostrar")
	public String mostrar(Model model) {
		
		List<Programa> listaProgramas = programaService.findAll();
		model.addAttribute("programasRegistrados", listaProgramas);
		return "tablaProgramas.jsp";
	}
	
	//Ruta4
	@RequestMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, Model model) {
		System.out.println("el id es: "+id);
		Programa programa = programaService.buscarId(id);
		model.addAttribute("programa", programa);
		
		return "editar.jsp";
	}
	
	//Ruta5
	@PostMapping("/actualizar/{id}")
	public String actualizarPrograma(@PathVariable("id") Long id, @Valid @ModelAttribute("programa") Programa programa,
			BindingResult resultado, Model model) {
		
		System.out.println("El id al actualizar es: "+id);
		//agregar el ID al objeto
	
		
		//capturando si existe un error en el ingreso de datos desde el jsp.
		if (resultado.hasErrors()) {
			model.addAttribute ("msgError", "Datos incorrectos, por favor revisar ");
			return "editar.jsp";
		} else {
			programa.setId(id);
				
			programaService.savePrograma(programa);
			List<Programa> listaProgramas = programaService.findAll();
			model.addAttribute("programasRegistrados", listaProgramas);
			return "tablaProgramas.jsp";
		}
	
	}
	
}