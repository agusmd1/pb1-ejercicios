package ar.edu.unlam.pb1.trabajoPractico04;

import java.util.Scanner;

public class PruebaTemperatura {

	public static void main(String[] args) {

		Temperatura temp1 = new Temperatura(0.0);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese temperatura en grados celcius :");
		temp1.setCelcius(teclado.nextDouble());

		System.out.println("La temperatura en grados celcius es: " + temp1.getCelcius() + " grados celcius");
		temp1.setFarenheit();
		System.out.println("La temperatura en grados farenheit es: " + temp1.getFarenheit() + " grados farenheit");
		temp1.setKelvin();
		System.out.println("La temperatura en grados kelvin es: " + temp1.getKelvin() + " grados kelvin");

	}

}
