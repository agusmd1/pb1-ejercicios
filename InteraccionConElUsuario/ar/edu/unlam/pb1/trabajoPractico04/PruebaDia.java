package ar.edu.unlam.pb1.trabajoPractico04;

import java.util.Scanner;

public class PruebaDia {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		byte botonMenu = 0;

		do {
			System.out.println("Ingrese numero para obtener un dia/ ingrese '8' para SALIR: ");
			botonMenu = teclado.nextByte();
			switch (botonMenu) {
			case 1:
				System.out.println("DOMINGO");
				break;
			case 2:
				System.out.println("LUNES");
				break;
			case 3:
				System.out.println("MARTES");
				break;
			case 4:
				System.out.println("MIERCOLES");
				break;
			case 5:
				System.out.println("JUEVES");
				break;
			case 6:
				System.out.println("VIERNES");
				break;
			case 7:
				System.out.println("SABADO");
				break;
			case 8:
				System.out.println("Nos vemos!");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;

			}

		} while (botonMenu != 8);

	}

}
