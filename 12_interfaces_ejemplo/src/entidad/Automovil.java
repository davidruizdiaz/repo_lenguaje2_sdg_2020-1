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
		System.out.println("El automovil arranca");
	}

	@Override
	public void cambiaVelocidad() {
		System.out.println("El automovil cambia velocidad");
	}

	@Override
	public void acelera() {
		System.out.println("El automovil aclera");
	}

	@Override
	public void frena() {
		System.out.println("El automovil frena");
	}

	@Override
	public void estaciona() {
		System.out.println("El automovil estaciona");
	}

	@Override
	public String toString() {
		return "Automovil [\n\ttipoTraccion=" + tipoTraccion
				+ ", \n\ttoString()=" + super.toString() + "\n]";
	}

}
