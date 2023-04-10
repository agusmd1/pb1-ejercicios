package ar.edu.unlam.pb1.trabajoPractico02;

public class Calculadora {
	private double operador1;
	private double operador2;
	private boolean esPositivo;
	private double resultado;

	public Calculadora() {
		this.operador1 = 0;
		this.operador2 = 0;
	}

	public double sumar(double operador1, double operador2) {
		resultado = (operador1 + operador2);
		return resultado;
	}

	public double restar(double operador1, double operador2) {
		resultado = operador1 - operador2;
		return resultado;
	}

	public double multiplicar(double operador1, double operador2) {
		resultado = operador1 * operador2;
		return resultado;
	}

	public double dividir(double operador1, double operador2) {

		resultado = (operador1 / operador2);
		return resultado;

	}

	public boolean esPositivo() {
		if (resultado > 0) {
			esPositivo = true;
			return esPositivo;
		}
		esPositivo = false;
		return esPositivo;
	}

}
