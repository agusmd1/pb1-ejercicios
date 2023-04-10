package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena = " ";
		int botonNumeroIngresado = 0;

		do {

			System.out.println("Ingrese un numero para saber si es capicua o no(minimo 5 digitos): ");
			cadena = teclado.next();
			int[] numeros = new int[cadena.length()];

			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = Character.getNumericValue(cadena.charAt(i));

			}

			for (int i = 0; i < numeros.length; i++) {
				// System.out.println("Posicion de array " + (i + 1) + " : " + " " +
				// numeros[i]);

			}
			if (numeros[0] == numeros[2] && numeros[2] == numeros[4]) {
				System.out.println("Es capicua");
			} else {
				System.out.println("No es capicua");
			}

		} while (cadena.toLowerCase() != "sa");
		System.out.println("CHAU NOS VEMOS CUIDATE");
	}

}
/*
 * Crea una aplicación que pida un numero por teclado para después comprobar si
 * el numero introducido es capicua, es decir, que se lee igual sin importar la
 * dirección. Por ejemplo, si introducimos 30303 es capicua, si introducimos
 * 30430 no es capicua. Piensa como podés dar la vuelta al número. Una forma de
 * pasar un número a un array es esta
 * Character.getNumericValue(cadena.charAt(posicion)).
 */