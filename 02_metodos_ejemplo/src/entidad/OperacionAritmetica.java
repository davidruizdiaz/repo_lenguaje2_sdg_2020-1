package entidad;

// Nombre de la clase
public class OperacionAritmetica {

	// atributo
	public String nombre;
	
	// CONSTRUCTORES
	// constructor por defecto
	public OperacionAritmetica() {
		
	}
	
	// 	constructor por parámetros
	public OperacionAritmetica(String nom){
		this.nombre = nom;
	}

	// método
	public int realizaOperacion(int valor1, int valor2) {

		int resultado = 0;

		if (nombre == "suma") {

			resultado = valor1 + valor2;

		}
		if (nombre == "resta") {

			resultado = valor1 - valor2;

		}
		if (nombre == "multiplicacion") {

			resultado = valor1 * valor2;

		}
		if (nombre == "division") {

			resultado = valor1 / valor2;

		}

		return resultado;
	}

}
