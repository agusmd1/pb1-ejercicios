package ar.edu.unlam.pb1.trabajoPractico02;

public class PruebaCoche {

	public static void main(String[] args) {
		Coche auto1;
		Coche auto2;
		auto1 = new Coche("fiat", "duna", 15000, 1997, 1000000.0);

		System.out.println("La marca es: " + auto1.getMarca());
		System.out.println("Modelo: " + auto1.getModelo());
		System.out.println("Precio del auto: $" + auto1.getPrecio());
		System.out.println("La cantidad de kilometros: " + auto1.getKilometros() + " KM");
		System.out.println("La antiguedad del auto es: " + auto1.calcularAntiguedad() + " anios");
		System.out.println("Auto numero: " + auto1.getCantidadCoches());

		auto2 = new Coche("fiat", "palio", 0, 2022, 5000000);

		System.out.println("La marca es: " + auto2.getMarca());
		System.out.println("Modelo: " + auto2.getModelo());
		System.out.println("Precio del auto: $" + auto2.getPrecio());
		System.out.println("La cantidad de kilometros: " + auto2.getKilometros() + " KM");
		System.out.println("La antiguedad del auto es: " + auto2.calcularAntiguedad() + " anios");
		System.out.println("Auto numero: " + auto2.getCantidadCoches());

	}

}
