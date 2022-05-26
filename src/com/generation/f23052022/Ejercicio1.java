package com.generation.f23052022;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//base * altura/2
		float alturaTriangulo,baseTriangulo,areaTriangulo; 

		alturaTriangulo = 3f; 
		baseTriangulo = 4f;
		
		areaTriangulo = (alturaTriangulo * baseTriangulo)/2; 
		
		//2pi*r
		float radioCirculo, diametroCirculo, diametroRadio, PI, perimetroCirculoR, perimetroCirculoD; 
		radioCirculo = 15f;
		diametroCirculo = 30f;
		diametroRadio = diametroCirculo/2; 
		PI = 3.1416f;
		
		perimetroCirculoR = (2*PI)*radioCirculo; 
		perimetroCirculoD = (2*PI)*diametroCirculo;
		
			System.out.println("***************************");
			System.out.println("*Calculo area de triangulo*");
			System.out.println("***************************");
			System.out.println("");
			System.out.println("El area de un triangulo de base: " + baseTriangulo + ", y de altura: " + alturaTriangulo + ", es: " + areaTriangulo);
			System.out.println("");
			System.out.println("***************************");
			System.out.println("*Calculo perimetro de un circulo*");
			System.out.println("***************************");
			System.out.println("");
			System.out.println("El perimetro de un circulo de radio: " + radioCirculo + ", es:" + perimetroCirculoR);
			System.out.println("");
			System.out.println("El perimetro de un circulo de diametro: " + diametroCirculo + ", es:" + perimetroCirculoD);
			System.out.println("****************************");
			}

}

