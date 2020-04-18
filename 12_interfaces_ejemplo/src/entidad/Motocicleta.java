package entidad;

import generico.ControlVehiculo;
import generico.Vehiculo;

public class Motocicleta extends Vehiculo implements ControlVehiculo {
	
	// atributo
	private String tipoCambio;

	// constructor
	public Motocicleta(String marca, String modelo, int anhoFab,
			String tipoVehiculo, String tipoCambio) {
		super(marca, modelo, anhoFab, tipoVehiculo);
		this.tipoCambio = tipoCambio;
	}
	
	// getters y setters
	public String getTipoCambio() {
		return tipoCambio;
	}

	// metodos de la interfaz
	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	@Override
	public void arranca() {
		System.out.println("La motocicleta arranca");
	}

	@Override
	public void cambiaVelocidad() {
		System.out.println("La motocicleta cambia");
	}

	@Override
	public void acelera() {
		System.out.println("La motocicleta acelera");
	}

	@Override
	public void frena() {
		System.out.println("La motocicleta frena");
	}

	@Override
	public void estaciona() {
		System.out.println("La motocicleta estaciona");
	}

	@Override
	public String toString() {
		return "Motocicleta [\n\ttipoCambio=" + tipoCambio
				+ ", \n\ttoString()=" + super.toString() + "\n]";
	}
	
}
