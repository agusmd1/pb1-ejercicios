package ar.edu.unlam.pb1.trabajoPractico04;

public class Distancia {
	private byte DECAMETRO;
	private byte HECTOMETRO;
	private byte KILOMETRO;
	private double recorrido;
	private double resultado;

	public Distancia(double valor) {
		recorrido = valor;
	}

	public void setValorInicial(double valorIngresado) {
		recorrido = valorIngresado;

	}

	public double getValorInicial() {
		return recorrido;
	}

	public double convertir(byte unidad) {
		double resultado;

		switch (unidad) {
		case 1:
			resultado = (recorrido / 10);
			return resultado;
		case 2:
			resultado = (recorrido / 100);
			return resultado;
		case 3:
			resultado = (recorrido / 1000);
			return resultado;
		default:
			return resultado = 0;

		}

	}

}
