package ar.edu.unlam.pb1.trabajoPractico06;

import java.util.Scanner;

public class PruebaDestornillador {

	public static void main(String[] args) {

		Tarugo tarugo1 = new Tarugo(10);
		Tornillo tornillo1 = new Tornillo('P', 10, 10);
		Tornillo tornilloPlano = new Tornillo('P', 10, 10);
		Tornillo tornilloPhilips = new Tornillo('H', 10, 10);
		Tornillo tornilloAllen = new Tornillo('A', 10, 10);

		Destornillador dest1 = new Destornillador('P');

		Scanner teclado = new Scanner(System.in);

		byte botonMenu = 0;
		char botonCabeza = ' ';

		do {
			System.out.println("****************");
			System.out.println(" DESTORNILLADOR ");
			System.out.println("****************");
			System.out.println("1-Estado del destornillador del programa");
			System.out.println("2-Elegir tornillo");
			System.out.println("3-Elegir punta del destornillador");
			System.out.println("4-Atornillar");
			System.out.println("5-Desatornillar");
			System.out.println("0- SALIR");
			botonMenu = teclado.nextByte();
			switch (botonMenu) {
			case 1:
				if (dest1.puntaSeleccionada(botonCabeza) == 'P') {
					System.out.println("La punta del destornillador seleccionada es "
							+ dest1.puntaSeleccionada(botonCabeza) + " Plano");
				}
				if (dest1.puntaSeleccionada(botonCabeza) == 'H') {
					System.out.println("La punta del destornillador seleccionada es "
							+ dest1.puntaSeleccionada(botonCabeza) + " Phillips");
				}
				if (dest1.puntaSeleccionada(botonCabeza) == 'A') {
					System.out.println("La punta del destornillador seleccionada es "
							+ dest1.puntaSeleccionada(botonCabeza) + " Allen");
				} else {
					System.out.println("No hay punta de destornillador seleccionada");
				}
				break;
			case 2:
			case 3:
				System.out.println("Que punta desea utilizar? P-Plano H-Phillips A-Allen?");
				botonCabeza = teclado.next().charAt(0);
				dest1.puntaSeleccionada(botonCabeza);
				System.out.println("La punta del destornillador ha sido cambiada ");
				break;

			}

		} while (botonMenu != 0);

	}
}
