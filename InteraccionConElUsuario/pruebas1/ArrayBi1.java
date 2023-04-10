package pruebas1;

import java.util.Scanner;

public class ArrayBi1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numeros[][] = new int[3][3];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; i < 5; j++) {
				System.out.println("ingrese un numero");
				numeros[i][j] = teclado.nextInt();
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; i < 5; j++) {
				System.out.println("Posicion: " + (i + 1) + " numero: " + numeros[i][j]);
			}
		}

	}

}