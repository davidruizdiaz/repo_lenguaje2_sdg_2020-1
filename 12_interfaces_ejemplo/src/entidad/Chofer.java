package entidad;

import generico.ControlVehiculo;

public class Chofer {
	
	// atributos
	private int registro;
	private ControlVehiculo vehiculo;

	// contructor
	public Chofer(int registro) {
		this.registro = registro;
	}

	// getters y setters
	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public ControlVehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(ControlVehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Chofer [\n\tregistro=" + registro + ", \n\tvehiculo="
				+ vehiculo + "\n]";
	}
	
}
