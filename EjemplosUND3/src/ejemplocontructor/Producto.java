package ejemplocontructor;

public class Producto {
	
	//Atributos
	
	private int id;
	private String nombre;
	private double precioBase;
	
	//Esto sirve para guardar los datos.
	//Constructores
	public Producto(int id, String nombre, double precioBase) {
		
		this.id=id;
		this.nombre=nombre;
		this.precioBase=precioBase;
		
		
	}
	//Contructor de dos parametros
	public Producto(int id, String nombre) {
		
		this.id=id;
		this.nombre=nombre;
		
		
	}
	
	//Getters and setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		
		this.id=id;
		
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setId(double precioBase) {
		
		this.precioBase=precioBase;
		
	}
	
	//Nuestros metodos
	
	public double calcularPVP(double porcentaje) {
		
		double cien=100.0;
		
		return precioBase+precioBase*porcentaje/cien;
		
	}
	
	//Para imprimir datos
	
	public String toString() {
		return "Producto[id="+ id + ",nombre="+ nombre+",precioBase="+precioBase+"]";
	}

}
