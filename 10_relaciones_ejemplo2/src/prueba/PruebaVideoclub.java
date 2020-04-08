package prueba;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidad.Ciudad;
import entidad.Funcionario;
import entidad.Pelicula;
import entidad.Persona;
import entidad.Prestamo;
import entidad.Socio;

public class PruebaVideoclub {

	public static void main(String[] args) {
		
		Ciudad ciu = new Ciudad(1,"Asunción");
		
		Funcionario funcionario = new Funcionario("Pablo", "Mora", "123", new Date("2000/01/20"), 10, "vendedor", ciu);
		
		Socio socio = new Socio("Ana", "Amarilla", "321", new Date("1990/01/01"), 11, "vip", ciu);
		
		Pelicula peli1 = new Pelicula(1, "Star wars", 20000);
		Pelicula peli2 = new Pelicula(2, "Matrix", 30000);
		Pelicula peli3 = new Pelicula(3, "Rambo", 15000);
		
		List<Pelicula> pelis = new ArrayList<Pelicula>();
		pelis.add(peli1);
		pelis.add(peli2);
		pelis.add(peli3);
		
		Prestamo prestamo = new Prestamo("contado", new Date(), new Date("2020/04/30"), socio, funcionario, pelis);
		
		System.out.println(prestamo.getFuncionario().muestraEdad());
		
		System.out.println(prestamo.imprimePrestamo());

	}

}
