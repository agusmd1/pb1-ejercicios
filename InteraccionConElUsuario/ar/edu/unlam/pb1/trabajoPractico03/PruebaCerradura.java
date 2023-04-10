package ar.edu.unlam.pb1.trabajoPractico03;

import java.util.Scanner;

public class PruebaCerradura {

	public static void main(String[] args) {
		Cerradura lock1 = new Cerradura(1234, 3);
		Scanner teclado = new Scanner(System.in);
		byte botonMenu = 0;
		int botonPanel = 0;

		do {

			System.out.println("///////////////////////////////");
			System.out.println("//// CERRADURA ELECTRONICA ////");
			System.out.println("///////////////////////////////");
			System.out.println("\n");
			System.out.println("*******************************");
			System.out.println("OPCIONES");
			System.out.println("*******************************");
			System.out.println("\n");
			System.out.println("1- Estado de la cerradura");
			System.out.println("2- Abrir");
			System.out.println("3- Cerrar");
			System.out.println("\n");
			System.out.println("4- Salir");

			botonMenu = teclado.nextByte();

			switch (botonMenu) {
			case 1:
				System.out.println("*******************************");
				System.out.println("ESTADO DE LA CERRADURA");
				System.out.println("*******************************");
				System.out.println("ESTA ABIERTA : " + lock1.estaAbierta());
				System.out.println("INTENTOS: " + lock1.getFallos() + " de " + lock1.getFallosMaximos());
				System.out.println("ESTA BLQUEADA : " + lock1.fueBloqueada());
				System.out.println("la contrasenia es: " + lock1.getClave());
				break;
			case 2:
				System.out.println("Ingrese la clave para abrir la cerradura");
				botonPanel = teclado.nextInt();
				if (lock1.fueBloqueada() == false) {
					if (lock1.abrir(botonPanel)) {
						System.out.println("LA CERRADURA SE ABRIO CORRECTAMENTE");
					} else {
						System.out.println("CONTRASENIA INCORRECTA");
						System.out.println("FALLOS: " + lock1.getFallos() + " de 3");

					}
				} else
					System.out.println("ESTA BLOQUEADA, REINICIE");
				break;
			case 3:
				if (lock1.fueBloqueada() == false) {
					if (lock1.getEstado() == true) {
						System.out.println("ingrese contrasenia para cerrar");
						botonPanel = teclado.nextInt();
						if (lock1.cerrar(botonPanel)) {
							System.out.println("CONTRASENIA INCORRECTA");
							System.out.println("FALLOS: " + lock1.getFallos() + " de 3");
						} else {

							System.out.println("LA CERRADURA SE CERRO CORRECTAMENTE");

						}
					} else
						System.out.println("YA ESTA CERRADA");
				} else
					System.out.println("ESTA BLOQUEADA, REINICIE");
				break;

			case 4:
				System.out.println("Nos vemos!");
				break;
			default:
				System.out.println("OPCION INCORRECTA");

			}

		} while (botonMenu != 4);
	}
}
