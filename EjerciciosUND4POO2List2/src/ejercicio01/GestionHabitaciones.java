package ejercicio01;

import java.util.Arrays;

public class GestionHabitaciones {

	
	private Habitacion [] habitaciones;

	public GestionHabitaciones(Habitacion[] habitaciones) {
		super();
		this.habitaciones = habitaciones;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public String toString() {
		return "GestionHabitaciones [habitaciones=" + Arrays.toString(habitaciones) + "]";
	}
	
	public double calcularPrecioHabitacion(int indice) {
		
		Habitacion habitacion= habitaciones[indice];
		return habitacion.calcularPrecioHabitacion();
	}
	
	public double calcularRecaudado() {
		double total=0;
		for(Habitacion habitacion: habitaciones) {
			if(habitacion.isOcupacion()) {
				total+=habitacion.calcularPrecioHabitacion();
			}
		}
		return total;
	}
	
	public void mostrarFactura() {
		for(Habitacion habitacion: habitaciones) {
			System.out.println(habitacion.mostrarInfo());
		}
	}
	public void listarHabitacionesLibres() {
		for(Habitacion habitacion: habitaciones) {
			if(!habitacion.isOcupacion()) {
				System.out.println(habitacion.mostrarInfo());
			}
		}
	}
	
}
