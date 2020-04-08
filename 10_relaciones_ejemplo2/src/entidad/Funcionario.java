package entidad;

import java.util.Date;

public class Funcionario extends Persona {
	// atributos
	private int codigo;
	private String cargo;
	
	// constructores
	public Funcionario() {	}

	public Funcionario(String nombre, String apellido, String cedula,
			Date fNac, int codigo, String cargo, Ciudad ciudad) {
		super(nombre, apellido, cedula, fNac, ciudad);
		this.codigo = codigo;
		this.cargo = cargo;
	}

	// getters y setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [\n\tcodigo=" + codigo + ",\n\tcargo=" + cargo
				+ ",\n\ttoString()=" + super.toString() + "\n]";
	}
	
}
