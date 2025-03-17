package ejercicio05;

public class Empleado {

	
	private String nombre;
	private String apellidos;
	private double sueldoBase;
	private int numeroID;
	
	public Empleado(String nombre, String apellidos, double sueldoBase, int numeroID) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
		this.numeroID = numeroID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getNumeroID() {
		return numeroID;
	}

	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase=" + sueldoBase + ", numeroID="
				+ numeroID + "]";
	}
	
	public double calcularSueldoBase(double ventas) {
		
		
	
	return sueldoBase;
	}
	
	
}
