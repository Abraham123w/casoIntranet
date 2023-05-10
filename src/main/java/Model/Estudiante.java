package Model;
public class Estudiante {
	private String nombre;
	//private String apellido;
	private String rut;
	private String numMatricula;
	private Carrera carrera;

	public Estudiante(String nombre, String rut, String numMatricula, Carrera carrera) {
		//rut,nombre,matricula,carrera
		this.nombre = nombre;
	//	this.apellido = apellido;
		this.rut = rut;
		this.numMatricula = numMatricula;
		this.carrera = carrera;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*public String getApellido() {
		return apellido;
	}*/

	/*public void setApellido(String apellido) {
		this.apellido = apellido;
	}*/

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
}