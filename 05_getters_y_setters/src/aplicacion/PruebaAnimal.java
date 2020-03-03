package aplicacion;

import java.util.Date;

import entidad.Animal;

public class PruebaAnimal {

	public static void main(String[] args) {
		// instanciacion con el constructor por defecto
		// ya no se puede asignar valores a los atributors
		// privados que no tienen setters
		Animal miAnimal = new Animal();
		
		// se asigna un nombre al nuevo animal utilizando 
		// el método setNombre de la clase Animal
		miAnimal.setNombre("Animalito");
		
		// impresión de todos los atributos del objeto
		// utilizando el método toString
		System.out.println( miAnimal );
		
		
		// instanciacion con el constructor por parámetros
		Animal otroAnimal = new Animal("HEM", "pitbull", "canino", new Date("2000/01/01"));
		
		otroAnimal.setNombre("Shakira");
		
		System.out.println( otroAnimal );
		
		// Prueba de los médodos getters
		System.out.println("El sexo de " 
							+ otroAnimal.getNombre() 
							+ " es "
							+ otroAnimal.getSexo()
							);
		
	}

}
