package entidad;

import generico.Figura;

public class Cuadrado extends Figura {
	
	// atributos
	private double lado;

	public Cuadrado(String color, double lado) {
		super(color);
		this.setLado(lado);
	}
	
	// getters y setters
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		double area = Math.pow(this.lado, 2);
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = this.lado * 4;
		return perimetro;
	}

	@Override
	public String toString() {
		return "Cuadrado [\n\tlado=" + lado + ", \n\ttoString()="
				+ super.toString() + "\n]";
	}

}
