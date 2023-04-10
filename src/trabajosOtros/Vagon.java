package trabajosOtros;

public class Vagon {
	private String idVagon;
	private String descripcion;
	private MarcaVagon marca;
	private double maximoSoportado;
	private double pesoDeCarga;

	public Vagon(String idVagon, String descripcion, MarcaVagon tipo, double maxSoportado, double pesoDeCarga) {
		this.idVagon = idVagon;
		this.descripcion = descripcion;
		this.marca = tipo;
		this.maximoSoportado = maxSoportado;
		this.pesoDeCarga = pesoDeCarga;

	}

	public String getIdVagon() {
		return idVagon;
	}

	public void setIdVagon(String idVagon) {
		this.idVagon = idVagon;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public MarcaVagon getMarca() {
		return marca;
	}

	public void setMarca(MarcaVagon marca) {
		this.marca = marca;
	}

	public double getMaximoSoportado() {
		return maximoSoportado;
	}

	public void setMaximoSoportado(double maximoSoportado) {
		this.maximoSoportado = maximoSoportado;
	}

	public double getPesoDeCarga() {
		return pesoDeCarga;
	}

	public void setPesoDeCarga(double pesoDeCarga) {
		this.pesoDeCarga = pesoDeCarga;
	}

	public boolean validarPeso(double pesoIngresado) {
		if (pesoIngresado <= maximoSoportado) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validarIdentificadorDeVagon(String idVagon) {
		boolean primerLetra = false;
		boolean segundaLetra = false;
		boolean terceraLetra = false;
		boolean primerNumero = false;
		boolean segundoNumero = false;
		boolean tercerNumero = false;
		char auxiliar[] = new char[idVagon.length()];
		auxiliar = idVagon.toCharArray();
		if (Character.isUpperCase(auxiliar[0])) {
			primerLetra = true;
		}
		if (Character.isUpperCase(auxiliar[1])) {
			segundaLetra = true;
		}
		if (Character.isUpperCase(auxiliar[2])) {
			terceraLetra = true;
		}
		if (Character.isDigit(auxiliar[3])) {
			primerNumero = true;
		}
		if (Character.isDigit(auxiliar[4])) {
			segundoNumero = true;
		}
		if (Character.isDigit(auxiliar[5])) {
			tercerNumero = true;
		}
		if (primerLetra && segundaLetra && terceraLetra && primerNumero && segundoNumero && tercerNumero) {
			return true;
		} else {
			return false;
		}
	}

}
