package gestion;
import java.util.*;
public class Zoologico {
	
	private ArrayList<Zona>zona=new ArrayList<Zona>();
	private String nombre;
	private String ubicacion;
	
	
	public Zoologico(String nombre,String ubicacion){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {
		
	}
	public void agregarZonas(Zona zona1) {
		zona.add(zona1);
	}
	public int cantidadTotalAnimales() {
		int cont=0;
		for (int i = 0; i < zona.size(); i++) {
			cont=cont+zona.get(i).cantidadAnimales();
		}
		return cont;
		
		
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zona;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zona = zonas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	
}
