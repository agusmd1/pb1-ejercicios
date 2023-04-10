package trabajosOtros;

import java.util.Scanner;

public class PruebaTrenes {

	public static void main(String[] args) {

		// creacion de objetos
		Scanner teclado = new Scanner(System.in);
		Locomotora locomotora1 = new Locomotora(1, "Mercedes", 2);

		// auxiliares teclado
		byte botonByte = 0;
		String botonString = " ";
		int botonInt = 0;
		double botonDouble = 0;

		// auxiliares objetos
		// vagon
		Vagon vagonAux = new Vagon(" ", " ", MarcaVagon.LIMA, 0.0, 0.0);
		String idVagon = " ";
		String descripcionVagon = " ";
		MarcaVagon tipo = MarcaVagon.LIMA;
		double maxSoportado = 0;
		double pesoDeCarga = 0;
		//

		do {
			System.out.println("**********************************");
			System.out.println("          QTrainQTrain         ");
			System.out.println("**********************************");
			System.out.println("1- Agregar vagon");
			System.out.println("2- Vagon de menor peso");
			System.out.println("3- Peso promedio de los vagones para la marca");
			System.out.println("4- Editar nombre de vagon");
			System.out.println("5- Ordenar vagones por id");
			System.out.println("\n");
			System.out.println("9- Salir");
			botonByte = teclado.nextByte();

			switch (botonByte) {
			case 1:
				System.out.println("Ingrese id del vagon (3letras y 3 numeros): ");
				botonString = teclado.next();
				idVagon = botonString;
				if (idVagon.length() == 6) {

					System.out.println("Ingrese descipcion del vagon: ");
					botonString = teclado.next();
					descripcionVagon = botonString;
					System.out.println("Que marca es el vagon? \n 1-LIMA \n 2-ROCO \n 3-PHILOTRAIN");
					botonByte = teclado.nextByte();
					switch (botonByte) {
					case 1:
						tipo = MarcaVagon.LIMA;
						break;
					case 2:
						tipo = MarcaVagon.ROCO;
						break;
					case 3:
						tipo = MarcaVagon.PHILOTRAIN;
						break;
					default:
						System.out.println("opcion incorrecta");
						break;
					}
					System.out.println("Ingrese el maximo peso soportado: ");
					botonDouble = teclado.nextDouble();
					maxSoportado = botonDouble;
					System.out.println("Ingrese peso del vagon: ");
					botonDouble = teclado.nextDouble();
					pesoDeCarga = botonDouble;
					if (vagonAux.validarPeso(pesoDeCarga)) {

						if (locomotora1
								.agregarVagon(crearVagon(idVagon, descripcionVagon, tipo, maxSoportado, pesoDeCarga))) {
							System.out.println("El vagon ha sido agregado");
						} else {
							System.out.println("error");
						}

					} else {
						System.out.println("el peso de carga no puede superar el peso maximo");
					}
				} else {
					System.out.println("error al crear el vagon intente de nuevo");
				}
				break;
			case 2:

				break;
			case 3:
				System.out
						.println("Que marca se desea conocer el peso promedio? \\n 1-LIMA \\n 2-ROCO \\n 3-PHILOTRAIN");
				botonByte = teclado.nextByte();
				switch (botonByte) {
				case 1:
					tipo = MarcaVagon.LIMA;
					System.out.println("el peso promedio de la marca LIMA es: "
							+ locomotora1.obtenerPesoPromedioDeVagonesParaLaMarca(tipo));
				}
				break;
			case 4:
				System.out.println("Ingrese el id del vagon que quiere editar:");
				botonString = teclado.next();
				idVagon = botonString;
				System.out.println("Nuevo nombre: ");
				botonString = teclado.next();
				String idVagonNuevo = botonString;
				if (locomotora1.editarNombreDeVagon(idVagon, idVagonNuevo) == true) {
					System.out.println("El nombre ha sido cambiado");
				} else {
					System.out.println("Erro.");
				}

				break;
			case 5:
				System.out.println("Lista de vagones ordenados.");
			}

		} while (botonByte != 9);

	}

	public static Vagon crearVagon(String idVagon, String descripcion, MarcaVagon tipo, double maxSoportado,
			double pesoDeCarga) {
		if (Vagon.validarIdentificadorDeVagon(idVagon)) {
			Vagon nuevoVagon = new Vagon(idVagon, descripcion, tipo, maxSoportado, pesoDeCarga);
			return nuevoVagon;
		} else {
			return null;
		}
	}

}
