package prueba;

import entidad.OperacionAritmética;

public class PruebaExcepcion {
	public static void main(String[] args) {
		
		OperacionAritmética op = new OperacionAritmética();
		
		op.dividir(100, 0);
		
	}
}
