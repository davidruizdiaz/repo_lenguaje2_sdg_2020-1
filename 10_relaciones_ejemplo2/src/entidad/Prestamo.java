package entidad;

import java.util.Date;
import java.util.List;

public class Prestamo {
	
	// atributos
	private String tipo;
	private Date fchPrestamo;
	private Date fchLimite;
	
	private Socio socio;
	private Funcionario funcionario;
	
	private List<Pelicula> peliculas;
	
	// constructores	
	public Prestamo() {	}

	public Prestamo(String tipo, Date fchPrestamo, Date fchLimite, Socio socio,
			Funcionario funcionario, List<Pelicula> peliculas) {
		super();
		this.tipo = tipo;
		this.fchPrestamo = fchPrestamo;
		this.fchLimite = fchLimite;
		this.socio = socio;
		this.funcionario = funcionario;
		this.peliculas = peliculas;
	}

	// getters y setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFchPrestamo() {
		return fchPrestamo;
	}

	public void setFchPrestamo(Date fchPrestamo) {
		this.fchPrestamo = fchPrestamo;
	}

	public Date getFchLimite() {
		return fchLimite;
	}

	public void setFchLimite(Date fchLimite) {
		this.fchLimite = fchLimite;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	/**
	 * Método que imprime las peliculas contenidas en la lista de peliculas.
	 * @return devuelve un {@link String} msj, con los datos del {@link Socio}, el
	 * {@link Funcionario} el nombre de cada {@link Pelicula} incluida en la lista con su precio y
	 * el total de la suma de los precios de las peliculas
	 */
	public String imprimePrestamo(){
		String msj = "\nPrestamo del socio " + this.socio.getCodigo();
			   msj += "\n"+ this.socio.getNombre() + " " + this.socio.getApellido();
			   msj += "\nFuncionario " + this.funcionario.getCodigo();
			   msj += "\n" + this.funcionario.getNombre() + " " + this.funcionario.getApellido();
			   msj += "\n------------------------";
		
		int total = 0;
		
		for (Pelicula peli : peliculas) {
			msj += "\n"+ peli.getTitulo() + " - " + peli.getPrecio();
			total += peli.getPrecio();
		}
		
		msj += "\n------------------------";
		msj += "\nTotal: " + total +"Gs";
		
		return ( total > 0 ) ? msj : "";
	}
	
	@Override
	public String toString() {
		return "Perstamo [\n\ttipo=" + tipo + ",\n\tfchPrestamo=" + fchPrestamo
				+ ",\n\tfchLimite=" + fchLimite + ",\n\tsocio=" + socio
				+ ",\n\tfuncionario=" + funcionario + ",\n\tpeliculas="
				+ peliculas + "\n]";
	}
	
}
