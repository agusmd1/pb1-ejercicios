package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {

		float[] notaAlumno = new float[3];
		String[] nombreAlumno = new String[3];
		Scanner teclado = new Scanner(System.in);

		float notaIngresada;
		String nombreIngresado;

		for (int i = 0; i < nombreAlumno.length; i++) {
			System.out.println("Ingrese nombre alumno " + (i + 1) + " : ");
			nombreIngresado = teclado.next();
			nombreAlumno[i] = nombreIngresado;
			System.out.println("Ingrese nota del alumno " + (i + 1) + " :");
			notaIngresada = teclado.nextFloat();
			notaAlumno[i] = notaIngresada;

		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Alumno numero: " + (i + 1) + " Nombre: " + nombreAlumno[i] + " Nota: " + notaAlumno[i]);
		}

	}
}

/*
 * Desarrolla una clase de prueba que contenga 2 arrays. Uno String y otro
 * float. Se debe solicitar por teclado el ingreso del nombre de los alumnos y
 * la nota de cada uno. Luego mostrá por pantalla el nombre del alumno junto con
 * su resultado (Reprobado, Aprobado o Promocionado).
 */