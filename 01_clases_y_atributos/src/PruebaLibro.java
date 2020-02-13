// Nombre de clase
public class PruebaLibro {
	// método main
	public static void main(String[] args) {
		
		// instanciacion de la clase Libro
		// sintaxis --> tipoDeDato nombreDeVariable = operador-new constructor
		Libro miLibro = new Libro();
		
		// asignación de valores a atributos (atender el tipo de dato del atributo)
		// sintaxis --> objeto.atributo = valor;
		miLibro.titulo = "Hijo de Hombre";
		miLibro.autor = "Augusto Roa Bastos";
		miLibro.isbn = "ABC123";
		miLibro.cantPaginas = 150;
		miLibro.finalizado = true;
		
		// impresion de atributos del objeto
		System.out.println( "Título: " + miLibro.titulo );
		System.out.println( "Autor: " + miLibro.autor );
		System.out.println( "ISBN: " + miLibro.isbn );
		System.out.println( "Cantidad de páginas: " + miLibro.cantPaginas );
		
		// se verifica el valor del atributo finalizado, para imprimir el mensaje
		// si el valor de finalizado es true, imprime: Libro finalizado
		// si no, imprime: Libro NO finalizado
		if (miLibro.finalizado == true) {
			System.out.println("Libro finalizado");
		} else {
			System.out.println("Libro NO finalizado");
		}

	}

}
