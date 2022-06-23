package com.generation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;

@Service
public class AutoService {

	//Inyeccion de dependencia
	@Autowired
	AutoRepository autoRepository;
	
	//Guardar información ingresada del objeto.
	public void saveAuto(Auto auto) {
		autoRepository.save(auto);
	}
	// Obtener la lista de los objetos registrados. 
	public List<Auto> findAll() {
		return autoRepository.findAll();
	}
	
	public Auto buscarId(Long id) {
		return autoRepository.findById(id).get(); //.get() especifica el tipo de dato que necesitamos(en este caso sería el objeto Auto con sus atributos)
	}
	public void eliminarPorId(Long id) {
		autoRepository.deleteById(id);
		
	}
	
	
}
