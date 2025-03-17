package ejercicio10;

public class Billete {

	private double precio;
	private double precioSaltos;
	private int numSalto;
	
	
	public Billete(double precio, double precioSaltos, int numSalto) {
		super();
		this.precio = precio;
		this.precioSaltos = precioSaltos;
		this.numSalto = numSalto;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getPrecioSaltos() {
		return precioSaltos;
	}


	public void setPrecioSaltos(double precioSaltos) {
		this.precioSaltos = precioSaltos;
	}


	public int getNumSalto() {
		return numSalto;
	}


	public void setNumSalto(int numSalto) {
		this.numSalto = numSalto;
	}
	
	public double calcularVenta(int cantidad) {
		
		return cantidad*(precio+precioSaltos);
		
	}
	public void imprimirVenta(int cantidad,double dineroBilletes) {
		
		System.out.print("Cantidad: "+ cantidad+" unds");
		System.out.print("\nPrecio: "+ dineroBilletes+" €");
	}
	
	
	
}
