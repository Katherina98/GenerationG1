package com.generation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Licencia;
import com.generation.models.Usuario;
import com.generation.services.LicenciaService;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/licencia")
public class LicenciaController {

	@Autowired
	LicenciaService licenciaService;
	
	@Autowired
	UsuarioService usuarioService;
	
	//Desplegamos el jsp con la licencia sin datos.
	@RequestMapping("")
	public String despliegue(Model model) {
		Licencia licencia = new Licencia();
		model.addAttribute("licencia", licencia);
		//licencia.setEstado("Activo");
		
		//Pasamos una lista de usuarios al jsp a través del model.addAttribute.
		List<Usuario> listaUsuarios = usuarioService.findAll();
		model.addAttribute("listaUsuarios", listaUsuarios);
		
		//enviar una lista de licencias al jsp
		List<Licencia> listaLicencias = licenciaService.findAll();
		model.addAttribute("listaLicencias", listaLicencias);
		
		return "licencia.jsp";
	}
	
	@RequestMapping("/guardar")
	public String guardarLicencia(@ModelAttribute("Licencia") Licencia licencia) {
		
		licenciaService.save(licencia);
		return "redirect:/licencia";
	}
	
	
}
