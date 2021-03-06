package com.generation.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var") //localhost:8080/var -> path de inicio por default
public class PathVariablesRestController {
	/**capturar variables desde la ruta o path*/ 
	
	
	//localhost:8080/var/anio/2022/mes/06/dia/13
	@RequestMapping("/anio/{a}/mes/{m}/dia/{d}")
	public String capturarVariablesPath(@PathVariable("a") String anio,
			@PathVariable("m") String mes,
			@PathVariable("d") String dia) {
		return "La fecha es : " + anio + mes + dia;
	}
	
	
	//localhost:8080/var/fecha/2023/6/13
	//localhost:8080/var/fecha/{anio}/{mes}/{dia}

	@RequestMapping("/fecha/{a}/{m}/{d}")
	public String capturarVariablesDinamicas(@PathVariable("a") String a,
			@PathVariable("m") String m,
			@PathVariable("d") String d) {
		return "La fecha es : " + a + m + d;
	}

}
