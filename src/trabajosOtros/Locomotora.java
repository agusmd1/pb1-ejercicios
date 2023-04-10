package trabajosOtros;

public class Locomotora {
	private int idLocomotora;
	private String nombre;
	private int cantidadMaximaDeVagones;
	private int cantidadActualVagones;
	private Vagon formacion[];

	public Locomotora(int id, String nombre, int cantidadMaximaDeVagones) {

		this.idLocomotora = id;
		this.nombre = nombre;
		this.cantidadMaximaDeVagones = cantidadMaximaDeVagones;
		this.cantidadActualVagones = 0;
		this.formacion = new Vagon[cantidadMaximaDeVagones];
	}

	public int getIdLocomotora() {
		return idLocomotora;
	}

	public void setIdLocomotora(int idLocomotora) {
		this.idLocomotora = idLocomotora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean agregarVagon(Vagon vagon) {
		if (cantidadActualVagones < cantidadMaximaDeVagones) {
			for (int i = 0; i < formacion.length; i++) {
				if (formacion[i] == null) {
					formacion[i] = vagon;
					cantidadActualVagones++;
					return true;
				}
			}
		}
		return false;
	}

	public double obtenerPesoPromedioDeVagonesParaLaMarca(MarcaVagon marca) {
		double auxiliar = 0.0;
		double cantidad = 0.0;
		double total = 0.0;
		for (int i = 0; i < formacion.length; i++) {
			if (formacion[i].getMarca() == MarcaVagon.LIMA) {
				auxiliar += (formacion[i].getPesoDeCarga());
				cantidad++;
			}
			if (formacion[i].getMarca() == MarcaVagon.PHILOTRAIN) {
				auxiliar += (formacion[i].getPesoDeCarga());
				cantidad++;
			}
			if (formacion[i].getMarca() == MarcaVagon.ROCO) {
				auxiliar += (formacion[i].getPesoDeCarga());
				cantidad++;
			}
		}
		total = (auxiliar / cantidad);
		return total;
	}

	public boolean editarNombreDeVagon(String idVagon, String nuevoNombreDeVagon) {
		for (int i = 0; i < formacion.length; i++) {
			if (formacion[i].getIdVagon().equals(idVagon)) {
				formacion[i].setIdVagon(nuevoNombreDeVagon);
				return true;
			}
		}
		return false;
		// areglar esto, devuelve true siempre
	}

	public void ordenarVagonesPorIdVagon();

}
