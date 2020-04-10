package prueba;

import entidad.Cuadrado;
import entidad.TrianguloRectangulo;
import generico.Figura;

public class PruebaFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cuadrado = new Cuadrado("amarillo", 5);
		TrianguloRectangulo triangulo = new TrianguloRectangulo("verde", 5, 10);
		
		Figura.imprimeFigura( cuadrado );
		
		Figura.imprimeFigura( triangulo );

	}

}
