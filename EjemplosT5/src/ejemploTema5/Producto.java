package ejemploTema5;

public class Producto {

	
	private String nombre;
	private double preciBase;
	private boolean refrigerado;
	
	
	public Producto(String nombre, double preciBase, boolean refrigerado) {
		super();
		this.nombre = nombre;
		this.preciBase = preciBase;
		this.refrigerado = refrigerado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPreciBase() {
		return preciBase;
	}


	public void setPreciBase(double preciBase) {
		this.preciBase = preciBase;
	}


	public boolean isRefrigerado() {
		return refrigerado;
	}


	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", preciBase=" + preciBase + ", refrigerado=" + refrigerado + "]";
	}
	
	
	
	
	
	
}
