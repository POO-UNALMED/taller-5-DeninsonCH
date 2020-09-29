package zooAnimales;

import gestion.*;

public class Anfibio extends Animal {
	 private Anfibio[] listado;
	 public  static int ranas;
	 public static int salamandras;
	 private String colorPiel;
	 private boolean venenoso;
	 
	 /*constructures*/
	 public Anfibio() {tAnfibios ++;}
	 public Anfibio(String nombre, int edad, String habitat, String genero, String cp, boolean v) {
			this.setnombre(nombre);
			this.setedad(edad);
			this.sethabitat(habitat);
			this.setgenero(genero);	
			this.colorPiel=cp;
			this.venenoso=v;
			tAnfibios ++;
		}
	 
	 /*metodos*/
	 public int cantidadAnfibios(){
		 return(this.ranas + this.salamandras);
	 }
	 public String movimiento() {
			return("saltar");
	 }
	 public static Anfibio crearRana(String nombre, int edad, String genero) {
			Anfibio r = new Anfibio (nombre, edad, "selva", genero, "rojo", true);
			ranas ++;
			return (r);
		}
		public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
			Anfibio s = new Anfibio (nombre, edad, "selva", genero, "negro y amarillo", false);
			salamandras ++;
			return (s);

		}
		
	/*metodos get*/
		public String getColorPiel() {
			return (this.colorPiel);
		}		
		public boolean isVenenoso() {
			return (this.venenoso);
		}
	 
}
