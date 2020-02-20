package entidad;

public class TrianguloEquilatero {
	
	// atributos
	public int lado;
	public String color;
	
	// Constructores
	public TrianguloEquilatero() {

	}
	
	public TrianguloEquilatero(int lado, String color) {
		this.color = color;
		this.lado = lado;
	}
	
	// metodo
	public int calculaPerimetro(){
		int perimetro = lado * 3;
		return perimetro;
	}


}
