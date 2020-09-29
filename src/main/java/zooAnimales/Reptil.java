package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal {
	private Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	/*constructores*/
	public Reptil() {}
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.setnombre(nombre);
		this.setedad(edad);
		this.sethabitat(habitat);
		this.setgenero(genero);	
	}
	
	/*metodos*/
	public int cantidadReptiles() {
		return(listado.length);
	}
	public String movimiento() {
		return("reptar");
	}
	public void creariguana() {
		
	}
	public void crearserpiente() {
		
	}
	
	
}
