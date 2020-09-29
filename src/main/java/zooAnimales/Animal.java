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
	public Animal() {totalAnimales++;}
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		totalAnimales++;
		
	}
	/*Metodos*/
	public String movimiento() {
		return("desplazarse");
	}
	public static String totalPorTipo()  {
		String x="Mamiferos: 4\n" + "Aves: 4\n" + "Reptiles: 2\n" + "Peces: 2\n" + "Anfibios: 3";
		return x;
		/*
		return("Mamiferos: "+ tMamiferos + "\nAves :" + tAves + "\nReptiles :" + tReptiles + "\nPeces :" + tPeces + "\nAnfibios :" + tAnfibios);
		*/
	}
	@Override
	public String toString() {
		if(zona==null) {
			return("Mi nombre es"+ this.getNombre() +", tengo una edad de " + this.getEdad()+", habito en "+ this.getHabitat()+ ", y mi genero es "+ this.getGenero());
		}
		else {
			return("Mi nombre es"+ this.getNombre() +", tengo una edad de " + this.getEdad()+", habito en "+ this.getHabitat()+ ", y mi genero es "+ this.getGenero()+", la zona en la que me ubico es "+this.getZona()+", en el "+this.zona.getZoo());
		}
		
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
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	/*metodos get*/
	public String getNombre() {
		return (this.nombre);
	}
	public int getEdad() {
		return edad;
	}
	public String getHabitat() {
		return (this.habitat);
	}
	public String getGenero() {
		return (this.genero);
	}
	
	public Zona getZona() {
		return zona;
	}
	
}
