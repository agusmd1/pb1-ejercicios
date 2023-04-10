package ar.edu.unlam.pb1.trabajoPractico03;

public class Alarma {
	private boolean sensorDeMovimiento;
	private boolean sensorDeContacto;
	private boolean sensorDeSonido;
	private boolean encendida;
	private int codigoDeSeguridad;

	public Alarma(int codigoDeSeguridad) {
		this.sensorDeMovimiento = false;
		this.sensorDeContacto = false;
		this.sensorDeSonido = false;
		this.codigoDeSeguridad = codigoDeSeguridad;

	}

	public int getCodigo() {
		return codigoDeSeguridad;
	}

	public void encender(int codigo) {
		if (codigo == codigoDeSeguridad) {
			sensorDeMovimiento = true;
			sensorDeContacto = true;
			sensorDeSonido = true;
			encendida = true;
		} else {
			encendida = false;
		}

	}

	public void apagar(int codigo) {
		if (codigo == codigoDeSeguridad && encendida ==false) {
			sensorDeMovimiento = false;
			sensorDeContacto = false;
			sensorDeSonido = false;
			encendida = false;
		} else
			encendida = true;

	}

	public boolean activada() {
		if (sensorDeMovimiento == true && sensorDeContacto == true && sensorDeSonido == true) {
			return true;
		} else {
			return false;
		}

	}

}
