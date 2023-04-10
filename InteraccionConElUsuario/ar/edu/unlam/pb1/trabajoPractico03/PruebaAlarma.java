package ar.edu.unlam.pb1.trabajoPractico03;

import java.util.Scanner;

public class PruebaAlarma {

	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(1532);

		Scanner teclado = new Scanner(System.in);

		int botonPanel = 0;
		byte botonMenu = 0;

		System.out.println("//////////////////////////////");
		System.out.println("///// ALARMA ELECTRONICA /////");
		System.out.println("//////////////////////////////");
		System.out.println("\n");
		System.out.println("*******************************");
		System.out.println("OPCIONES");
		System.out.println("*******************************");
		System.out.println("\n");
		System.out.println("1- ENCENDER");
		System.out.println("2- APAGAR");
		System.out.println("\n");
		System.out.println("5- SALIR");

		botonMenu = teclado.nextByte();

		switch (botonMenu) {
		case 1:
			System.out.println("Ingrese la clave: ");
			botonPanel = teclado.nextInt();
			if (botonPanel == alarma1.getCodigo()) {
				System.out.println("wiu wiu");
				System.out.println(alarma1.activada());
			} else {
				System.out.println("contra incorrecta");
			}
		}
	}

}
