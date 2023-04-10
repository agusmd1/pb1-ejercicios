package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int botonMenu;

		// int numeros[] = new int[0];

		System.out.println("Seleccione el tamanio del array: ");
		botonMenu = teclado.nextInt();
		int numeros[] = new int[botonMenu];

		System.out.println("Que numero desea guardar en el array ?");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 29);

		}
		for (int i = 0; i < botonMenu; i++) {
			System.out.println("Posicion: " + (i + 1) + " numero: " + numeros[i]);
		}

	}

}
