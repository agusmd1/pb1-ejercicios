package ar.edu.unlam.pb1.trabajoPractico02;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona sofia;

		sofia = new Persona("Sofia", "Mujer", "38432153", 2.8, 0.50);
		
		System.out.println("El peso de Sofia es: " + sofia.pesar() + " Kilos");
		System.out.println("La altura de Sofia es: " + sofia.medir() + " Metros");
		System.out.println("La edad de sofia es: " + sofia.getEdad() + " Anos");
		System.out.println("-----------------------------------------------------");
		
		sofia.alimentar(1.0);
		sofia.crecer(0.5);
		sofia.cumpliAnos();
		
		System.out.println("El peso de Sofia es: " + sofia.pesar() + " Kilos");
		System.out.println("La altura de Sofia es: " + sofia.medir() + " Metros");
		System.out.println("La edad de sofia es: " + sofia.getEdad() + " Anos");
		System.out.println(sofia.esMayorDeEdad());

	}

}
