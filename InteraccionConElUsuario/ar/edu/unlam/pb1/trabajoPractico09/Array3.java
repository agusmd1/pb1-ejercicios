package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {

		char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		Scanner teclado = new Scanner(System.in);
		int botonMenu;
		do {
			System.out.println("Ingrese el numero (letra) que desea mostrar: ");
			botonMenu = teclado.nextInt();

			// for (int i = 0; i < botonMenu; i++) { }
			System.out.println(letras[botonMenu - 1]);
		} while (botonMenu != -1);
		System.out.println("Chau");
	}

}

/*
 * Desarrolla un array de caracteres que contenga las letras de la A a la Z. Se
 * debe solicitar el ingreso de números por teclado. Por cada número ingresado
 * se irá generando un String que contenga la letra asociada a la posición del
 * array asociada al número ingresado. El ingreso de valores finalizará cuando
 * el usuario ingrese -1. Al terminar se debe mostrar la cadena construida.
 */
