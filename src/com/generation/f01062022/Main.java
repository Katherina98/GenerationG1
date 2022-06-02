package com.generation.f01062022;

import java.util.ArrayList;
import java.util.List;

import com.generation.f01062022.modelos.Gato;
//Debemos importar para traer la clase desde otro package.
import com.generation.f01062022.modelos.Mascota;
import com.generation.f01062022.modelos.Mishi;
import com.generation.f01062022.modelos.Perro;

public class Main {

	public static void main(String[] args) {
	 //Herencia
	 //Clase superior que le entrega a clases menores sus atributos o médotos. 
		
		Mascota mascota = new Mascota(); 
		mascota.setColor("gris");
		mascota.setNombre("tom");
		
		
		Perro perro = new Perro();
		//perro.setColor("negro");
		perro.setNombre("kira");
		
		//System.out.println(perro.toString());
		
		Gato gato = new Gato();
		gato.setEspecie("felino");
		gato.setPelaje("pelo");
		gato.setGarrasRetractil(true);
		gato.setColor("celeste");
		//System.out.println(gato.toString());
		
		//System.out.println(gato.toString());
		//System.out.println(perro.toString());
		//System.out.println(mascota.toString());
		
		Mishi mishi = new Mishi(true);
		mishi.setColor("rosado");
		//System.out.println(mishi.toString());
		
		//Polimorfismo
		//Cuando un objeto padre se comporta como hijo.
		
		Mascota regalon = new Mascota("gris", "felino", "pelo", "nekito", 3f, "Hembra");
		
		List<Mascota> listaMascotas = new ArrayList<Mascota>();
		listaMascotas.add(regalon);
		
		Mascota felix = new Gato();
		felix.setNombre("felix");
		felix.setColor("negro");
		felix.setPeso(3f);
		listaMascotas.add(felix);
		
		Mascota chocolo = new Perro ();
		chocolo.setNombre("chocolo");
		chocolo.setColor("Cafe"); 
		chocolo.setPeso(5f);
		listaMascotas.add(chocolo);
	
		regalon.hacerSonido();
		chocolo.hacerSonido();
		felix.hacerSonido();

		regalon.mirarhacia();
		chocolo.mirarhacia();
		felix.mirarhacia();
		
		Mascota mishito = new Mishi ();
		mishito.setNombre("Mishito");
		listaMascotas.add(mishito);
		
		//para recorrer la lista de mascotas
		for (Object dato : listaMascotas ) {
            System.out.println(dato);
        }

		//transformar el objeto generico a uno especifico.
		Perro perroChocolo = (Perro) chocolo;
		perroChocolo.setCantPaseos(1);
		
		
		
	}

}
