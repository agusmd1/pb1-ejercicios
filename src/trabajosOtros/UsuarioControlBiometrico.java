package trabajosOtros;

public class UsuarioControlBiometrico {

	private int numeroDeUsuario;
	private String apellido;
	private enumControlBiometrico tipoDeEmpleado;
	// crear el enum
	private double saldo;

	public UsuarioControlBiometrico(int numeroDeUsuario, String apellido, double saldo, enumControlBiometrico tipo) {
		this.numeroDeUsuario = numeroDeUsuario;
		this.apellido = apellido;
		this.saldo = saldo;
		this.tipoDeEmpleado = tipo;
	}

	public int getNumeroDeUsuario() {
		return numeroDeUsuario;
	}

	public void setNumeroDeUsuario(int numeroDeUsuario) {
		this.numeroDeUsuario = numeroDeUsuario;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public enumControlBiometrico getTipoDeEmpleado() {
		return tipoDeEmpleado;
	}

	public void setTipoDeEmpleado(enumControlBiometrico tipoDeEmpleado) {
		this.tipoDeEmpleado = tipoDeEmpleado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
