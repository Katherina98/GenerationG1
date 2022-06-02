package com.generation.f01062022.modelos;

public class Mishi extends Gato {
	//la palabra extends significa que estamos usando herencia.
	
	private Boolean famosoEnInternet;

	public Mishi() {
	}

	public Mishi(Boolean famosoEnInternet) {
		super();
		this.famosoEnInternet = famosoEnInternet;
	}

	public Boolean getFamosoEnInternet() {
		return famosoEnInternet;
	}

	public void setFamosoEnInternet(Boolean famosoEnInternet) {
		this.famosoEnInternet = famosoEnInternet;
	}

	/*@Override
	public String toString() {
		return "Mishi [famosoEnInternet=" + famosoEnInternet + "]";
	}
 */
	
}
