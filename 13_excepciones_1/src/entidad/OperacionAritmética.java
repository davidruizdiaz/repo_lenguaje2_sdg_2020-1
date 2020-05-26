package entidad;

public class OperacionAritm�tica {
	
	// constructor
	public OperacionAritm�tica() {	}
	
	// m�todo dividir
	public void dividir( int dividendo, int divisor ) {
		try {
			System.out.println( "El resultado es: " + ( dividendo / divisor ) );
		} catch (ArithmeticException e) {
			System.err.println("No se permite la divisi�n entre cero");
			System.out.println("Por favor corrija y vuelva a intentar");
		} finally {
			System.out.println("Adios!");
		}
	}

}
