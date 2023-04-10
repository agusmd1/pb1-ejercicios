package ar.edu.unlam.pb1.trabajoPractico09;

public class Ahorcado {

	// hacer un array que guarde la palabra String convertida a char
	// metodologia del jueguito

	private String palabraIngresada;
	private char palabraAAdivinar[];
	private char caracteresIngresados;
	private char letraIngresada;
	private char vasAdivinando;
	private char vasArriesgando;

	public Ahorcado(String palabra) { // constructor

	}

	public void SetPalabraIngresadaPorUsuario(String palabra) {
		palabraIngresada = palabra;
	}

	public String GetPalabraIngresadaPorUsuario() {
		return palabraIngresada;
	}

	private void convertirPalabra() {
		for (int i = 0; i < palabraIngresada.length(); i++) {
			palabraAAdivinar[i] = palabraIngresada.toCharArray();
		}
	}

}
