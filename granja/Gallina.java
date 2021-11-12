package granja;

/**
 * Una gallina de la granja, que es criada para luego ser vendida.
 */
public class Gallina extends Animal {

	public Gallina(String nombre, double peso) {
		super(nombre, peso);
	}

	@Override
	public double calcularPrecio() {
		return (10000 + getPeso()*50);
	}

}
