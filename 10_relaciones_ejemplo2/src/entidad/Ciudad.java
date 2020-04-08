package entidad;

public class Ciudad {
	
	// atributos
	private int codigo;
	private String nombre;
	
	// constructores
	public Ciudad() {	}

	public Ciudad(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	// getters y setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ciudad [\n\tcodigo=" + codigo + ",\n\tnombre=" + nombre + "\n]";
	}
	
}
