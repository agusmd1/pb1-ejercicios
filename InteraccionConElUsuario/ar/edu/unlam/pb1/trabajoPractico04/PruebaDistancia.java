package ar.edu.unlam.pb1.trabajoPractico04;

import java.util.Scanner;

public class PruebaDistancia {

	public static void main(String[] args) {

		Distancia dist1 = new Distancia(0.0);
		Scanner teclado = new Scanner(System.in);

		byte botonMenu = 0;

		System.out.println("Ingrese una distancia en metros :");
		dist1.setValorInicial(teclado.nextDouble());
		System.out.println("La distancia ingresada es: " + dist1.getValorInicial() + " metros.");

		System.out.println("Desea convertir la distancia ingresada? \n 1-Si \n 2-No");
		botonMenu = teclado.nextByte();
		if (botonMenu == 1) {
			System.out.println("A que unidad desea convertir? \n 1-Decametro \n 2-Hectometro \n 3-Kilometro");
			botonMenu = teclado.nextByte();
			switch (botonMenu) {
			case 1:
				System.out.println("la nueva unidad es: " + dist1.convertir(botonMenu) + " Decametros");
				break;
			case 2:
				System.out.println("la nueva unidad es: " + dist1.convertir(botonMenu) + " Hectometros");
				break;
			case 3:
				System.out.println("la nueva unidad es: " + dist1.convertir(botonMenu) + " Kilometros");
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;
			}

		} else {
			System.out.println("La distancia ingresada es: " + dist1.getValorInicial() + " metros.");
		}

	}

}
