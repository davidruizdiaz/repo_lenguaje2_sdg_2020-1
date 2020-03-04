package entidad;

public class Bombilla {
	
	// atributos
	private boolean estado;
	private int potencia;
	private String color;
	private int horas = 10;
	
	// constructores
	public Bombilla() {
		
	}

	public Bombilla(boolean estado, int potencia, String color) {
		this.estado = estado;
		this.potencia = potencia;
		this.color = color;
	}
	
	//getters y setters
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	/**
	 * Apaga el foco. tiene la siguiente lógica:
	 * <pre>
	 * SI el foco esta apagado:
	 * |	devolver "El foco YA está apagado"
	 * SINO:
	 * |	cambiar el estado
	 * |	devolver "El foco fue apagado"	
	 * </pre>
	 * @return mensaje de tipo String
	 */
	public String apagar(){
		
		if( estado == false ){
			
			return "El foco YA está apagado";
			
		} else {
			
			estado = false;
			return "Foco fue apagado";
		}
		
	}

	/**
	 * Método para encender el foco.
	 * Recibe un parámetrod de tipo entero. Y se aplica la
	 * siguiente lógica:
	 * <pre>
	 * SI el foco esta apagado:
	 * |		SI el foco aún tiene hora:
	 * |		|	cambiar el estado
	 * |		|	restar las horas
	 * |		|	interrumpir la ejecución
	 * |		|	devolver el mensaje con los detalles y lo apaga
	 * |		SINO:
	 * |		|	devolver "El foco está quemado"
	 * SINO:
	 * |			devolver "El foco Ya esta encendido"	
	 * </pre>
	 * 
	 * @param cant de tipo entero
	 * @return mesaje de tipo string
	 */
	public String encender(int cant) {
		
		if (estado = false) { // si esta apagado
			
			if ( horas > 0 ) { // si aun tiene horas
				
				estado = true;
				horas -= cant;
				
				try {
					Thread.sleep(cant*1000); // interrumpe la ejecución
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				return "Foco encendido por "+ cant +"hs\n"
						+"Le sobran "+ horas +"hs\n"
						+ apagar();
				
			} else {	// si no quedan horas
				
				return "El foco está quemado";
				
			}
			
		} else { // si ya está encendido
			return "El foco YA esta encendido";
		}
		
	}
	

	@Override
	public String toString() {
		return "Bombilla [\n\testado=" + estado + ", \n\tpotencia=" + potencia
				+ ", \n\tcolor=" + color + ", \n\thoras=" + horas + "\n]";
	}

}
