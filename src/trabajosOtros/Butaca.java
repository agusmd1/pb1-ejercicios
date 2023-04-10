package trabajosOtros;

public class Butaca {
	private Integer asientoFila;
	private Integer asientoColumna;
	boolean estaOcupado;

	public Butaca(Integer asientoFila, Integer asientoColumna) {
		this.asientoColumna = asientoColumna;
		this.asientoFila = asientoFila;
		this.estaOcupado = false;

	}

	public int getAsientoFila() {
		return asientoFila;
	}

	public void setAsientoFila(Integer asientoFila) {
		this.asientoFila = asientoFila;
	}

	public int getAsientoColumna() {
		return asientoColumna;
	}

	public void setAsientoColumna(Integer asientoColumna) {
		this.asientoColumna = asientoColumna;
	}

	public boolean isEstaOcupado() {
		return estaOcupado;
	}

	public void setEstaOcupado(boolean estaOcupado) {
		this.estaOcupado = estaOcupado;
	}

}
