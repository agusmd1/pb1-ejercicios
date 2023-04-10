package trabajosOtros;

import java.util.Scanner;

public class PruebaSalaDeCine {
	public static void main(String[] args) {
		byte botonMenu = 0;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("///////////////////////////////");
			System.out.println("/////// CINE CIUDADELA ////////");
			System.out.println("///////////////////////////////");
			System.out.println("\n");
			System.out.println("*******************************");
			System.out.println("OPCIONES");
			System.out.println("*******************************");
			System.out.println("\n");
			System.out.println("1- VER MAPA ASIENTOS");
			System.out.println("2- REVESERVAR 1");
			System.out.println("3- RESERVAR VARIOS");
			System.out.println("\n");
			System.out.println("4- Salir");

			botonMenu = teclado.nextByte();

			switch (botonMenu) {
			case 1:

				break;
			case 2:

				break;
			case 3:

			case 4:
				System.out.println("Nos vemos!");
				break;
			default:
				System.out.println("OPCION INCORRECTA");

			}

		} while (botonMenu != 4);
	}

}
