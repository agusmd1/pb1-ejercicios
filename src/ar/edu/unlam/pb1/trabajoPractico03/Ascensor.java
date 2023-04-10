package ar.edu.unlam.pb1.trabajoPractico03;

import ar.edu.unlam.pb1.trabajoPractico02.Persona;

public class Ascensor {
	private final int PISO_MAXIMO;
	private final int PISO_MINIMO;
	private final double PESO_MAXIMO;
	private final int CAPACIDAD_MAXIMA;
	private boolean puertaAbierta;
	private boolean sobrecarga;
	private static long pisoActual;
	private double pesoActual;
	private int capacidadActual;
	private int cantidadPersonas;

	public Ascensor(int capacidadMaxima, double pesoMaximo) {
		this.PISO_MAXIMO = 10;
		this.PISO_MINIMO = 0;
		this.PESO_MAXIMO = pesoMaximo;
		this.CAPACIDAD_MAXIMA = capacidadMaxima;
		this.puertaAbierta = true;
		this.sobrecarga = false;
		// this.pisoActual = 0;
		this.pesoActual = 0;
		this.capacidadActual = 0;
		this.cantidadPersonas = 0;

	}

	public void ingresar(double peso) {
		if (pesoActual < PESO_MAXIMO) {

			pesoActual += peso;
			cantidadPersonas++;
		}

	}

	public void ingresar(Persona elQueSube) {
		if (elQueSube.pesar() < PESO_MAXIMO) {
			pesoActual += elQueSube.pesar();
			cantidadPersonas++;
		}
	}

	public void salir(double peso) {

		pesoActual -= peso;
		cantidadPersonas--;

	}

	public void salir(Persona elQueBaja) {
		pesoActual -= elQueBaja.pesar();
		cantidadPersonas--;

	}

	public String nombrePersona(Persona elQueSubio) {
		return elQueSubio.getNombre();
	}

	public int cantidadPersonas() {
		return cantidadPersonas;
	}

	public int cantidadPersonasMaxima() {
		return CAPACIDAD_MAXIMA;
	}

	public boolean abrirPuerta() {
		puertaAbierta = true;
		return puertaAbierta;
	}

	public boolean cerrarPuerta() {
		puertaAbierta = false;
		return puertaAbierta;
	}

	public boolean estadoPuerta() {
		return puertaAbierta;
	}

	public long getPisoActual() {
		return pisoActual;
	}

	public double getPeso() {
		return pesoActual;
	}

	public double getPesoMaximo() {
		return PESO_MAXIMO;
	}

	public int getPisoMaximo() {
		return PISO_MAXIMO;
	}

	public int getPisoMinimo() {
		return PISO_MINIMO;
	}

	public long subir() {
		if (puertaAbierta == false && pisoActual < PISO_MAXIMO) {
			pisoActual++;
			return pisoActual;
		} else {
			return pisoActual;
		}
	}

	public long bajar() {
		if (puertaAbierta == false && pisoActual > PISO_MINIMO) {
			pisoActual--;
			return pisoActual;
		} else {
			return pisoActual;
		}
	}

}
