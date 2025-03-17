package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int cantidadEntradas;
		double precioEntradas,descuento,precioTotal=0,porcentaje=100,precioRebajado;
		String diaSemana,dia="miercoles";
		
		
		System.out.println("Bienvenidos, a la taquilla del cine YELMO");
		System.out.println("¿Cuántas entradas necesitas?");
		cantidadEntradas=Leer.datoInt();
		System.out.println("¿Cuál es el precio de las entradas?");
		precioEntradas=Leer.datoDouble();
		System.out.println("¿Que día de la semana quieres ir al cine?");
		diaSemana=Leer.dato();
		System.out.println("¿Que descuento hay que aplicar?");
		descuento=Leer.datoDouble();
		
		
		if(dia.equals(diaSemana)) {
			
			System.out.printf("Enhorabuena, tienes un descuento del %.2f %%\n",descuento);
			precioTotal=precioEntradas*cantidadEntradas*descuento/porcentaje;
			precioRebajado=precioEntradas*cantidadEntradas-precioTotal;
			System.out.printf("\nTienes un descuento de %.2f €",precioTotal);
			System.out.printf("\nSu cuenta es de %.2f €",precioRebajado);
			
		}else {
			precioTotal=precioEntradas*cantidadEntradas;
			System.out.printf("Su cuenta es de %.2f €",precioTotal);
			System.out.println("\nUsted no tiene descuento, por que no es el día del espectador");
			
		}
		

	}

}
