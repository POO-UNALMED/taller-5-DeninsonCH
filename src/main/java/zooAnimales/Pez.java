package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	private Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	/*contructores*/
	public Pez() {}
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.setnombre(nombre);
		this.setedad(edad);
		this.sethabitat(habitat);
		this.setgenero(genero);	
	}
	/*metodos*/
	public int cantidadPez() {
		return(listado.length);
	}
	public String movimiento() {
		return("volar");
	}
	public void crearsalmon() {
		
	}
	public void crearbacalao() {
		
	}
}
