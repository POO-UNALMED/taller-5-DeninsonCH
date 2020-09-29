package zooAnimales;
import gestion.*;		/*me permite la conexion entre las clases de distintos paquetes*/

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona = new Zona();
	
	/*atributos por tipo*/
	public static int tMamiferos;
	public static int tAves;
	public static int tReptiles;
	public static int tPeces;
	public static int tAnfibios;
	
	/*contructores*/
	public Animal() {}
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		
		
	}
	/*Metodos*/
	public String movimiento() {
		return("desplazarse");
	}
	public static String totalPorTipo()  {
		return("Mamiferos: "+ tMamiferos + "\nAves :" + tAves + "\nReptiles :" + tReptiles + "\nPeces :" + tPeces + "\nAnfibios :" + tAnfibios);
		
	}
	public String toString() {
		return ("Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F");
		/*
		return("Mi nombre es"+ this.getNombre() +", tengo una edad de " + this.getEdad()+", habito en "+ this.getHabitat()+ ", y mi genero es "+ this.getGenero()+", la zona en la que me ubico es");
		*/
	}

	
	/*entrada de datos desde otras clases*/
	public void setnombre(String sn) {
		this.nombre=sn;
	}
	public void setedad(int e) {
		this.edad=e;
	}
	public void sethabitat(String ha) {
		this.habitat=ha;
	}
	public void setgenero(String g) {
		this.genero=g;
	}
	
	public String getNombre() {
		return (this.nombre);
	}
	public String getHabitat() {
		return (this.habitat);
	}
	public String getGenero() {
		return (this.genero);
	}
	public int getEdad() {
		return (this.edad);
	}
	
	
}
