package ar.edu.unlam.pb1.trabajoPractico06;

public class Destornillador {
	private final char TIPO_DE_CABEZA;
	private char puntaSeleccionada;

	public Destornillador(char tipoDeCabeza) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
	}

	public void desatornillar(Tornillo tornillo, Tarugo tarugo) {
		while (tornillo.getLongitud() < tarugo.getLongitud()) {

		}

	}

	public void atornillar() {

	}

	public char puntaSeleccionada(char puntaSelect) {
		switch (puntaSelect) {
		case 'P':
			return 'P'; // plana
		case 'H':
			return 'H'; // phillips
		case 'A':
			return 'A'; // allen
		}
		return ' ';
	}

	// hacer atornillar y desatornillar con tornillo y tarugo.

}
