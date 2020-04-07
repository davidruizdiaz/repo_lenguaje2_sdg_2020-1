package entidad;

import java.util.List;

public class Empresa {
	
	// atributos
	private String nombre;
	private String telefono;
	
	private List<Cliente> clientes;
	
	//constructores
	public Empresa() {
		
	}

	public Empresa(String nombre, String telefono, List<Cliente> clientes) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.clientes = clientes;
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

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Empresa [\n\tnombre=" + nombre + ",\n\ttelefono=" + telefono
				+ ",\n\tclientes=" + clientes + "\n]";
	}
	
}
