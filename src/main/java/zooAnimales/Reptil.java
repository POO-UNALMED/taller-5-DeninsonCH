package zooAnimales;

import gestion.*;

public class Reptil extends Animal {
	private Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	/*constructores*/
	public Reptil() {}
	public Reptil(String nombre, int edad, String habitat, String genero, String cs, int lc) {
		this.setnombre(nombre);
		this.setedad(edad);
		this.sethabitat(habitat);
		this.setgenero(genero);	
		this.colorEscamas=cs;
		this.largoCola=lc;
		tReptiles ++;
	}
	
	/*metodos*/
	public static int cantidadReptiles() {
		return(iguanas+serpientes);
	}
	public String movimiento() {
		return("reptar");
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {	
		Reptil i = new Reptil (nombre, edad, "humedal", genero, "verde", 3);
		iguanas ++;
		return (i);
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil s = new Reptil (nombre, edad, "jungla", genero, "blanco", 3);
		serpientes ++;
		return (s);
	}
	/*metodos get*/
	public String getColorEscamas() {
		return (this.colorEscamas);
	}
	public int getLargoCola() {
		return (this.largoCola);
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
