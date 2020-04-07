package prueba;

import java.util.ArrayList;
import java.util.List;

import entidad.Cliente;
import entidad.Empresa;

public class PruebaAgregacion {
	public static void main(String[] args) {
		
		// instanciacion de las clases necesarias
		// clientes
		Cliente cli1 = new Cliente("Ana Franck", "231", 'f', "premiun", 1);
		Cliente cli2 = new Cliente("Juan Peres", "232", 'm', "regular", 2);
		Cliente cli3 = new Cliente("Luna Núñez", "233", 'f', "premiun", 3);
		
		// lista
		List<Cliente> misClientes = new ArrayList<Cliente>();
		
		// agregar los clientes a la lista
		misClientes.add(cli1);
		misClientes.add(cli2);
		misClientes.add(cli3);
		
		// empresa
		Empresa emp = new Empresa("Empresa SA", "021333444", misClientes);
		
		// prueba de la relacion
		// impresión de la lista de clientes a través de la empresa
		System.out.println( emp.getClientes() );
	}
}
