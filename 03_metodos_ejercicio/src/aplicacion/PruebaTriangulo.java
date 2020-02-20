package aplicacion;

import entidad.TrianguloEquilatero;

public class PruebaTriangulo {

	public static void main(String[] args) {
		
		// instancia
		TrianguloEquilatero tri = new TrianguloEquilatero(2, "pinki");
		
		System.out.println(tri.calculaPerimetro());

	}

}
