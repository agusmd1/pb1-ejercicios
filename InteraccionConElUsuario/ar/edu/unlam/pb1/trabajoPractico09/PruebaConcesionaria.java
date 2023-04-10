package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class PruebaConcesionaria {
	public static void main(String[] args) {
		Concesionaria novo = new Concesionaria(3);
		Auto auto1 = new Auto(" ", " ");

		String modeloAuto = " ";
		String marcaAuto = " ";

		Scanner teclado = new Scanner(System.in);

		byte botonMenu = 0;
		String tecladoMenu = " ";

		do {

			System.out.println("////////////////////////");
			System.out.println("/// A U T O  N O V O //");
			System.out.println("///////////////////////");
			System.out.print("\n");
			System.out.println("1- Ingresar nuevo vehiculo");
			System.out.println("2- Mostrar listado de vehiculos");
			System.out.println("3- Mostrar vehiculo particular con su codigo");
			System.out.println("4- Ver capacidad del garage");
			System.out.print("\n");
			System.out.println("9- Salir");
			botonMenu = teclado.nextByte();

			switch (botonMenu) {
			case 1:
				System.out.println("Ingrese marca del vehiculo: ");
				tecladoMenu = teclado.next();
				marcaAuto = tecladoMenu;
				System.out.println("Ingrese modelo del vehiculo: ");
				tecladoMenu = teclado.next();
				modeloAuto = tecladoMenu;
				// System.out.println("El vehiculo ha sido guardado correctamente.");
				System.out.println(novo.guardarVehiculo(crearAuto(marcaAuto, modeloAuto)));

				break;
			case 2:
				System.out.println("Los autos guardados son: ");
				System.out.println(novo.verListaDeAutos());
				break;

			case 3:
				System.out.println("Ingrese codigo del Auto: ");
				botonMenu = teclado.nextByte();
				System.out.println("El auto en la posicion " + novo.verAutoEspecifico(botonMenu));
				break;
			case 4:

			}

		} while (botonMenu != 9);

	}

	private static Auto crearAuto(String marca, String modelo) { // metodo para crear objeto jeje
		Auto autoCreado = new Auto(marca, modelo);
		return autoCreado;
	}

}
