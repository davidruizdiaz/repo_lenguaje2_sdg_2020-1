package aplicacion;

import entidad.Gato;
import entidad.Perro;

public class PruebaAnimal {
	
	public static void main(String[] args) {
		
		/* Prueba de la clase Gato */
		
		// instanciacion de Gato
		Gato michi = new Gato();
		
		// prueba de la herencia
		// se imprime el metodo duerme que esta en la
		// clase Animal utilizando a Gato
		System.out.println(michi.duerme());
		
		// instanciación de más un objeto Gato, pero
		// utilizando el constructor por parámetro
		Gato otromichi = new Gato("Siames", "Hembra", "Boli", "Azul");
		
		// se imprime el atributo especie que está en la 
		// clase Animal
		System.out.println(otromichi.getEspecie());
		
		// se impreme el toString de la clase Gato
		// que ya contiene el toString de la super clase
		System.out.println(otromichi);
		
		
		
		
		/* Prueba de la clase Perro */
		
		// instanciacion de la clase Perro utilizando
		// el constructor por parámetros
		Perro perrito =  new Perro("canino", "maco", "pupi", "nego");
		
		// prueba todos los atributos
		System.out.println(perrito);
		
		// pruba el método muerde
		System.out.println(perrito.muerme());
	}

}
