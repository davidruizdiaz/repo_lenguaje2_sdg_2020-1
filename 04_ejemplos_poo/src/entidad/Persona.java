package entidad;

import java.util.Date;

// clase persona
public class Persona {
	
	// atributos
	public String sexo;
	public Date fechaNac;
	public String ci;
	public String nombre;
	public String apellido;
	
	// metodos constructores
	
	// constructor por defecto que asigna valores
	// de inicializacion por defecto a los atributos
	public Persona() {
		this.sexo = "f";
		this.ci = "0000";
		this.nombre = "Fulano";
		this.apellido = "Ramirez";
		this.fechaNac = new Date();
	}

	 
	/**
	 * constructor por parametros.
	 * Inicializar los valores de los atributos
	 * con valores que se le pasar cuando se
	 * instancie la clase
	 * @param sexo {@link String}
	 * @param fechaNac {@link Date}
	 * @param ci
	 * @param nombre
	 * @param apellido
	 */
	public Persona(String sexo, Date fechaNac, String ci, String nombre,
			String apellido) {
		this.sexo = sexo;
		this.fechaNac = fechaNac;
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	// métodos
	
	/**
	 * Devuelve el nombre completo de la persona.
	 * Concatena el nombre y el apellido en un sólo string
	 * 
	 * @return nombre + apellido {@link String} 
	 */
	public String decirNombreCompleto(){
		return "Mi nombre es " + this.nombre + " " + this.apellido;
	}
	
	/**
	 * Saluda a otra persona.
	 * El método emula el saludo entre dos personas, tomando en cuenta el
	 * sexo del que saluda y del que es saludado 
	 * 
	 * @param alguien {@link Persona}
	 * @return saludo {@link String}
	 */
	public String saludar( Persona alguien ){
				
		String msj = "";
		
		if( this.sexo == "m" ){ 		// si el que saludo es hombre
			if (alguien.sexo == "f") {
				msj = "Hola señorita!";
			} else {
				msj = "Haupei kape!";
			}
		} else {						// si el que saluda es mujer
			if (alguien.sexo == "f") {
				msj = "Hola ami!";
			} else {
				msj = "Hola churro!";
			}
		}
		
		return msj;
		
	}
	
}












