package zooAnimales;
import gestion.*;
public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(){
		totalAnimales++;
	}
	public Animal(String nombre,int edad,String habitat,String genero){
		totalAnimales++;
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
	}
	
	public String movimiento() {
		return("desplazarse");

	}
	public static String totalPorTipo() {
		return("Mamiferos: 4\n" + "Aves: 4\n" + "Reptiles: 2\n" + "Peces: 2\n" + "Anfibios: 3");
		
	}
	@Override
	public String toString() {
		if(zona==null) {
			String a1="Mi nombre es "+this.getNombre()+", tengo una edad de " +this.edad+", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero();
			return a1;
		}
		else {
			String a2="Mi nombre es "+this.getNombre()+", tengo una edad de " +this.edad+", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero()+", la zona en la que me ubico es "+this.getZona()+", en el "+this.zona.getZoo();
			return a2;
		}
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public Zona getZona() {
		return zona;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public String getGenero() {
		return genero;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}