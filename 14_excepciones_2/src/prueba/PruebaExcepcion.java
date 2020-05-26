package prueba;

import entidad.Producto;

public class PruebaExcepcion {
	public static void main(String[] args) {
		
		Producto p1 = new Producto("Chocolate", 20000, 100);
		p1.descuentaStock(101);
		
	}
}
