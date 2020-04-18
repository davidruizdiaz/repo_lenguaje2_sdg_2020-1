package prueba;

import entidad.Automovil;
import entidad.Chofer;
import entidad.Motocicleta;

public class PruebaVehiculo {
	public static void main(String[] args) {
		
		Motocicleta ninja = new Motocicleta("Honada", "RX 23", 2020, "terrestre", "mecanico");
		Automovil bmw = new Automovil("BMW", "Ax001", 2020, "terrestre", "4x2");
		
		Chofer chofer = new Chofer(123);
		
		chofer.setVehiculo(ninja);
		
		chofer.getVehiculo().arranca();
		
		chofer.setVehiculo(bmw);
		
		chofer.getVehiculo().arranca();
		
	}
}
