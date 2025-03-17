package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Habitacion[] habitaciones = new Habitacion[3];
	        habitaciones[0] = new Habitacion(100, true, "Juan Pérez", 3, 2); // Estándar
	        habitaciones[1] = new Suite(200, true, "Ana López", 2, 2, 50, 30); // Suite
	        habitaciones[2] = new Apartamento(150, false, "", 0, 0, 20); // Apartamento

	        // Crear instancia de gestión con el arreglo de habitaciones
	        GestionHabitaciones gestion = new GestionHabitaciones(habitaciones);

	        // Calcular el precio de una habitación específica
	        System.out.println("Precio de la habitación 1: " + gestion.calcularPrecioHabitacion(1)+" €");

	        // Calcular lo recaudado en total
	        System.out.println("Recaudado total: " + gestion.calcularRecaudado()+" €");

	        // Mostrar factura completa
	        System.out.println("Factura completa:");
	        gestion.mostrarFactura();

	        // Listar habitaciones no ocupadas
	        System.out.println("Habitaciones libres:");
	        gestion.listarHabitacionesLibres();
		
	}

}
