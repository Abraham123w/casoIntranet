package Model;
class Estudiante {
	private String nombre;
	private String apellido;
	private String rut;
	private String numMatricula;

	public Estudiante(String nombre, String apellido, String rut, String numMatricula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.numMatricula = numMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

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