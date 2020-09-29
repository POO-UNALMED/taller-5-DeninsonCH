package gestion;
import java.util.ArrayList;
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
	public String getNombre() {
		return(this.nombre);
	}
}
