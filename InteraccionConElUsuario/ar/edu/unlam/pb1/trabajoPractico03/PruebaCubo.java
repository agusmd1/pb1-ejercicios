package ar.edu.unlam.pb1.trabajoPractico03;

import java.util.Scanner;

public class PruebaCubo {

	public static void main(String[] args) {
		Cubo cubito1 = new Cubo(0);
		Scanner teclado = new Scanner(System.in);
		float botonLado = 0;

		System.out.println("Cuando vale el lado del cubito? (milimetros)");
		botonLado = teclado.nextFloat();
		cubito1.setLongitudLado(botonLado);

		System.out.println("Los lados del cubo miden: " + cubito1.getLongitudLado() + " mm");
		System.out.println("La superficie del cubo es: " + cubito1.getSuperficieCara() + " mm2");
		System.out.println("El volumen del cubo es: " + cubito1.getVolumen() + " mm3");

	}

}
