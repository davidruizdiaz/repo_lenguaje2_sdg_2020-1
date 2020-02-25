package aplicacion;

import java.util.Date;

import entidad.Persona;

public class PruebaPersona {

	public static void main(String[] args) {
		
		// instanciación por el constructor por parámetros
		Persona per1 = new Persona("m", new Date("1985/03/12"), "200021", "mengano", "lópez");
		
		// construcción de un string para el mensaje
		String msj = "Nombre: " + per1.nombre;
			   msj += "\nApellido: "+ per1.apellido;
			   msj += "\nDocumento: "+ per1.ci;
			   msj += "\nSexo: "+ ( (per1.sexo == "f" ) ? "Femenino" : "Masculino"); // operador ternario  [condicion] ? [valor si true] : [valor si false]
			   msj += "\nFecha de nacimiento: "+ per1.fechaNac;
		
		// Prueba de todos los atributos
		System.out.println(msj);
		
		// prueba del método decirNombreCompleto()
		System.out.println( per1.decirNombreCompleto() );
		
		// instanciacion de otra persona con el constructor por defecto
		Persona per2 = new Persona();
		
		// reasignacion de valor al atributo sexo
		per2.sexo = "m";
		
		
		// prueba del método saludar
		System.out.println( per1.saludar( per2 ) );
		
		System.out.println();
		
		System.out.println( per2.saludar(per1) );
	}

}

   