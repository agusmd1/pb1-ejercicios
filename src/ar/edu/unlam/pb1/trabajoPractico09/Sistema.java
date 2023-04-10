package ar.edu.unlam.pb1.trabajoPractico09;

public class Sistema {
	private Usuario usuario[];
	private final int CANTIDAD_MAXIMA_USUARIOS;
	private String nombreDelSistema;

	private static int cantidadDeUsuariosRegistrados;
	private boolean logIn;

	public Sistema(int usuariosMaximos) {
		this.CANTIDAD_MAXIMA_USUARIOS = usuariosMaximos;
		this.cantidadDeUsuariosRegistrados = 0;
		this.usuario = new Usuario[CANTIDAD_MAXIMA_USUARIOS];
		this.nombreDelSistema = " ";
		this.logIn = false;

	}

	// metodo crear usuario y q pida contrasenia jejeje
	// login

	public void setNombreSistema(String nombre) {
		nombreDelSistema = nombre;
	}

	public String getNombreSistema() {
		return nombreDelSistema;
	}

	public String crearUsuario(Usuario userNuevo) {
		String mensaje = " ";
		if (cantidadDeUsuariosRegistrados < CANTIDAD_MAXIMA_USUARIOS) {
			for (int i = 0; i < usuario.length; i++) {
				if (usuario[i] == null) {
					usuario[i] = userNuevo;
					cantidadDeUsuariosRegistrados++;
					mensaje += "Usuario guardado: " + cantidadDeUsuariosRegistrados + " de " + CANTIDAD_MAXIMA_USUARIOS;
					break;
				}
			}
			return mensaje;
		} else {
			mensaje += "Error al guardar, la cantidad de usuarios registrados supera al limite.";
			return mensaje;
		}

	}

	public String verUsuariosRegistrados() {
		String mensaje = " ";
		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i] != null) {
				mensaje += "El usuario guardado en el slot: " + (i) + " Usuario: " + usuario[i].getUsuario() + " "
						+ " Contrasenia: " + usuario[i].getContrasenia() + "/////////";
			}
		}
		return mensaje;
	}

	public boolean loguearUsuario(String user, String pass) {

		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i].getUsuario().equals(user) == true && usuario[i].getContrasenia().equals(pass) == true) {
				logIn = true;
				return true;

			}
		}
		logIn = false;
		return false;
	}

	public boolean estaLogeadaLaCuenta() {
		if (logIn == true) {
			return true;
		} else {
			return false;
		}
	}

}
