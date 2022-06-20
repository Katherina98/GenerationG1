package com.generation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Programa;
import com.generation.repositories.ProgramaRepository;

@Service
public class ProgramaService {

		@Autowired
		ProgramaRepository programaRepository;

		public void savePrograma(Programa programa) {
			programaRepository.save(programa);
			
		}

		public List<Programa> findAll() {
			return programaRepository.findAll();
		}

		public Programa buscarId(Long id) {
			return programaRepository.findById(id).get();
		}
	
		
		
}
