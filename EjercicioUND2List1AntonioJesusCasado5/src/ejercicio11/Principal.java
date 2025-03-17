package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion, unidades;
		double precioVip=15;
		double precioTresD=10;
		double precioNormal=6;
		double precioNiños=5;
		double precioElegidoPorCliente = 0;
		double total;
		//ES MEJOR PONER EL NOMBRE DE LA SALA EN LAS VARIABLES
		System.out.println("Bienvenidos al cine, a continuación te muestro la taquilla disponible:");
		System.out.println("A continuación te muestro las diferentes salas disponible, elije una opción:");
		
		do {
			
			System.out.println("\n1. Sala vip   - El Joker\n2. Sala 3D-Avatar \n3. Sala Normal-Misión imposible \n4. Sala para niños-Doraemón \n0. Terminar ejecución\n");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
			case 1:
				
				System.out.printf("Has seleccionado sala Vip. El precio de la entrada por unidad es %.2f€.\n",precioVip);
				precioElegidoPorCliente = precioVip;
				
				break;
				
			case 2:
				
				System.out.printf("Has seleccionado Sala 3D. El precio de la entrada por unidad es %.2f€\n",precioTresD);
				precioElegidoPorCliente = precioTresD;
				
				break;
				
			case 3: 
				
				System.out.printf("Has seleccionado Sala Normal. El precio de la entrada por unidad es %.2f€\n",precioNormal);
				precioElegidoPorCliente = precioNormal;
				
				break;
				
			case 4: 
				
				System.out.printf("Has seleccionado Sala para niños.El precio de la entrada por unidad es %.2f€\n",precioNiños);
				precioElegidoPorCliente = precioNiños;
				
				break;
				
			case 0:
				
				System.out.println("Gracias por usar el programa. :)");
				
				break;
				
			default:
				
				System.out.println("La opción elegida no está contemplada en el menú.");
			
			}
			
			if(opcion<=4 && opcion>0) {
				
				System.out.println("\n¿Cuántas unidades quieres?");
				unidades=Leer.datoInt();
				
				total = unidades * precioElegidoPorCliente;
				
				System.out.printf("La suma total es de %.2f€" , total);
				
			}
			
		}
		while(opcion!=0);
		
	//ggwp
	
		
		

	}

}
