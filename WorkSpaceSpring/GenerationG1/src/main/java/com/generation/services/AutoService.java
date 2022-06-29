package com.generation.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;

@Service
@Transactional
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
	public List<Auto> buscarMarca(String marca) {
		//Llamado a un método propio
		//return autoRepository.buscarMarca(marca); //Query tradicional
		return autoRepository.findAllAutoMarca(marca);
	}
	
	//PAGINACION
	//variable estatica, cantidad de datos a mostrar por pagina.
	//numeroPagina
	private static final int LOTE = 5;
	public Page<Auto> paginarAutos(int numeroPagina){
		//deprecado = new PageRequest(...)
		PageRequest pageRequest = PageRequest.of(numeroPagina, LOTE, Sort.Direction.ASC, "marca");
		//otra forma... Page<Auto> autos = autoRepository.findAll(pageRequest);
		return autoRepository.findAll(pageRequest);
	}

}
