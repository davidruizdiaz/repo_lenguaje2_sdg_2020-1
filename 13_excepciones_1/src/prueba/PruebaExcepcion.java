package prueba;

import entidad.OperacionAritm�tica;

public class PruebaExcepcion {
	public static void main(String[] args) {
		
		OperacionAritm�tica op = new OperacionAritm�tica();
		
		op.dividir(100, 0);
		
	}
}
