package prueba;

import java.util.Date;

import entidad.Cliente;
import entidad.Pedido;

public class PruebaAsociacion {

	public static void main(String[] args) {
		
		// Instanciación de la clase cliente
		Cliente cli = new Cliente( "Salomón Medina", "Asunción" );
		
		// Instanciación de la clase Pedido
		Pedido pedido1 = new Pedido( new Date(), false, 1, 10000, cli );
		
		// Impresion del cliente a través del pedido
		// Esto prueba la relación de asociación
		System.out.println( "Cliente del pedido1:\n\n" + pedido1.getCliente() );

	}

}

