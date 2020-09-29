package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	private Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	/*contructores*/
	public Pez() {tPeces ++;}
	public Pez(String nombre, int edad, String habitat, String genero, String ce, int ca ) {
		this.setnombre(nombre);
		this.setedad(edad);
		this.sethabitat(habitat);
		this.setgenero(genero);	
		this.colorEscamas=ce;
		this.cantidadAletas=ca;
	}
	/*metodos*/
	public int cantidadPez() {
		return(this.salmones+this.bacalaos);
	}
	public String movimiento() {
		return("nadar");
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {	
		Pez p = new Pez (nombre, edad, "oceano", genero, "rojo", 6);
		salmones ++;
		return (p);		
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez b = new Pez (nombre, edad, "oceano", genero, "gris", 6);
		bacalaos ++;
		return (b);
	}
	/*metodos get*/
	public String getColorEscamas() {
		return (this.colorEscamas);
	}
	public int getCantidadAletas() {
		return (this.cantidadAletas);
	}
}
