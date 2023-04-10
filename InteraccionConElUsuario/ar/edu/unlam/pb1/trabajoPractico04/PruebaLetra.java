package ar.edu.unlam.pb1.trabajoPractico04;

import java.util.Scanner;

public class PruebaLetra {

	public static void main(String[] args) {

		Letra letra1 = new Letra();
		Scanner teclado = new Scanner(System.in);

		char botonChar = 0;

		do {

			System.out.println("ingrese una letra: ");
			botonChar = teclado.next().charAt(0);
			switch (botonChar) {
			case 'a':
				System.out.println("Es vocal: " + letra1.esVocal(botonChar));
				break;
			case 'e':
				System.out.println("Es vocal: " + letra1.esVocal(botonChar));
				break;
			case 'i':
				System.out.println("Es vocal: " + letra1.esVocal(botonChar));
				break;
			case 'o':
				System.out.println("Es vocal: " + letra1.esVocal(botonChar));
				break;
			case 'u':
				System.out.println("Es vocal: " + letra1.esVocal(botonChar));
				break;
			default:
				System.out.println("Es vocal: " + letra1.esVocal(botonChar));
				break;

			}

		} while (botonChar != 'z');
	}

}
