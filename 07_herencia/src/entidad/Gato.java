package entidad;

/**
 * La clase Gato extiende de la clase Animal.
 * Quiere decir que la clase Gato, hereda todos los 
 * atributos y métodos de la clase Animal
 */
public class Gato extends Animal{
	
	// atributos
	private String nombre;
	private String color;
	
	// constructore
	/// por defecto
	public Gato() {
		// TODO Auto-generated constructor stub
	}

	/// por parámetros
	/// los parámetros especie y sexo son pasados
	/// al constructor de la super clase
	public Gato(String especie, String sexo, String nombre, String color) {
		super(especie, sexo);
		this.nombre = nombre;
		this.color = color;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Método duerme 
	 */
	public String duerme(){
		return "El gato duerme";
	}
	
	/**
	 * Método ronronea
	 */
	public String ronronea(){
		return "El gato ronronea mrrrmrrrmrr";
	}
	@Override
	public String toString() {
		return "Gato [\n\tnombre=" + nombre + ", \n\tcolor=" + color
				+ ", \n\ttoString()=" + super.toString() + "\n]";
	}

	
	
	

}
