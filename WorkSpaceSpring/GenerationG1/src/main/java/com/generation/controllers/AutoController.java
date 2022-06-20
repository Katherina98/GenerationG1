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


import com.generation.models.Auto;
import com.generation.services.AutoService;


@Controller
@RequestMapping("/inventario")
public class AutoController {

	
	@Autowired
	AutoService autoService;
	
	@RequestMapping("") 
	public String registro(@ModelAttribute("auto") Auto auto) {

		return "inventario.jsp";
	}
	

	//para capturar el objeto con los atributos ya completos.
	@PostMapping("/auto")
	public String guardarAuto(@Valid @ModelAttribute("auto") Auto auto,
			BindingResult resultado, Model model) {
		
		
		//capturando si existe un error en el ingreso de datos desde el jsp.
		if (resultado.hasErrors()) {
			model.addAttribute ("msgIngresoError", "Datos incorrectos, por favor revisar ");
			return "inventario.jsp";
		} else {
			
		System.out.println(auto.getColor()+" "+auto.getMarca()+" "+auto.getModelo()+" "+auto.getVelocidad());	
			
		
		//enviar el objeto al servicio
				autoService.saveAuto(auto);
		
				//obtener una lista de autos
				List<Auto> listaAutos= autoService.findAll();
				//pasamos una lista de autos al jsp
				model.addAttribute("autosCapturados", listaAutos);
				return "tablaAuto.jsp";
		}
	
	}
	
	//Solo mostrar el listado de autos
	@RequestMapping("/mostrar")
	public String mostrar(Model model) {
		
		//obtener una lista de autos
		List<Auto> listaAutos= autoService.findAll();
		//pasamos una lista de autos al jsp
		model.addAttribute("autosCapturados", listaAutos);
		
		return "tablaAuto.jsp";
	}
	
	@RequestMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, Model model) {
		System.out.println("el id es: "+id);
		//Buscar el id en la base de datos
		Auto auto = autoService.buscarId(id);
		//Pasar los datos al jsp
		model.addAttribute("auto", auto);
		return "editarAuto.jsp";
	}

	//localhost:9080/inventario/actualizar/{id} -> actualizar la persistencia en la base de datos
	@PostMapping("/actualizar/{id}")
	public String actualizarAuto(@PathVariable("id") Long id, @Valid @ModelAttribute("auto") Auto auto,
			BindingResult resultado, Model model) {
		
		System.out.println("El id al actualizar es: "+id);
		//agregar el ID al objeto
	
		//capturando si existe un error en el ingreso de datos desde el jsp.
		if (resultado.hasErrors()) {
			model.addAttribute ("msgIngresoError", "Datos incorrectos, por favor revisar ");
			return "editarAuto.jsp";
		} else {
			auto.setId(id);
				System.out.println(auto.getColor()+" "+auto.getMarca()+" "+auto.getModelo()+" "+auto.getVelocidad());	
				//enviar el objeto al servicio
				autoService.saveAuto(auto);
				return "redirect:/inventario/mostrar";
		}
	
	}
	
	@RequestMapping("/eliminar/{id}")
	public String actualizarAuto(@PathVariable("id") Long id) {
		autoService.eliminarPorId(id);
		return "redirect:/inventario/mostrar";
	}
	
	
	
	
}
