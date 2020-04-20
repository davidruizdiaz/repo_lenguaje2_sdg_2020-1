package entidad;

import generico.OperacionesABM;
import generico.Persona;

public class Cliente extends Persona implements OperacionesABM {

	// atributos
	private int id;
	private String categoria;
	
	// constructor
	public Cliente(String nombre, String telefono, int id, String categoria) {
		super(nombre, telefono);
		this.id = id;
		this.categoria = categoria;
	}

	// getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	// metodos de la interfaz
	@Override
	public void insertar() {
		System.out.println("Cliente insertado");
	}

	@Override
	public void modificar() {
		System.out.println("Cliente modificado");
	}

	@Override
	public void listar() {
		System.out.println("Lista de clientes");
	}

	@Override
	public void recuperaPorId() {
		System.out.println("Cliente recuperado");
	}

	@Override
	public void eliminar() {
		System.out.println("Cliente eliminado");
	}

	@Override
	public String toString() {
		return "Cliente [\n\tid=" + id + ", \n\tcategoria=" + categoria
				+ ", \n\ttoString()=" + super.toString() + "\n]";
	}
	
}
