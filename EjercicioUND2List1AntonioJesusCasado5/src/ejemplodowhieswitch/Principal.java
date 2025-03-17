package ejemplodowhieswitch;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0;
		System.out.println("Hola, esto es un ejemplo de un menú completo");
		System.out.println("Introduzca un número de opción deseada");
		
		
		
		do {
			
			System.out.println("0. Para salir");
			System.out.println("1. Refranes");
			System.out.println("2. Títulos de canciones");
			System.out.println("3. Frases hechas");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
			case 0:
				System.out.println("Saliendo....");
				break;
			case 1:
				System.out.println("En abril aguas mil");
				break;
			case 2:
				System.out.println("Agila");
				break;
			case 3:
				System.out.println("no na ni");
				break;
			default:
				System.out.println("Esa opción no se contempla");
				break;
			
			}
			
		}while(opcion!=0);

	}

}
