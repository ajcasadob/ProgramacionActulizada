package ejercicio01;

public class Ordenador {

	private double capacidadDisco;
	private double frecuenciaProcesador;
	private double precioBase;
	private String marca;
	
	
	public Ordenador(double capacidadDisco, double frecuenciaProcesador, double precioBase, String marca) {
		super();
		this.capacidadDisco = capacidadDisco;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}


	public Ordenador() {
		super();
		
	}


	public double getCapacidadDisco() {
		return capacidadDisco;
	}


	public void setCapacidadDisco(double capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}


	public double getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}


	public void setFrecuenciaProcesador(double frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Ordenador [capacidadDisco=" + capacidadDisco + ", frecuenciaProcesador=" + frecuenciaProcesador
				+ ", precioBase=" + precioBase + ", marca=" + marca + "]";
	}
	
	public double calcularPrecioVenta(double porcentajeGanancia) {
		double total,result;
		total=precioBase*porcentajeGanancia/100;
		result=precioBase+total;
		return result;
	}
	
	
	
}
