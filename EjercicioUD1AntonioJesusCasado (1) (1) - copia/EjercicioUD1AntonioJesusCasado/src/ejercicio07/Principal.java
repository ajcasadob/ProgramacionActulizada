package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double consumoCoche;
		double precioGasolina;
		double consumoViaje;
		double kilometrosRecorridos;
		double precioViaje;
		double cien=100;
		
		System.out.println("Bienvenidos, vamos a calcular el coste de su viaje");
		System.out.println("¿Cuánto consume su coche a los 100kms?");
		consumoCoche=Leer.datoDouble();
		System.out.println("¿Cuántos kilometros quieres realizar?");
		kilometrosRecorridos=Leer.datoDouble();
		System.out.println("¿Cuánto esta el litro de gasolina?");
		precioGasolina= Leer.datoDouble();
		
		consumoViaje=consumoCoche/cien*kilometrosRecorridos;
		precioViaje=consumoViaje*precioGasolina;
		
		System.out.printf("El precio de la gasolina de su viaje seria de %.2f euros ",precioViaje);
		System.out.println("\nGracias por su visita, buen viaje");
	    
		
		
		
		
		
	}

}
