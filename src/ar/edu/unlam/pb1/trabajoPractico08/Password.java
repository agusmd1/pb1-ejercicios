package ar.edu.unlam.pb1.trabajoPractico08;

public class Password {
	private int longitud;
	private int contrasena;

	public Password() {
		this.longitud = 8;
	}

	public Password(int longitudIngresada) {
		this.longitud = longitudIngresada;
	}

	public boolean esFuerte() {
		// para que sea fuerte fuerte debe tener 2 mayusculas, mas de 1 minuscula y mas
		// de 5 numeros
	}

	public String generarContrasena() {
		// genera contrasenia con la longitud que tenga
	}

	public void setLongitud(int longitudManual) {
		longitud = longitudManual;
	}

}
