package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class PruebaAhorcado {

	public static void main(String[] args) {

		String palabraTeclado = " ";

		Ahorcado partida1 = new Ahorcado(" ");
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese una palabra");
		palabraTeclado = teclado.next();
		partida1.SetPalabraIngresadaPorUsuario(palabraTeclado);


		System.out.println("");
		System.out.println("");
		System.out.println("");

	}

}
