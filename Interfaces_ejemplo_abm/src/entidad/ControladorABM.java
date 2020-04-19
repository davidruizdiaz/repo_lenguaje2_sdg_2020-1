package entidad;

import generico.OperacionesABM;

public class ControladorABM {
	
	// atributos
	private OperacionesABM objetoABM;

	// controlador
	public ControladorABM(OperacionesABM objetoABM) {
		this.objetoABM = objetoABM;
	}
	
	// getters y setters
	public OperacionesABM getObjetoABM() {
		return objetoABM;
	}

	public void setObjetoABM(OperacionesABM objetoABM) {
		this.objetoABM = objetoABM;
	}

	@Override
	public String toString() {
		return "ControladorABM [\n\tobjetoABM=" + objetoABM + "\n]";
	}

}
