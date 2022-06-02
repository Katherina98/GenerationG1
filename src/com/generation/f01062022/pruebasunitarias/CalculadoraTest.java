package com.generation.f01062022.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	//assertEquals(valor esperado,resultado);
	
	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);
		assertEquals(54, resultado);
	}
	
	@Test
	public void testResta() {
		Calculadora calc = new Calculadora();
		int resultado = calc.resta(30, 10);
		assertEquals(20, resultado);
	}
	
	@Test
	public void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		int resultado = calc.multiplicacion(25, 2);
		assertEquals(50, resultado);
	}
	
	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(100, 4);
		assertEquals("25", resultado);
		
		String resultado1 = calc.division(0, 0);
		assertEquals("No se puede dividir por 0", resultado1);
		assertNotNull(resultado);
		assertNotEquals(0, resultado);
		
	}
	
	@Test
	public void testNumPar() {
		Calculadora calc = new Calculadora();
		String resultado = calc.numPar(100);
		assertEquals("numero par", resultado);
		assertNotNull(resultado);
		assertNotEquals(1, resultado);

}
}