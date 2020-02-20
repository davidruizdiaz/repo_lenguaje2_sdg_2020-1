package aplicacion;

import entidad.OperacionAritmetica;

public class PruebaOperacion {

	public static void main(String[] args) {
		
		// instanciacion de la clase OperacionAritmetica
		OperacionAritmetica suma = new OperacionAritmetica();
		
		suma.nombre = "suma";
		int a = 2, b = 5;
		String msj = "El resultado de la suma es: " + suma.realizaOperacion(a, b);
		
		System.out.println( msj );
		
		
		// mas una instancia
		// poner un nombre
		// imprimir resultado de la operacion
		
		OperacionAritmetica rst = new OperacionAritmetica();
		
		rst.nombre = "resta";
		a = 10;
		b = 5;
		System.out.println("El resultado de la resta es: " + rst.realizaOperacion(a, b));
		
		
		// Instanciacion con el constructor por parámetros
		OperacionAritmetica x = new OperacionAritmetica("division");
		System.out.println("El resultado de la division es: " + x.realizaOperacion(10, 2));
	}

}
