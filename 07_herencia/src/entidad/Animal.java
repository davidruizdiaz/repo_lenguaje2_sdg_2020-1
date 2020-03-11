package entidad;

public class Animal {
	// atributos
	private String especie;
	private String sexo;
	
	// constructores
	/// por defecto
	public Animal() {
	}

	/// por parámetros
	public Animal(String especie, String sexo) {
		this.especie = especie;
		this.sexo = sexo;
	}
	
	// getters y setters
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/* Método duerme */
	public String duerme(){
		return "El animal duerme Zzzz";
	}
	
	/* Método come */
	public String come(){
		return "El animal esta comiendo";
	}

	@Override
	public String toString() {
		return "Animal [\n\tespecie=" + especie + ", \n\tsexo=" + sexo + "\n]";
	}

}
