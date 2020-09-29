package zooAnimales;

import gestion.*;

public class Ave extends Animal {
	private Ave[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	/*constructor*/
	public Ave() {}
	public Ave(String nombre, int edad, String habitat, String genero, String cp) {
		this.setnombre(nombre);
		this.setedad(edad);
		this.sethabitat(habitat);
		this.setgenero(genero); 
		this.colorPlumas=cp;
		tAves ++;
		}
	/*metodos*/
	public static int cantidadAves() {
		return(halcones+aguilas);
	}
	public String movimiento() {
		return("volar");
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave h = new Ave (nombre, edad, "montanas", genero, "cafe glorioso");
		halcones ++;
		return (h);
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave a = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas ++;
		return (a);
	}
	/*metodos get*/
	public String getColorPlumas() {
		return (this.colorPlumas);
	}
	
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
