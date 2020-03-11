package entidad;
/**
 * La clase Perro extiende de la clase Animal.
 * Quiere decir que la clase Perro, hereda todos los 
 * atributos y métodos de la clase Animal
 */
public class Perro extends Animal {

	// atributos
	private String nombre;
	private String color;

	// constructore
	/// por defecto
	public Perro() {
		// TODO Auto-generated constructor stub
	}

	/// por parámetros
	/// los parámetros especie y sexo son pasados
	/// al constructor de la super clase
	public Perro(String especie, String sexo, String nombre, String color) {
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
	 * Método muerme 
	 */
	public String muerme(){
		return "El perro muerme";
	}

	/**
	 * Método jadea
	 */
	public String jadea(){
		return "El Perro jadea";
	}

	@Override
	public String toString() {
		return "Perro [\n\tnombre=" + nombre + ", \n\tcolor=" + color
				+ ", \n\ttoString()=" + super.toString() + "\n]";
	}

}
