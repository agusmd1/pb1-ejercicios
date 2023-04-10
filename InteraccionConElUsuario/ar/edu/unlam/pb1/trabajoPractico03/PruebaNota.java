package ar.edu.unlam.pb1.trabajoPractico03;

public class PruebaNota {

	public static void main(String[] args) {
		Nota nota1 = new Nota(3);

		System.out.println(nota1.aprobado());
		System.out.println(nota1.getValor());
		nota1.recuperar(7);
		System.out.println(nota1.getValor());
		System.out.println(nota1.aprobado());

	}

}
