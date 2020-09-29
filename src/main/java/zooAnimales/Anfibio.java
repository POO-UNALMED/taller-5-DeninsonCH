package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	 private Anfibio[] listado;
	 public int ranas;
	 public int salamandras;
	 private String colorPiel;
	 private boolean venenoso;
	 
	 /*constructures*/
	 public Anfibio() {}
	 public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona) {
			this.setnombre(nombre);
			this.setedad(edad);
			this.sethabitat(habitat);
			this.setgenero(genero);	
		}
	 
	 /*metodos*/
	 public int cantidadAnfibios(){
		 return(listado.length);
	 }
	 public String movimiento() {
			return("volar");
	 }
	 public void crearsalmon() {
			
	 }
	 public void crearbacalao() {
			
	 }
	 
}
