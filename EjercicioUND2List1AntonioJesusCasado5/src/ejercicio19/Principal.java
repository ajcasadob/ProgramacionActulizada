package ejercicio19;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario = 1000.00;
		int numMeses, repetir;
		double numVentas, comision, salarioMensual;
		double comisionVenta = 20.00;
		double porcentaje = 100;
		double totalSalario = 0;

		do {

			System.out.println("Bienvenidos, vamos a calcular el salario de un trabajador con las ventas realizadas:");
			
			System.out.println("¿Cuántos meses quieres calcular?");
			numMeses = Leer.datoInt();

			for (int i = 0; i < numMeses; i++) {
				
				System.out.println("Introduce el numero total de ventas del mes " + (i + 1));
				numVentas = Leer.datoDouble();

				comision = numVentas * comisionVenta / porcentaje;
				
				salarioMensual = comision + salario;

				System.out.printf("\nEl salario del mes %d es de %.2f €\n", (i + 1), salarioMensual);
				
				totalSalario += salarioMensual;

			}
			System.out.printf("\nEl salario total de %d meses es de %.2f € \n", numMeses, totalSalario);

			System.out.println("¿Quieres calcular el salario de nuevo?(0: Si, 1: No):");
			repetir = Leer.datoInt();

		} while (repetir == 0);
		
		System.out.println("Gracias por usar el programa");

	}

}
