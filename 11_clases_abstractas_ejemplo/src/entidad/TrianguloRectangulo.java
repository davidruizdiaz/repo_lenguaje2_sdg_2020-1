package entidad;

import generico.Figura;

public class TrianguloRectangulo extends Figura {
	
	// atributos
	private double base;
	private double altura;

	// constructor
	public TrianguloRectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	// getters y setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		double area = (this.base * this.altura)/2; 
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double lado = Math.sqrt( Math.pow(this.base, 2) + Math.pow(this.altura, 2) );
		double perimetro = this.base + this.altura + lado;
		return perimetro;
	}

	@Override
	public String toString() {
		return "TrianguloRectangulo [\n\tbase=" + base + ", \n\taltura="
				+ altura + ", \n\ttoString()=" + super.toString() + "\n]";
	}

}
