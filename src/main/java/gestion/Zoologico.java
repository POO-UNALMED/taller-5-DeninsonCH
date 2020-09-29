package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();

	public Zoologico(){}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	
	
	public void agregarZonas(Zona Z) {
		zonas.add(Z);
	}
	
	public int cantidaTotalAnimales() {
		int contador = 0;
		for (int i = 0; i < zonas.size(); i ++) {
			contador += zonas.get(i).cantidadAnimales();
		}
		return(contador);
	}
	/*metodos get*/
	public ArrayList<Zona> getZona() {
		return (this.zonas);
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
		this.zonas = zonas;
	}
}
