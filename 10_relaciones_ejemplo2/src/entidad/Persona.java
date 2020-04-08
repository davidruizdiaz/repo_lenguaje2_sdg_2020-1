package entidad;

import java.util.Date;

public class Persona {
	
	//	atributos
	private String nombre;
	private String apellido;
	private String cedula;
	private Date fNac;
	
	private Ciudad ciudad;
	
	// constructores
	public Persona() {	}

	public Persona(String nombre, String apellido, String cedula, Date fNac, Ciudad ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.fNac = fNac;
		this.setCiudad(ciudad);
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Date getfNac() {
		return fNac;
	}

	public void setfNac(Date fNac) {
		this.fNac = fNac;
	}
	
	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Método muestraEdad.
	 * Calcula la edad utilizando el atributo fNac.
	 * @return msj {@link String}
	 */
	public String muestraEdad(){
		int anhoActual = new Date().getYear();
		int anhoNacimiento = this.fNac.getYear();
		
		int edad = anhoActual - anhoNacimiento;
		
		String msj = this.nombre + " tiene " + edad + " años";
		
		return msj;
	}

	@Override
	public String toString() {
		return "Persona [\n\tnombre=" + nombre + ",\n\tapellido=" + apellido
				+ ",\n\tcedula=" + cedula + ",\n\tfNac=" + fNac + "\n]";
	}	

}
