package granja;

/**
 * Una oveja de la granja, que es criada para luego ser vendida.
 * 
 */
public class Oveja extends Animal {

	public Oveja(String nombre, double peso) {
		super(nombre, peso);
	}

	@Override
	public double calcularPrecio() {
		return (50000 + getPeso()*200);
	}

}
