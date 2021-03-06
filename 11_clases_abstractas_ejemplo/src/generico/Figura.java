package generico;

public abstract class Figura {
	
	// atributo
	private String color;
	
	// constructor
	public Figura(String color) {
		this.color = color;
	}

	// getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Metodo abstracto.
	 * Se debe implementar en la clase específica <br>
	 * Debe calcular el área de la figura
	 */
	abstract public double calculaArea();
	
	/**
	 * Metodo abstracto.
	 * Se debe implementar en la clase específica <br>
	 * Debe calcular el perímetro de la figura
	 */
	abstract public double calculaPerimetro();
	
	/**
	 * Metodo statico para probar el polimorfismo.
	 * Imprime los resultados de los metodos calculaPerimetro()
	 * y calculaArea()
	 * @param figura {@link Figura}
	 * @return {@link String} resultado de los calculos
	 */
	static public void imprimeFigura(Figura figura){
		String msj = "\nEl area es: " + figura.calculaArea();
			   msj += "\nEl perimetro es:" + figura.calculaPerimetro();
			   
		System.out.println( msj );
	}
	
	@Override
	public String toString() {
		return "Figura [\n\tcolor=" + color + "\n]";
	}
	
}
