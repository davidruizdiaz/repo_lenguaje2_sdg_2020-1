package entidad;

public class Pelicula {

	// atributos
	private int codigo;
	private String titulo;
	private int precio;
	
	// constructores
	public Pelicula() {	}

	public Pelicula(int codigo, String titulo, int precio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.precio = precio;
	}

	// getters y setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pelicula [\n\tcodigo=" + codigo + ",\n\ttitulo=" + titulo
				+ ",\n\tprecio=" + precio + "\n]";
	}

}
