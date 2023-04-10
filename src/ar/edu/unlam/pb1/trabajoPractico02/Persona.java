package ar.edu.unlam.pb1.trabajoPractico02;

public class Persona {
	private String nombre;
	private String genero;
	private String dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;

	public Persona(String nombre, String genero, String dni, double peso, double altura) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
	}

	public void alimentar(double kilos) {
		peso += kilos;

	}

	public void crecer(double metros) {
		altura += metros;
	}

	public void morir() {
		viva = false;
	}

	public double pesar() {
		return peso;
	}

	public double medir() {
		return altura;
	}

	public void cumpliAnos() {
		edad++;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean esMayorDeEdad() {
		if (edad > 18) {
			return true;
		} else {
			return false;
		}
	}

}
