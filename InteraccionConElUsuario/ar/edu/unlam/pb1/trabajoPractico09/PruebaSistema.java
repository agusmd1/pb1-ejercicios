package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class PruebaSistema {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Sistema casio1 = new Sistema(5);

		String usuarioUser = " ";
		String contraUser = " ";

		String usuarioIngresadoPorPersona = " ";
		String passIngresadoPorPersona = " ";

		byte botonMenu = 0;
		String botonTeclado = " ";

		System.out.println("INGRESE NOMBRE DEL SISTEMA");
		botonTeclado = teclado.next();
		casio1.setNombreSistema(botonTeclado);

		do {

			System.out.println("/////////////////////////////////////");
			System.out.println("      SISTEMA: " + casio1.getNombreSistema() + "      ");
			System.out.println("/////////////////////////////////////");
			System.out.print("\n");
			System.out.println("Usuario logeado: ");
			System.out.println("1- Modificar nombre del sistema.");
			System.out.println("2- Agregar usuarios al Sistema ");
			System.out.println("3- Loguearse en el Sistema");
			System.out.println("4- Mostrar usuarios registrados");
			System.out.print("\n");
			System.out.println("9- Salir");
			botonMenu = teclado.nextByte();

			switch (botonMenu) {
			case 1:
				System.out.println("Ingrese nuevo nombre del sistema: ");
				botonTeclado = teclado.next();
				casio1.setNombreSistema(botonTeclado);
				System.out.println("Nombre del sistema cambiado, nuevo nombre es: " + casio1.getNombreSistema());
				System.out.println("\n");
				break;
			case 2:
				System.out.println("Ingrese nombre de usuario: ");
				botonTeclado = teclado.next();
				usuarioUser = botonTeclado;
				System.out.println("Ingrese contrasenia: ");
				botonTeclado = teclado.next();
				contraUser = botonTeclado;
				System.out.println(casio1.crearUsuario(crearUsuario(usuarioUser, contraUser)));
				// System.out.println("El usuario ha sido creado: ");
				break;
			case 3:
				System.out.println("Ingrese nombre de usuario: ");
				botonTeclado = teclado.next();
				usuarioIngresadoPorPersona = botonTeclado;
				System.out.println("Ingrese contrasenia: ");
				botonTeclado = teclado.next();
				passIngresadoPorPersona = botonTeclado;
				if (casio1.loguearUsuario(usuarioIngresadoPorPersona, passIngresadoPorPersona) == true) {
					System.out.println("Se logeo correctamente");
				} else {
					System.out.println("Usuario o Contrasenia incorrectos.");
				}
				break;
			case 4:
				System.out.println("Los usuarios guardados son: ");
				System.out.println(casio1.verUsuariosRegistrados());
				break;

			}

		} while (botonMenu != 9);
	}

	private static Usuario crearUsuario(String usuario, String contrasenia) { // metodo para crear objeto jeje
		Usuario userCreado = new Usuario(usuario, contrasenia);
		return userCreado;
	}

}
