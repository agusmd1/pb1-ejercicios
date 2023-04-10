package ar.edu.unlam.pb1.trabajoPractico03;

public class Cubo {
	private float longitudLado;

	public Cubo(float lado) {
		this.longitudLado = lado;
	}

	public float getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(float longitud) {
		longitudLado = longitud;
	}

	public float getSuperficieCara() {
		float superficie = (longitudLado * longitudLado);
		return superficie;

	}

	public float getVolumen() {
		float volumen = (longitudLado * longitudLado * longitudLado);
		return volumen;

	}

}
