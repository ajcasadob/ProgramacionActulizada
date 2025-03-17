package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double porcentaje= 100;
		double dineroDeposito;
		double interesMantenimiento;
		double interesGenerando;
		double precioMantenimiento;
		double precioFinalMantenimiento;
		double gananciasGeneradaB;
		double ganaciasTotalB;
		
		System.out.println("Bienvenidos, con este programa vamos a calcular los intereses bancarios");
		
		System.out.println("Indícame cuanto dinero ha depositado en el banco");
		dineroDeposito=Leer.datoDouble();
		
		System.out.println("¿Qué porcentaje de mantenimiento tiene la cuenta?");
		interesMantenimiento=Leer.datoDouble();
		
		precioMantenimiento=dineroDeposito*interesMantenimiento/porcentaje;
		precioFinalMantenimiento=dineroDeposito-precioMantenimiento;
		
		System.out.println("¿Qué interes anual le está generando?");
		interesGenerando=Leer.datoDouble();
		
		gananciasGeneradaB=interesGenerando*dineroDeposito/porcentaje;
		ganaciasTotalB= dineroDeposito+gananciasGeneradaB;
		
		
		System.out.printf("\nSu banco por cada %.2f € depositado le esta "
				+ "cobrando un total de %.2f € que en total seria %.2f €. ",dineroDeposito,precioMantenimiento,precioFinalMantenimiento);
		System.out.printf("\nSu banco por cada %.2f € le esta generando una ganancia de %.2f "
				+ "€ que al final se nos queda en un total de %.2f €",dineroDeposito,gananciasGeneradaB,ganaciasTotalB);

	}

}
