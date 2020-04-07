package prueba;

import java.util.Date;

import entidad.Cliente;
import entidad.Pedido;

public class PruebaAsociacion {

	public static void main(String[] args) {
		
		// Instanciaci�n de la clase cliente
		Cliente cli = new Cliente( "Salom�n Medina", "Asunci�n" );
		
		// Instanciaci�n de la clase Pedido
		Pedido pedido1 = new Pedido( new Date(), false, 1, 10000, cli );
		
		// Impresion del cliente a trav�s del pedido
		// Esto prueba la relaci�n de asociaci�n
		System.out.println( "Cliente del pedido1:\n\n" + pedido1.getCliente() );

	}

}

