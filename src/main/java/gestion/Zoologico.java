package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zona = new ArrayList<Zona>();

	public Zoologico(){}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	
	
	public void agregarZonas(Zona Z) {
		zona.add(Z);
	}
	
	public int cantidaTotalAnimales() {
		int contador = 0;
		for (int i = 0; i < zona.size(); i ++) {
			contador += zona.get(i).cantidadAnimales();
		}
		return(contador);
	}
	/*metodos get*/
	public ArrayList<Zona> getZona() {
		return (this.zona);
	}
	public String getNombre() {
		return (this.nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void setZonas(ArrayList<Zona> zonas) {
		this.zona = zonas;
	}
}
