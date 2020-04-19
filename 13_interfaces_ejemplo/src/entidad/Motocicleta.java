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
	@Override
	public void arranca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiaVelocidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frena() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estaciona() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Motocicleta [\n\ttipoCambio=" + tipoCambio
				+ ", \n\ttoString()=" + super.toString() + "\n]";
	}
	
}
