package ar.edu.unlam.pb1.trabajoPractico03;

public class Nota {
	private float valor;

	public Nota(float valorInicial) {
		this.valor = valorInicial;

	}

	public float getValor() {
		return valor;
	}

	public boolean aprobado() {
		if (valor >= 7) {
			return true;
		} else {
			return false;
		}

	}

	public void recuperar(float nuevoValor) {
		valor = nuevoValor;
	}
	public float recuperar() {
		return valor;
	}
}
