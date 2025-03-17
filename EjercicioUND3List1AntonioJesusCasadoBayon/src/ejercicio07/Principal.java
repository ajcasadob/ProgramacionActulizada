package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion,eleccion;
		Juego jg=new Juego();
		
		System.out.println("Bienvenidos a mi programa, vamos a jugar");
		
		do {
			jg.Menu();
			System.out.println("Elige la opción que desee:");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
			
				case 0:
				System.out.println("Saliendo...");
				break;
				
				case 1:
					System.out.println("Cara(1) o cruz(2)");
					eleccion=Leer.datoInt();
					
					jg.imprimirMonedaLanzada(jg.generarMoneda());
					jg.imprimirGanador(jg.generarGanador(eleccion));
					
					break;
					default:
						System.out.println("Ya no hay mas números nene");
						break;
				
			
			
			
			}
			
			
			
		}while(opcion!=0);
		
		
		

	}

}
