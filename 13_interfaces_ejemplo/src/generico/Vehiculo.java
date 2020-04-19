package generico;

public abstract class Vehiculo {
	// atributos
	private String marca;
	private String modelo;
	private int anhoFab;
	private String tipoVehiculo;
	// constructor por parametro
	public Vehiculo(String marca, String modelo, int anhoFab,
			String tipoVehiculo) {
		this.marca = marca;
		this.modelo = modelo;
		this.anhoFab = anhoFab;
		this.tipoVehiculo = tipoVehiculo;
	}
	// getters y setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnhoFab() {
		return anhoFab;
	}
	public void setAnhoFab(int anhoFab) {
		this.anhoFab = anhoFab;
	}
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	@Override
	public String toString() {
		return "Vehiculo [\n\tmarca=" + marca + ", \n\tmodelo=" + modelo
				+ ", \n\tanhoFab=" + anhoFab + ", \n\ttipoVehiculo="
				+ tipoVehiculo + "\n]";
	}
}
