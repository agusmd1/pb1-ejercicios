package ar.edu.unlam.pb1.trabajoPractico04;

public class Letra {

	private char letra;

	public Letra() {

	}

	public boolean esVocal(char letra) {
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			return true;

		} else {
			return false;
		}
	}

}
