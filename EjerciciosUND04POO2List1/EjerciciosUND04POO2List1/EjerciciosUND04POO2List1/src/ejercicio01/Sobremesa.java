package ejercicio01;

public class Sobremesa extends Ordenador {

	
	private double precioMontaje;

	public Sobremesa(double capacidadDisco, double frecuenciaProcesador, double precioBase, String marca,
			double precioMontaje) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return super.toString()+"Sobremesa [precioMontaje=" + precioMontaje + "]";
	}
	
	public double calcularPrecioVenta(double porcentajeGanancia) {
		
		
		return super.calcularPrecioVenta(porcentajeGanancia)+precioMontaje;
	}
	
}
