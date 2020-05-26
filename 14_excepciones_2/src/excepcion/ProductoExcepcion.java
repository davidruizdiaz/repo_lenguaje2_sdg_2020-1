package excepcion;

import javax.swing.JOptionPane;

import entidad.Producto;

public class ProductoExcepcion extends Exception {
	
	public ProductoExcepcion( Producto producto, int cantidad ) {
		super();
		
		String msj = "No se permite descontar una cantidad mayor a la del stock";
			   msj += "\nProducto: " + producto.getDescripcion();
			   msj += "\nCantidad que se intenta descontar: " + cantidad;
			   msj += "\nCantidad actual en stock: " + producto.getCantidadStock();
		
		System.err.println( msj );
		
		JOptionPane.showMessageDialog(null, msj, "Atención!!", JOptionPane.ERROR_MESSAGE);
		
	}
	
}
