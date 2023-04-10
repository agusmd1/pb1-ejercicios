package trabajosOtros;

public class ControlBiometrico {

	private String nombreDelSistema;
	private final int CANTIDAD_USUARIOS_MAXIMOS;
	private int cantidadUsuariosRegistrados;
	private UsuarioControlBiometrico usuario[];
	private FichadaControlBiometrico fichada[];

	private boolean existe;
	// hacer un array con fichada

	public ControlBiometrico(int cantidadMaxima, String nombre) {

		this.CANTIDAD_USUARIOS_MAXIMOS = cantidadMaxima;
		this.nombreDelSistema = nombre;
		this.cantidadUsuariosRegistrados = 0;
		this.usuario = new UsuarioControlBiometrico[CANTIDAD_USUARIOS_MAXIMOS];
		this.fichada = new FichadaControlBiometrico[5];

	}

	public void setNombre(String nombre) {
		nombreDelSistema = nombre;
	}

	public String getNombre() {
		return nombreDelSistema;
	}

	public String registrarUsuarioNuevo(UsuarioControlBiometrico userNuevo) {
		String mensaje = " ";
		if (cantidadUsuariosRegistrados < CANTIDAD_USUARIOS_MAXIMOS) {
			for (int i = 0; i < usuario.length; i++) {
				if (usuario[i] == null) {
					usuario[i] = userNuevo;
					cantidadUsuariosRegistrados++;
					mensaje += "Usuario creado: " + cantidadUsuariosRegistrados + " de " + CANTIDAD_USUARIOS_MAXIMOS;
					break;
				}
			}
			return mensaje;
		} else {
			mensaje += "error";
			return mensaje;
		}

	}

	public String obtenerUsuarioPorSuNumero(int numeroIngresado) {
		String mensaje = " ";
		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i].getNumeroDeUsuario() == numeroIngresado) {
				mensaje += "el usuario de numero: " + usuario[i].getNumeroDeUsuario() + " es de apellido: "
						+ usuario[i].getApellido() + " su puesto es: " + usuario[i].getTipoDeEmpleado()
						+ " y su saldo es: " + usuario[i].getSaldo();
			} else {
				mensaje += "no encontrado";
			}

		}
		return mensaje;

	}

	public String obtenerGerenteMayorSueldo() {
		String mensaje = " ";
		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i].getTipoDeEmpleado() == enumControlBiometrico.GERENTE) {

			}

		}
	}

	public String fichada(int nusuario, FichadaControlBiometrico nuevoFichaje) {
		String mensaje = " ";
		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i].getNumeroDeUsuario() == nusuario) {
				for (int j = 0; j < fichada.length; j++) {
					if (fichada[j] == null) {
						fichada[j] = nuevoFichaje;
						mensaje += "fichada registrada";
						return mensaje;
					}
				}
			}
			mensaje += "el usuario no existe";
		}
		return mensaje;
	}

	public String verFichajesTotales() {
		String mensaje = " ";
		for (int i = 0; i < fichada.length; i++) {
			if (fichada[i] != null) {
				mensaje += "numero de usuario: " + fichada[i].getNumeroUsuario() + " Ingreso el dia: "
						+ fichada[i].getIngresoDia() + " del mes: " + fichada[i].getIngresoMes() + "\n";

			}
		}
		return mensaje;
	}

}
