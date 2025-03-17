package ejercicio01;

import utilidades.Leer;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double gananciaVendedor;
		double porcentajeImpuesto;
		double costeFabricacionV;
		double porcentaje=100;
		double impuestoFabricacion;
		double totalCocheConImpuesto;
		double impuestoVendedor,totalVehiculo;
		
		System.out.println("Bienvenidos, vamos a calcular el precio final de un automovil");
		
		System.out.println("¿Me podría indicar cual es el porcentaje de ganancia del vendedor?");
		gananciaVendedor=Leer.datoDouble();
		
		System.out.println("Indicame cual es el porcentaje de impuesto");
		porcentajeImpuesto=Leer.datoDouble();
		
		System.out.println("Y por ultimo, indicame cual es el coste de fabricación del vehículo");
		costeFabricacionV=Leer.datoDouble();

		impuestoFabricacion=costeFabricacionV*porcentajeImpuesto/porcentaje;
		totalCocheConImpuesto=impuestoFabricacion+costeFabricacionV;
		impuestoVendedor=gananciaVendedor*totalCocheConImpuesto/porcentaje;
		totalVehiculo=totalCocheConImpuesto+impuestoVendedor;
		System.out.println("***************************************************************************************************************************");
		System.out.printf("* Su vehículo tiene un impuesto de fabricación de %.2f €, el total del vehículo "
				+ " con dicho impuesto es de %.2f €.\t *",impuestoFabricacion,totalCocheConImpuesto);
		System.out.printf("\n* El vendedor tiene una ganacia de %.2f €, por lo que el total de su vehículo puesto "
				+ " en marcha le saldría por %.2f € \t *",impuestoVendedor,totalVehiculo);
		System.out.println("\n* Gracias por haber usado este programa, espero verte pronto.\t\t\t\t\t\t\t\t *");
		System.out.println("****************************************************************************************************************************");
	}

}
