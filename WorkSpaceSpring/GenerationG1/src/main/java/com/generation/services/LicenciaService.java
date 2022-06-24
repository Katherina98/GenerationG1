package com.generation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Licencia;
import com.generation.repositories.LicenciaRepository;

@Service
public class LicenciaService {

	//Inyeccion de dependencia
	@Autowired
	LicenciaRepository licenciaRepository;
	
	//Guardar información ingresada del objeto.
	public void save(Licencia licencia) {
		licenciaRepository.save(licencia);
		
	}

	public List<Licencia> findAll() {
		//Retorno de la lista de licencias
		return licenciaRepository.findAll();
	}

}
