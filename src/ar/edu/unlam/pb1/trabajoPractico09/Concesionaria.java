package ar.edu.unlam.pb1.trabajoPractico09;

public class Concesionaria {
	private Auto flota[];
	private final int CAPACIDAD_MAXIMA_DE_VEHICULOS;

	private static int cantidadVehiculosAgregados;

	public Concesionaria(int capacidadMaximaVehiculos) {
		this.CAPACIDAD_MAXIMA_DE_VEHICULOS = capacidadMaximaVehiculos;
		this.cantidadVehiculosAgregados = 0;
		this.flota = new Auto[CAPACIDAD_MAXIMA_DE_VEHICULOS];

	}

	public String guardarVehiculo(Auto nuevo) {
		String mensaje = " ";
		if (cantidadVehiculosAgregados < CAPACIDAD_MAXIMA_DE_VEHICULOS) {

			for (int i = 0; i < flota.length; i++) {

				if (flota[i] == null) {
					flota[i] = nuevo;
					cantidadVehiculosAgregados++;
					mensaje += "Autos guardados: " + cantidadVehiculosAgregados + " de "
							+ CAPACIDAD_MAXIMA_DE_VEHICULOS;
					break;

				}
			}
			return mensaje;
		} else {
			mensaje += "No se pueden almacenar mas, esta lleno";
			return mensaje;

		}

	}

	public String verListaDeAutos() {
		String mensaje = " ";
		for (int i = 0; i < flota.length; i++) {
			mensaje += "Codigo de auto: " + (i) + " Marca: " + flota[i].getMarca() + " " + "Modelo: "
					+ flota[i].getModelo() + ",";
		}
		return mensaje;
	}

	public String verAutoEspecifico(byte codigo) {
		String mensaje = " ";

		mensaje += "Codigo de auto: " + (codigo - 1) + " Marca: " + flota[codigo - 1].getMarca() + " " + "Modelo: "
				+ flota[codigo - 1].getModelo();

		return mensaje;
	}

}
