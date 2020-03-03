package entidad;

import java.util.Date;

// nombre de la clase
public class Animal {
	
	// atributos
	private String sexo;
	private String raza;
	private String especie;
	private Date nacimiento;
	private String nombre;
	
	// métodos constructores
	public Animal() {
		
	}

	/**
	 * Constructor por parámetros de la clase Animal.
	 * No incluye el atributo nombre
	 * @param sexo {@link String}
	 * @param raza
	 * @param especie
	 * @param nacimiento
	 */
	public Animal(String sexo, String raza, String especie, Date nacimiento) {
		this.sexo = sexo;
		this.raza = raza;
		this.especie = especie;
		this.nacimiento = nacimiento;
	}
	
	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public String getRaza() {
		return raza;
	}

	public String getEspecie() {
		return especie;
	}

	public Date getNacimiento() {
		return nacimiento;
	}
	
	public String mostrarEdad(){
	  //variable = añoActual - añoNacimiento
		int edad = new Date().getYear() - nacimiento.getYear();

		return "La edad de" + nombre + " es " + edad + " años";
	}

	@Override
	public String toString() {
		return "Animal [\n\tsexo=" + sexo + ", \n\traza=" + raza
				+ ", \n\tespecie=" + especie + ", \n\tnacimiento=" + nacimiento
				+ ", \n\tnombre=" + nombre + "\n]";
	}
	
}
