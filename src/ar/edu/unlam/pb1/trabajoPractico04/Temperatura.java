package ar.edu.unlam.pb1.trabajoPractico04;

public class Temperatura {
	private double celcius;
	private double farenheit;
	private double kelvin;
	private double valor;

	public Temperatura(double valorIngresado) {
		valor = valorIngresado;
	}

	public double getCelcius() {
		return celcius;
	}

	public void setCelcius(double valor) {
		this.celcius = valor;
	}

	public double getFarenheit() {
		return farenheit;
	}

	public void setFarenheit() {
		this.farenheit = (celcius * 1.8) + 32;
	}

	public double getKelvin() {
		return kelvin;
	}

	public void setKelvin() {
		this.kelvin = (celcius + 273.15);
	}

}
