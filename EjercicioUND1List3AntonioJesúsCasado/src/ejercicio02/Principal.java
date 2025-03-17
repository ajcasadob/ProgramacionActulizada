package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double velocidadCos=3.2;
		double metrosRecorrido;
		double tiempoMovimiento;
		double espacioRecorrido;
		
		System.out.println("Bienvenidos, en este programa vamos a calcular  el espacio recorrido por un objeto lanzado");
		
		System.out.println("¿Cuántos metros ha recorrido la zapatilla que te ha lanzado tu madre?");
		metrosRecorrido=Leer.datoDouble();
		System.out.println("¿Cuánto tiempo ha estado el objeto en movimiento?");
		tiempoMovimiento=Leer.datoDouble();
		
		espacioRecorrido=metrosRecorrido+velocidadCos*tiempoMovimiento;
		
		System.out.printf("\nEl espacio recorrido por la zapatilla que te ha lanzado tu madre es de %.2f metros, "
				+ " para la proxima vez portate bien.",espacioRecorrido);
		System.out.println("\nGracias por usarme, nos vemos en la proxima! :)");
		
	}

}
