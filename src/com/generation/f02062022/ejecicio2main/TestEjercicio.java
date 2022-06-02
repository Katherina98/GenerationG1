package com.generation.f02062022.ejecicio2main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.generation.f01062022.Main;
import com.generation.f02062022.ejercicio2modelos.Administrador;
import com.generation.f02062022.ejercicio2modelos.Secretariado;
import com.generation.f02062022.ejercicio2modelos.Trabajador;

	public class TestEjercicio {

		//assertEquals(valor esperado,resultado);
		
		@Test
		public void testLlamadosYreuniones() {
			Secretariado evaluacion = new Secretariado();
			int resultado = evaluacion.llamadosYreuniones(5, 5);
			assertEquals(10, resultado);
			assertNotNull(evaluacion);
		}
		
		@Test
		public void testCumpleRequisitos() {
			Secretariado evaluacion = new Secretariado();
			String resultado = evaluacion.cumpleRequisitos(true, false);
			assertEquals("No cumple con los requisitos para trabajar en el area", resultado);
		}
		
		@Test
		public void testNominasYfacturas() {
			Administrador evaluacion = new Administrador();
			int resultado = evaluacion.nominasYfacturas(50, 10);
			assertEquals(60, resultado);
			assertNotEquals(10, resultado);
		}
	
		@Test
		public void testCumpleRequisitos2() {
			Administrador evaluacion = new Administrador();
			String resultado = evaluacion.cumpleRequisitos(true, true);
			assertNotEquals("No cumple requisitos para trabajar en el area", resultado);
		}
		
		@Test
		public void testAreaQuePertenece() {
			Trabajador evaluacion = new Trabajador();
			String resultado = evaluacion.areaQuePertenece(9);
			assertEquals("pertenece al area de secretariado", resultado);
		}
		
		
		
		
}
