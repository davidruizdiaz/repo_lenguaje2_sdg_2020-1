package entidad;

import java.util.Date;

public class Socio extends Persona {
	
	// atributos
	private int codigo;
	private String tipo;
	
	// constructores
	public Socio() {	}

	public Socio(String nombre, String apellido, String cedula, Date fNac,
			int codigo, String tipo, Ciudad ciudad) {
		super(nombre, apellido, cedula, fNac, ciudad);
		this.codigo = codigo;
		this.tipo = tipo;
	}

	// getters y setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Socio [\n\tcodigo=" + codigo + ",\n\ttipo=" + tipo
				+ ",\n\ttoString()=" + super.toString() + "\n]";
	}
	
}
