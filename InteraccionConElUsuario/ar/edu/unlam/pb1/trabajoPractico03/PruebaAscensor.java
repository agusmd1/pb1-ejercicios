package ar.edu.unlam.pb1.trabajoPractico03;

import ar.edu.unlam.pb1.trabajoPractico02.Persona;

import java.util.Scanner;

public class PruebaAscensor {

	public static void main(String[] args) {
		Ascensor asc1 = new Ascensor(4, 150);

		Persona pedro = new Persona("Pedro", "Hombre", "40000000", 60, 1.50);
		Persona juan = new Persona("Pedro", "Hombre", "40000000", 80, 1.50);
		Persona carlos = new Persona("Pedro", "Hombre", "40000000", 90, 1.50);

		Scanner teclado = new Scanner(System.in);
		byte botonMenu = 0;
		double botonPeso = 0;

		do {

			System.out.println("**************");
			System.out.println("ascensor");
			System.out.println("**************");
			System.out.println("opciones");
			System.out.println("1- Estado ascensor");
			System.out.println("2- Abrir puerta");
			System.out.println("3- cerrar puerta");
			System.out.println("4- Subir");
			System.out.println("5- bajar");
			System.out.println("6- Ingresar persona");
			System.out.println("7- Baja persona");
			System.out.println("8- salir");
			System.out.println("\n");

			botonMenu = teclado.nextByte();

			switch (botonMenu) {
			case 1:
				System.out.println("\n");
				System.out.println("Estado del ascensor");
				System.out.println("La puerta del ascensor esta abierta: " + asc1.estadoPuerta());
				System.out.println("Cantidad de personas dentro del ascensor: " + asc1.cantidadPersonas());
				System.out.println("Limite de peso actual: " + asc1.getPeso() + " de " + asc1.getPesoMaximo());
				System.out.println("Piso actual: " + asc1.getPisoActual());
				System.out.println("\n");
				break;
			case 2:
				System.out.println("La puerta se ha abierto");
				asc1.abrirPuerta();
				break;
			case 3:
				System.out.println("La puerta se ha cerrado ");
				asc1.cerrarPuerta();
				break;
			case 4:
				if (asc1.estadoPuerta() == false && asc1.getPisoActual() < asc1.getPisoMaximo()) {
					System.out.println("El ascensor ha subido un piso, se encuenta en el piso: " + asc1.subir());
				} else {
					System.out.println("No se puede subir, verifique si se encuentra en el ultimo piso");
					System.out.println("Recuerde que la puerta debe permanecer cerrada");
				}
				break;
			case 5:
				if (asc1.estadoPuerta() == false && asc1.getPisoActual() > asc1.getPisoMinimo()) {
					System.out.println("El ascensor ha bajado un piso, se encuenta en el piso: " + asc1.bajar());
				} else {
					System.out.println("No se puede bajar, verifique si se encuentra en planta baja");
					System.out.println("Recuerde que la puerta debe permanecer cerrada");
				}
			case 6:
				if (asc1.cantidadPersonas() < asc1.cantidadPersonasMaxima()) {
					System.out.println("Cuanto pesa la persona? ");
					botonPeso = teclado.nextDouble();
					asc1.ingresar(botonPeso);
					System.out.println("La persona subio. ");
				} else {
					System.out.println("El ascensor esta lleno o sobrepasa el limite de peso. ");
				}

			}

		} while (botonMenu != 9);
	}

}
