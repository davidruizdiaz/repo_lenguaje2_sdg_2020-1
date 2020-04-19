package entidad;

import generico.OperacionesABM;
import generico.Persona;

public class Funcionario extends Persona implements OperacionesABM {

	// atributos
	private int id;
	private String tipo;
	
	// constructor
	public Funcionario(String nombre, String telefono, int id, String tipo) {
		super(nombre, telefono);
		this.id = id;
		this.tipo = tipo;
	}

	// getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// metodos de la interfaz
	@Override
	public void insertar() {
		System.out.println("Funcionario insertado");
	}

	@Override
	public void modificar() {
		System.out.println("Funcionario modificado");
	}

	@Override
	public void listar() {
		System.out.println("Lista de funcionarios");
	}

	@Override
	public void recuperaPorId() {
		System.out.println("Funcionario recuperado");
	}

	@Override
	public void eliminar() {
		System.out.println("Funcionario eliminado");
	}
	
	@Override
	public String toString() {
		return "Funcionario [\n\tid=" + id + ", \n\ttipo=" + tipo
				+ ", \n\ttoString()=" + super.toString() + "\n]";
	}
	
}
