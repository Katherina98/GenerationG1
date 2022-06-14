package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//http://localhost:8080/usuario -- Luego del / debemos indicar la ruta, por ejemplo usuario.
//@RequestMapping("/usuario")
//Anotacion para capturar las rutas, se debe indicar con anotaciones e importar.

public class EnrutamientoRestController {

	/**Enrutamientos*/
	@RequestMapping("/usuario")
	public String usuario() {
		return "Estamos en la URL usuario";
	}

	@RequestMapping("/usuario/inscrito")
	public String inscrito() {
		return "Estamos en la URL usuario/inscrito";
	}

	@RequestMapping("/cliente/registrado")
	public String cliente() {
		return "Ruta de cliente";
	}

	@RequestMapping(value = "/proveedor/registrado", method= RequestMethod.GET)
	public String proveedor() {
		return "Ruta de proveedor";
	}
	
	
	
}
