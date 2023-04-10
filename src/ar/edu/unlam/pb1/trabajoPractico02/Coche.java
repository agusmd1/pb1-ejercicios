package ar.edu.unlam.pb1.trabajoPractico02;

public class Coche {
	private final int CERO_KM;
	private final int ANO_ACTUAL;
	private static int cantidadCoches;
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private int anioDeFabricacion;
	private double precio;

	public Coche(String marca, String modelo, int kilometros, int ano, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometrosActuales = kilometros;
		this.anioDeFabricacion = ano;
		this.precio = precio;
		this.ANO_ACTUAL = 2022;
		this.CERO_KM = 0;
		cantidadCoches++;

	}

	public static int getCantidadCoches() {
		return cantidadCoches;
	}

	public void setKilometrosActuales(int kilometros) {
		kilometrosActuales = kilometros;
	}

	public void setPrecio(double precioIngresado) {
		precio = precioIngresado;
	}

	public double getPrecio() {
		return precio;
	}

	public int calcularAntiguedad() {
		int antiguedad = (ANO_ACTUAL - anioDeFabricacion);
		return antiguedad;
	}

	public int getKilometros() {
		return kilometrosActuales;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

}
