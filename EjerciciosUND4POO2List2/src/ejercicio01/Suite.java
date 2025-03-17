package ejercicio01;

public class Suite extends Habitacion {

	private double metrosCuadrados;
	private double servicioHabitaciones;
	
	public Suite(double precioBase, boolean ocupacion, String nombre, int numeroDiasOcupado, int numeroOcupantes,
			double metrosCuadrados, double servicioHabitaciones) {
		super(precioBase, ocupacion, nombre, numeroDiasOcupado, numeroOcupantes);
		this.metrosCuadrados = metrosCuadrados;
		this.servicioHabitaciones = servicioHabitaciones;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getServicioHabitaciones() {
		return servicioHabitaciones;
	}

	public void setServicioHabitaciones(double servicioHabitaciones) {
		this.servicioHabitaciones = servicioHabitaciones;
	}

	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", servicioHabitaciones=" + servicioHabitaciones + "]";
	}

	
	public double calcularPrecioHabitacion(double descuento) {
		double total;
		total = super.calcularPrecioHabitacion()+servicioHabitaciones;
		
		return total-(total*descuento/100);
	}
	
	
	
	
	
}
