package gestion;
import java.util.*;
import zooAnimales.*;

public class Zona {
	private String nombre;
	private Zoologico zoo = new Zoologico();
	private ArrayList<Animal> animales = new ArrayList<Animal>(); 
	
	
	
	
	
	/*constructores*/
	public Zona() {}
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	/*metodos*/
	public void agregarAnimales(Animal an) {
		animales.add(an);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	/*metodos get*/

	public Zoologico getZoo() {
		return (this.zoo);
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public String getNombre() {
		return(this.nombre);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
}
