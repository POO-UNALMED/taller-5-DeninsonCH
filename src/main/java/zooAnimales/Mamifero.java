package zooAnimales;

import gestion.*;

public class Mamifero extends Animal {
	private Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	/*construtores*/
	public Mamifero() {}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.setnombre(nombre);
		this.setedad(edad);
		this.sethabitat(habitat);
		this.setgenero(genero);	
		this.pelaje=pelaje;
		this.patas=patas;
		tMamiferos ++;
	}

	
	/*metodos*/
	public int cantidadMamiferos() {
		return(listado.length);
	}
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero (nombre, edad, "pradera", genero, true, 4);
		caballos ++;
		return (caballo);
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leo = new Mamifero (nombre, edad, "selva", genero, true, 4);
		leones ++;
		return (leo);
	}
	/*metodos get*/
	public boolean getPelaje() {
		return (this.pelaje);
	}
	public int getPatas() {
		return (this.patas);
	}
	public boolean isPelaje() {
		return(this.pelaje);
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
}
