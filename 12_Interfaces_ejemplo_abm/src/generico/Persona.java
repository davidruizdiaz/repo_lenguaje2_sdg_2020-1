package generico;

public abstract class Persona {

	// abtributos
	private String nombre;
	private String telefono;
	
	// constructor
	public Persona(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [\n\tnombre=" + nombre + ", \n\ttelefono=" + telefono
				+ "\n]";
	}

}
