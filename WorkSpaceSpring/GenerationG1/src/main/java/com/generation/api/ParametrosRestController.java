package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2") //Si dejamos la ruta /api fuera de la clase, establecemos la ruta de inicio por defecto.
public class ParametrosRestController {

	
	//localhost:8080/api?fecha=20220613
	@RequestMapping("")
	public String fecha(@RequestParam(value="fecha") String fecha) {
			return "La fecha es: " + fecha;
	}
	
	//localhost:8080/api/seccion?modulo=3&seccion=5
		@RequestMapping("/seccion")
		public String seccion(@RequestParam(value="modulo") String modulo,
				@RequestParam(value="seccion") String seccion) {
				return "La seccion es: " + seccion + " y el modulo es: " + modulo ;
		}
	
	//localhost:8080/api/usuario?usuario=katherina&id=12&apellido=orellana
		@RequestMapping("/usuario")
		public String usuario(@RequestParam(value="usuario") String usuario, 
				@RequestParam(value="id") String id,
				@RequestParam(value="apellido") String apellido) {
				return "El usuario es: " + usuario + " y su apellido es: " + apellido +" su id es :" + id;
		}
		
	//localhost:8080/api/date?anio=2022&mes=06&dia=13	
		@RequestMapping("/date")
		public String capturarParametros(@RequestParam(value="anio", required=false) String anio,
				@RequestParam(value="mes", required=false) String mes,
				@RequestParam(value="dia", required=false) String dia) {
			
			if(anio != null) {
				System.out.println("El año es: " + anio);
			}
			
			if(mes != null) {
				System.out.println("El mes es: " + mes);
			}
			
			if(dia != null) {
			System.out.println("El dia es: " + dia);
			}
			
			return "El año es: " + anio + " el mes es: " + mes + " el dia es :" + dia;
		}
		
		
		
		
		
		
}
