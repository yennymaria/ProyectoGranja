package granja;

/**
 * Un animal de la granja, que es criado para luego ser vendido.
 */
public abstract class Animal {
	
	private String nombre;
	private double peso;
	
	public Animal(String nombre, double peso){
		this.nombre = nombre;
		this.peso = peso;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPeso() {
		return peso;
	}
	
	/**
	 * Calcula el precio del animal para su venta.
	 * 
	 * @return	el precio de venta del animal
	 */
	public abstract double calcularPrecio();

}
