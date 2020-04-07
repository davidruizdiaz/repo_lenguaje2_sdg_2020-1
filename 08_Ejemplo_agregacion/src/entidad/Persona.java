package entidad;

public class Persona {

	// atributos
	private String nombreApellido;
	private String documento;
	private char sexo;
	
	// constructores
	public Persona() {
	
	}

	public Persona(String nombreApellido, String documento, char sexo) {
		super();
		this.nombreApellido = nombreApellido;
		this.documento = documento;
		this.sexo = sexo;
	}

	// getters y setters
	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [\n\tnombreApellido=" + nombreApellido
				+ ",\n\tdocumento=" + documento + ",\n\tsexo=" + sexo + "\n]";
	}
}
