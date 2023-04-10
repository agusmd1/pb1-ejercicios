package trabajosOtros;

public class SalaDeCine {

	private Butaca asientos[][];
	
	private static Integer totalOcupadas;

	public SalaDeCine() {

		asientos = new Butaca[10][10];
		this.totalOcupadas = 0;

	}

	public void crearAsientos() {
		int i = 0;
		int j = 0;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				asientos[i][j] = new Butaca(i, j);

			}
		}
	}

	public boolean reservarButacaUnica() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (asientos[i][j].isEstaOcupado() == false) {
					asientos[i][j].setEstaOcupado(true);
					return true;
				}
			}

		}
		return false;
	}

}
