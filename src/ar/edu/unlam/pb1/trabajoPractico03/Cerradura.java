package ar.edu.unlam.pb1.trabajoPractico03;

public class Cerradura {
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean estado;
	private boolean bloqueada;
	private int contadorDeFallos;

	public Cerradura(int claveDeApertura, int cantidadDeFallosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosQueLaBloquean;
		this.estado = false;
		this.bloqueada = false;
		this.contadorDeFallos = 0;

	}

	public boolean abrir(int clave) {
		if (clave == claveDeApertura && bloqueada == false) {
			estado = true;
			return estado;
		} else {

			estado = false;
			contadorDeFallos++;
			return estado;

		}
	}

	public boolean cerrar(int clave) {
		if (claveDeApertura == clave) {
			estado = false;
			return estado;
		} else {

			estado = true;
			contadorDeFallos++;
			return estado;
		}
	}

	public boolean estaAbierta() {
		if (estado == true) {
			return true;
		} else {
			return false;
		}
	}

	public int getClave() {
		return claveDeApertura;
	}

	public boolean getEstado() {
		return estado;
	}

	public int getFallos() {
		return contadorDeFallos;
	}

	public boolean fueBloqueada() {
		if (contadorDeFallos >= cantidadDeFallosConsecutivosQueLaBloquean) {
			bloqueada = true;
			return bloqueada;
		} else {
			bloqueada = false;
			return bloqueada;
		}
	}
	public int getFallosMaximos() {
		return cantidadDeFallosConsecutivosQueLaBloquean;
	}

}
