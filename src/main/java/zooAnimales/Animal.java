package zooAnimales;
import gestion.*;		/*me permite la conexion entre las clases de distintos paquetes*/

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona = new Zona();
	
	/*contructores*/
	public Animal() {}
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		this.zona=zona;
	}
	/*Metodos*/
	public String movimiento() {
		
	}
	public int totalPorTipo() {
		
		
	}
	public String toString() {
		
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
	
}
