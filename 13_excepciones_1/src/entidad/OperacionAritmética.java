package entidad;

public class OperacionAritmética {
	
	// constructor
	public OperacionAritmética() {	}
	
	// método dividir
	public void dividir( int dividendo, int divisor ) {
		try {
			System.out.println( "El resultado es: " + ( dividendo / divisor ) );
		} catch (ArithmeticException e) {
			System.err.println("No se permite la división entre cero");
			System.out.println("Por favor corrija y vuelva a intentar");
		} finally {
			System.out.println("Adios!");
		}
	}

}
