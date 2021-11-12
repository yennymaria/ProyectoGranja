package granja;

import java.util.ArrayList;
import java.util.List;

/**
 * En una ganja se tienen varios animales, que se compran para ser
 * criados y vendidos posteriormente.
 * 
 * Esta clase hace parte de un taller en la clase Ingeniería de Software, de manera que:
 * los datos son totalmente ficticios y la clase puede contener errores.
 * 
 * @author Sandra Hurtado
 * @version 8/05/2014
 */
public class Granja {
	
	private List<Animal> animales;
	
	public Granja(){
		animales = new ArrayList<Animal>();
	}
	
	/**
	 * Recibe la información de un animal que es comprado, para
	 * adicionarlo a la colección de animales de la granja.
	 * 
	 * @pre	nombre != null
	 * 
	 * @param nombre	El nombre del animal, por ejemplo: "Clarabella"
	 * @param peso		El peso, en kilos, del animal.
	 * @param tipo		Una cadena que define el tipo del animal (por ejemplo, "Oveja" o "Gallina")
	 */
	public void comprarAnimal(String nombre, double peso, String tipo) {
		Animal animalComprado = null;
		if (tipo.equals("Oveja")) {
			animalComprado = new Oveja(nombre, peso);
		}
		else if (tipo.equals("Gallina")) {
			animalComprado = new Gallina(nombre, peso);
		}
		
		if (animalComprado != null) {
			animales.add(animalComprado);
		}
	}
	
	/**
	 * Calcula la suma de los precios de venta de todos los animales que
	 * se tienen en la granja.
	 * 
	 * @return	El precio total de venta de los animales que se tienen en la granja.
	 */
	public double calcularTotal() {
		double precioTotal = 0;
		for (Animal animal : animales) {
			precioTotal += animal.calcularPrecio();
		}
		return precioTotal;
	}

}
