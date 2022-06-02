package com.generation.f02062022.ejercicio2modelos;

public class Trabajador {

	private int nPiso;
	private String direccionSede;
	private String nombreJefe;
	
	
	public Trabajador() {
		
	}
	

	public Trabajador(int nPiso, String direccionSede, String nombreJefe) {
		super();
		this.nPiso = nPiso;
		this.direccionSede = direccionSede;
		this.nombreJefe = nombreJefe;
	}



	public int getnPiso() {
		return nPiso;
	}

	public void setnPiso(int nPiso) {
		this.nPiso = nPiso;
	}

	public String getDireccionSede() {
		return direccionSede;
	}

	public void setDireccionSede(String direccionSede) {
		this.direccionSede = direccionSede;
	}

	public String getNombreJefe() {
		return nombreJefe;
	}

	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}

	
	
	@Override
	public String toString() {
		return "Trabajador [nPiso=" + nPiso + ", direccionSede=" + direccionSede
				+ ", nombreJefe=" + nombreJefe + "]";
	}

	public String areaQuePertenece (int piso1) {
		if (piso1 == 9) {
			return "pertenece al area de secretariado";
		}
			return "pertenece al area de administracion";
		
	}
	
}
