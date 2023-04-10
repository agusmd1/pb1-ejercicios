package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeros[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("ingrese un numero");
			numeros[i] = teclado.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Posicion: " + (i + 1) + " numero: " + numeros[i]);
		}

	}

}
