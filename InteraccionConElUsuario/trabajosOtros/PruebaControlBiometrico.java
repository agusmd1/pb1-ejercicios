package trabajosOtros;

import java.util.Scanner;

public class PruebaControlBiometrico {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		//////// Ingreso por teclado
		String botonString = " ";
		int botonInt = 0;
		byte botonByte = 0;
		double botonDouble = 0.0;
		///////////////////////////////

		ControlBiometrico control1 = new ControlBiometrico(10, " ");

		// para crear usuario
		int numeroUsuario = 0;
		String apellidoUsuario = " ";
		double saldoUsuario = 0;
		enumControlBiometrico tipoEmpleado = enumControlBiometrico.OPERARIO;
		////////////////////////

		// para crear fichaje
		int numeroUsuario2 = 0;
		int diaIngreso = 0;
		int mesIngreso = 0;

		System.out.println("INGRESE NOMBRE DEL SISTEMA: ");
		botonString = teclado.next();
		control1.setNombre(botonString);
		do {
			System.out.println("*********************************");
			System.out.println("             " + control1.getNombre() + "             ");
			System.out.println("*********************************");
			System.out.println("1-Registrar un usuario");
			System.out.println("2-Obtener un usuario por su numero de usuario");
			System.out.println("3-Obtener el usuario gerente de mayor sueldo");
			System.out.println("4-Registrar el ingreso (fichada) de un usuario.");
			System.out.println("5-Ver todos los fichajes");
			System.out.println("");
			System.out.println("9-salir");
			botonByte = teclado.nextByte();

			switch (botonByte) {
			case 1:
				System.out.println("Ingrese numero de usuario: ");
				botonInt = teclado.nextInt();
				numeroUsuario = botonInt;
				System.out.println("Ingrese apellido usuario: ");
				botonString = teclado.next();
				apellidoUsuario = botonString;
				System.out.println("Que tipo de empleado es? \n 1-ADMINISTRATIVO \n 2-GERENTE \n 3-OPERARIO");
				botonByte = teclado.nextByte();
				switch (botonByte) {
				case 1:
					tipoEmpleado = enumControlBiometrico.ADMINISTRATIVO;
					break;
				case 2:
					tipoEmpleado = enumControlBiometrico.GERENTE;
					break;
				case 3:
					tipoEmpleado = enumControlBiometrico.OPERARIO;
					break;
				}

				System.out.println("Ingrese saldo del usuario: ");
				botonDouble = teclado.nextDouble();
				saldoUsuario = botonDouble;
				System.out.println(control1.registrarUsuarioNuevo(
						usuarioCreado(numeroUsuario, apellidoUsuario, saldoUsuario, tipoEmpleado)));
				break;
			case 2:
				System.out.println("Ingrese el numero del usuario que desea buscar: ");
				botonInt = teclado.nextInt();
				System.out.println(control1.obtenerUsuarioPorSuNumero(botonInt));
				break;
			case 3:
				botonByte = 9;
				break;
			case 4:
				System.out.println("Para registrar el ingreso debera ingresar los siguientes datos: ");
				System.out.println("Numero de usuario: ");
				botonInt = teclado.nextInt();
				numeroUsuario2 = botonInt;
				System.out.println("Ingrese el dia: ");
				botonInt = teclado.nextInt();
				diaIngreso = botonInt;
				System.out.println("Ingrese el mes: ");
				botonInt = teclado.nextInt();
				mesIngreso = botonInt;
				System.out.println(
						control1.fichada(numeroUsuario2, fichajeCreado(numeroUsuario2, diaIngreso, mesIngreso)));
				break;
			case 5:
				System.out.println(control1.verFichajesTotales());
				break;

			}

		} while (botonByte != 9);

	}

	private static UsuarioControlBiometrico usuarioCreado(int numero, String apellido, double saldo,
			enumControlBiometrico tipo) {
		UsuarioControlBiometrico userCreado = new UsuarioControlBiometrico(numero, apellido, saldo, tipo);
		return userCreado;
	}

	private static FichadaControlBiometrico fichajeCreado(int numero, int dia, int mes) {
		FichadaControlBiometrico nuevoFichaje = new FichadaControlBiometrico(numero, dia, mes);
		return nuevoFichaje;
	}

}
