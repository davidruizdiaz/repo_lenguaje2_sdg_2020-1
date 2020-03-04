package aplicacion;

import entidad.Bombilla;

public class PruebaBombilla {

	public static void main(String[] args) {
		
		// instancia de clase
		Bombilla foco = new Bombilla(false, 100, "amarillo");
		
		// prueba para el toString
		System.out.println(foco);
		
		// Prueba para los getters y setters
		foco.setHoras(20);
		System.out.println( foco.getHoras() );
		
		// prueba de los métos apagar y encender
		foco.setEstado(true);
		System.out.println( foco.apagar() );
		
		
		System.out.println( foco.encender(3) );
		
		// verificación del estado final
		System.out.println( foco.isEstado() );
		
	}

}
