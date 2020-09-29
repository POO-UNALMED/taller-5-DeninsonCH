package zooAnimales;
import gestion.*;		/*me permite la conexion entre las clases de distintos paquetes*/

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
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
	public static boolean totalPorTipo()  {
		
		return(true);
		
	}
	@Override
    public String toString() {
        return "Mi nombre es "+this.getNombre()+", tengo una edad de "+this.getEdad()+", habito en "+this.getHabitat()+" y mi genero es "+ this.getGenero();
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

	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
}
