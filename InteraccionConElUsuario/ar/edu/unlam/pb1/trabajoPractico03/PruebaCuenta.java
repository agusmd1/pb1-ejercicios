package ar.edu.unlam.pb1.trabajoPractico03;

import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta(0);
		Scanner teclado = new Scanner(System.in);
		byte botonMenu = 0;
		float botonCajero = 0;

		do {

			System.out.println("**********************");
			System.out.println("  CAJERO AUTOMATICO   ");
			System.out.println("**********************");
			System.out.println("OPERACIONES: ");
			System.out.println("\n");
			System.out.println("1- CONSULTAR SALDO");
			System.out.println("2- DEPOSITAR");
			System.out.println("3- RETIRAR");
			System.out.println("\n");
			System.out.println("4- SALIR");
			botonMenu = teclado.nextByte();

			switch (botonMenu) {
			case 1:
				System.out.println("Su saldo actual es: $" + cuenta1.getSaldo());
				break;
			case 2:
				System.out.println("Ingrese el monto que desea depositar: ");
				botonCajero = teclado.nextFloat();
				System.out.println("Su nuevo saldo es: $" + cuenta1.depositar(botonCajero));
				break;
			case 3:
				System.out.println("Ingrese el monto que desea retirar: ");
				botonCajero = teclado.nextFloat();
				if (botonCajero <= cuenta1.getSaldo()) {
					System.out.println("Su nuevo saldo es: $" + cuenta1.retirar(botonCajero));
				} else {
					System.out.println("////////////////////////////////////////////////////////////////////");
					System.out.println("/////////// CANTIDAD INCORRECTA, INGRESE UN VALOR VALIDO ///////////");
					System.out.println("////////////////////////////////////////////////////////////////////");
					System.out.println("\n");
				}
				break;
			case 4:
				System.out.println("Nos vemos!");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;

			}

		} while (botonMenu != 4);
	}
}
