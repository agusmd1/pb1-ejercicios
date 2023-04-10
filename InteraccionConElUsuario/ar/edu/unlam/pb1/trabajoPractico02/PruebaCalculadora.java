package ar.edu.unlam.pb1.trabajoPractico02;

import java.util.Scanner;

public class PruebaCalculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Calculadora calcu1 = new Calculadora();
		byte botonMenu = 0;
		double botonCalculadora = 0;
		double op1 = 0;
		double op2 = 0;
		do {

			System.out.println("**********************");
			System.out.println("CALCULADORA CASIO");
			System.out.println("**********************");
			System.out.println("OPERACIONES: ");
			System.out.println("\n");
			System.out.println("1- SUMAR");
			System.out.println("2- RESTAR");
			System.out.println("3- MULTIPLICAR");
			System.out.println("4- DIVIDIR");
			System.out.println("\n");
			System.out.println("5- SALIR");
			botonMenu = teclado.nextByte();

			switch (botonMenu) {

			case 1:

				System.out.println("Ingrese operador 1: ");
				op1 = teclado.nextDouble();
				System.out.println("Ingrese operador 2: ");
				op2 = teclado.nextDouble();
				System.out.println("El resultado es: " + calcu1.sumar(op1, op2));
				System.out.println("Es positivo: " + calcu1.esPositivo());

				break;
			case 2:

				System.out.println("Ingrese operador 1: ");
				op1 = teclado.nextDouble();
				System.out.println("Ingrese operador 2: ");
				op2 = teclado.nextDouble();
				System.out.println("El resultado es: " + calcu1.restar(op1, op2));
				System.out.println("Es positivo: " + calcu1.esPositivo());
				break;
			case 3:
				System.out.println("Ingrese operador 1: ");
				op1 = teclado.nextDouble();
				System.out.println("Ingrese operador 2: ");
				op2 = teclado.nextDouble();
				System.out.println("El resultado es: " + calcu1.multiplicar(op1, op2));
				System.out.println("Es positivo: " + calcu1.esPositivo());
				break;
			case 4:
				System.out.println("Ingrese operador 1: ");
				op1 = teclado.nextDouble();
				System.out.println("Ingrese operador 2: ");
				op2 = teclado.nextDouble();
				if (op2 == 0) {
					System.out.println("ERROR, NO SE PUEDE DIVIDIR POR 0");
				} else {
					System.out.println("El resultado es: " + calcu1.dividir(op1, op2));
					System.out.println("Es positivo: " + calcu1.esPositivo());
				}
				break;
			case 5:
				System.out.println("Nos vemos luego!");
				break;
			default:
				System.out.println("Opcion incorrecta, vuelva a elegir");

			}
		} while (botonMenu != 5);

	}

}
