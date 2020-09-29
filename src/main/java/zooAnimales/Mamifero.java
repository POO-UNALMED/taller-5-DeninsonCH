package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	private Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	/*construtores*/
	public Mamifero() {}
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.setnombre(nombre);
		this.setedad(edad);
		this.sethabitat(habitat);
		this.setgenero(genero);	
	}

	
	/*metodos*/
	public int cantidadMamiferos() {
		return(listado.length);
	}
	public void crearCaballo() {
		
	}
	public void crearLeon() {
		
	}
}
