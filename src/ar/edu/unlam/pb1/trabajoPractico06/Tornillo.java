package ar.edu.unlam.pb1.trabajoPractico06;

public class Tornillo {
	private final char TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;

	public Tornillo(char tipoDeCabeza, int longitud, int cantidadDeRoscas) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRoscas;

	}

	public int getLongitud() {
		return LONGITUD;
	}

	public char getTipoCabeza() {
		return TIPO_DE_CABEZA;
	}

	public boolean girar(char sentido) {
		switch (sentido) {
		case 'H':
			return true;
		case 'A':
			return false;
		}
	}


}
