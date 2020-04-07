package entidad;

public class Cliente {
	
	// atributos
	private String nombre;
	private String direccion;
	
	// constructores
	public Cliente() {
		
	}

	public Cliente(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [\n\tnombre=" + nombre + ",\n\tdireccion=" + direccion
				+ "\n]";
	}
	
}

