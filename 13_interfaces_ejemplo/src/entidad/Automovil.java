package entidad;

import generico.ControlVehiculo;
import generico.Vehiculo;

public class Automovil extends Vehiculo implements ControlVehiculo {
	
	// atributo
	private String tipoTraccion;

	// constructor
	public Automovil(String marca, String modelo, int anhoFab,
			String tipoVehiculo, String tipoTraccion) {
		super(marca, modelo, anhoFab, tipoVehiculo);
		this.tipoTraccion = tipoTraccion;
	}

	// getters y seters
	public String getTipoTraccion() {
		return tipoTraccion;
	}

	public void setTipoTraccion(String tipoTraccion) {
		this.tipoTraccion = tipoTraccion;
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
		return "Automovil [\n\ttipoTraccion=" + tipoTraccion
				+ ", \n\ttoString()=" + super.toString() + "\n]";
	}

}
