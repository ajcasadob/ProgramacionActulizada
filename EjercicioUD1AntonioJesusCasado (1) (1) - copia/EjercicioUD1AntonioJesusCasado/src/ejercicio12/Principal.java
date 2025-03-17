package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int unidadArtI;
		int unidadArtII;
		int unidadArtIII;
		double precioArtI=1.20;
		double precioArtII=0.40;
		double precioArtIII=150;
		double precioTotal;
		String nameI, nameII,nameIII;
		double precioFArtI,precioFArtII,precioFArtIII;
		double pagoCliente,vueltaCliente;
		
		int unidadTotal;
		
		System.out.println("\t\t\t\t\t Bienvenidos a zhingo Zou");
		
		System.out.println("¿Qué desea usted?");
		nameI=Leer.dato();
		System.out.println("¿Cuántas unidades desea?");
		unidadArtI=Leer.datoInt();
		System.out.println("¿Quiere usted algo mas?");
		
	    nameII=Leer.dato();
	    System.out.println("¿Cuántas unidades desea?");
	    unidadArtII=Leer.datoInt();
		System.out.println("¿Le puedo ayudar con algo más?");
		nameIII=Leer.dato();
		System.out.println("¿Cuántas unidades desea?");
		unidadArtIII=Leer.datoInt();
		precioFArtI=precioArtI*unidadArtI;
		precioFArtII=precioArtII*unidadArtII;
		precioFArtIII=precioArtIII*unidadArtIII;
		precioTotal=precioFArtI+precioFArtII+precioFArtIII;
		System.out.printf("Serán %.2f €",precioTotal);
		System.out.println("\nDeposite aquí su pago:");
		pagoCliente=Leer.datoDouble();
		System.out.println("\n\t\t\t Artículos \t\t Unidades \t\t Precio");
		System.out.printf("\n\t\t\t %s \t\t %d unds \t\t %.2f €",nameI,unidadArtI,precioFArtI);
		System.out.printf("\n\t\t %s \t\t\t\t %d unds \t\t %.2f €",nameII,unidadArtII,precioFArtII);
		System.out.printf("\n\t\t %s \t\t\t\t %d unds \t\t %.2f €",nameIII,unidadArtIII,precioFArtIII);
		precioTotal=precioFArtI+precioFArtII+precioFArtIII;
		unidadTotal=unidadArtI+unidadArtII+unidadArtIII;
		System.out.printf("\n Total \t\t --- \t\t\t\t %d unds \t\t %.2f €",unidadTotal,precioTotal);
		System.out.printf("\n Pago \t\t\t\t\t\t\t\t\t %.2f €",pagoCliente);
		vueltaCliente=pagoCliente-precioTotal;
		System.out.printf("\n A devolver \t\t\t\t\t\t\t\t %.2f €",vueltaCliente);
		System.out.println("\n \n Le atendió John Snow");
		
		System.out.println("\n \t\t\t\t\t Gracias por su visita");
		

	}

}
