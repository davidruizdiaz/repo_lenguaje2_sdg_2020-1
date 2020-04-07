package entidad;

public class Cliente extends Persona {
	
	// atributos
	private String categoria;
	private int codigo;
	
	// constructores
	public Cliente() {
		
	}

	public Cliente(String nombreApellido, String documento, char sexo,
			String categoria, int codigo) {
		super(nombreApellido, documento, sexo);
		this.categoria = categoria;
		this.codigo = codigo;
	}

	// getters y setters
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Cliente [\n\tcategoria=" + categoria + ",\n\tcodigo=" + codigo
				+ ",\n\ttoString()=" + super.toString() + "\n]";
	}

}

