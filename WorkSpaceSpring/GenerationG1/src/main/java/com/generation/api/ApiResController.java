package com.generation.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.generation.models.Auto;
import com.generation.services.AutoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class ApiResController {

	@Autowired
	AutoService autoService;
	
	@RequestMapping("/obtener/auto")
	public List<Auto> obtenerListaAutos(){
		List<Auto> listaAutos = autoService.findAll();
		return listaAutos;
	}
	
}
