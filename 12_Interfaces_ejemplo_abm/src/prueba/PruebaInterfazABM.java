package prueba;

import entidad.Cliente;
import entidad.ControladorABM;
import entidad.Funcionario;
import entidad.Producto;
import generico.OperacionesABM;

public class PruebaInterfazABM {

	public static void main(String[] args) {
		
		// cliente
		OperacionesABM cli = new Cliente("José", "0982555666", 1, "vip");
		ControladorABM controlador = new ControladorABM(cli);
		controlador.getObjetoABM().insertar();
		
		// funcionario
		Funcionario fun = new Funcionario("Arturo", "0971999666", 10, "vendedor");
		controlador.setObjetoABM(fun);
		controlador.getObjetoABM().listar();
		
		// Producto
		Producto prod = new Producto(1, "galletita", 2000);
		controlador.setObjetoABM(prod);
		controlador.getObjetoABM().modificar();
		
	}

}
