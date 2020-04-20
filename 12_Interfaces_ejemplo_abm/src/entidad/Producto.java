package entidad;

import generico.OperacionesABM;

public class Producto implements OperacionesABM {

	// atributos
	private int id;
	private String descripcion;
	private double precio;
	
	//controlador
	public Producto(int id, String descripcion, double precio) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	// setters y getters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// metodos de la interfaz
	@Override
	public void insertar() {
		System.out.println("Producto insertado");
	}
	
	@Override
	public void modificar() {
		System.out.println("Producto actualizado");
	}
	
	@Override
	public void listar() {
		System.out.println("Lista de productos");
	}
	
	@Override
	public void recuperaPorId() {
		System.out.println("Producto recuperado");
	}
	
	@Override
	public void eliminar() {
		System.out.println("Producto eliminado");
	}
	
	@Override
	public String toString() {
		return "Producto [\n\tid=" + id + ", \n\tdescripcion=" + descripcion
				+ ", \n\tprecio=" + precio + "\n]";
	}
	
}
