package trabajosOtros;

public class FichadaControlBiometrico {
	private int numeroUsuario;
	private int ingresoDia;
	private int ingresoMes;

	public FichadaControlBiometrico(int numeroUsuario, int dia, int mes) {
		this.numeroUsuario = numeroUsuario;
		this.ingresoDia = dia;
		this.ingresoMes = mes;
	}

	public int getNumeroUsuario() {
		return numeroUsuario;
	}

	public void setNumeroUsuario(int numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}

	public int getIngresoDia() {
		return ingresoDia;
	}

	public void setIngresoDia(int ingresoDia) {
		this.ingresoDia = ingresoDia;
	}

	public int getIngresoMes() {
		return ingresoMes;
	}

	public void setIngresoMes(int ingresoMes) {
		this.ingresoMes = ingresoMes;
	}

}
