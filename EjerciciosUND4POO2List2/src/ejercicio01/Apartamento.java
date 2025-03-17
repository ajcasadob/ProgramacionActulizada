package ejercicio01;

public class Apartamento extends Habitacion {

	
	private double servicioLimpieza;

	public Apartamento(double precioBase, boolean ocupacion, String nombre, int numeroDiasOcupado, int numeroOcupantes,
			double servicioLimpieza) {
		super(precioBase, ocupacion, nombre, numeroDiasOcupado, numeroOcupantes);
		this.servicioLimpieza = servicioLimpieza;
	}

	public double getServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(double servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	@Override
	public String toString() {
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + "]";
	}

	@Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Coste limpieza: " + servicioLimpieza+" €";
    }
	
	public double calcularPrecioHabitacion(double descuento) {
		
		return super.calcularPrecioHabitacion()+servicioLimpieza;
	}
	
	
	
}
