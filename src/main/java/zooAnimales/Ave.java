package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	private Ave[] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	/*constructor*/
	public Ave() {}
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.setnombre(nombre);
		this.setedad(edad);
		this.sethabitat(habitat);
		this.setgenero(genero); 	
		}
	/*metodos*/
	public int cantidadAves() {
		return(listado.length);
	}
	public String movimiento() {
		return("volar");
	}
	public void crearHalcon() {
		
	}
	public void crearAguila() {
		
	}
}
