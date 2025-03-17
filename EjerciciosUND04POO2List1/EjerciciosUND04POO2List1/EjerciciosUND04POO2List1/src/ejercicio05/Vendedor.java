package ejercicio05;

public class Vendedor extends Empleado{

	
	private double cantidadVenta;
	private double porcentajeVentas;
	
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int numeroID, double cantidadVenta,
			double porcentajeVentas) {
		super(nombre, apellidos, sueldoBase, numeroID);
		this.cantidadVenta = cantidadVenta;
		this.porcentajeVentas = porcentajeVentas;
	}


	public double getCantidadVenta() {
		return cantidadVenta;
	}


	public void setCantidadVenta(double cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}


	public double getPorcentajeVentas() {
		return porcentajeVentas;
	}


	public void setPorcentajeVentas(double porcentajeVentas) {
		this.porcentajeVentas = porcentajeVentas;
	}


	@Override
	public String toString() {
		return "Vendedor [cantidadVenta=" + cantidadVenta + ", porcentajeVentas=" + porcentajeVentas + "]";
	}
	
	
	public double calcularSueldoBase(double ventas) {
		
		return super.getSueldoBase()+cantidadVenta*porcentajeVentas/100;
	
	}
	public void comprobarVentas(double ventas) {
		if(cantidadVenta>=ventas) {
			System.out.printf("Felicidades por superar los %.2f € en ventas",ventas);
		}
	}
}
