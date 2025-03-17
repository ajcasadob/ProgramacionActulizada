package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		int opcion,eleccion=0;
		Sortea sor=new Sortea();
		int numeroGanador;
		numeroGanador=sor.generadorSorteo();
		sor.setNumeroGanador(numeroGanador);
		
		//System.out.println("Éste es el número ganador generado por la máquina: " + numeroGanador);
		
		System.out.println("Bienvenidos al lotero, vamos a regalar ilusión");
		System.out.println();
		do {
			
			System.out.println("""
			0.Salir
			1.Comprar un décimo.
			2.Comprar un décimo aleatorio.
			3.Comprobar si nuestro décimo esta premiado.
					
					""");
			System.out.println("Elige la opción que desee:");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
			
				case 0:
					
					System.out.println("Saliendo..");
					
					break;
					
				case 1:	
						
					System.out.println("Introduce aquí el número que desee comprar");
					do {
					eleccion=Leer.datoInt();
					
					if(eleccion>=1 && eleccion<=99999) {
						System.out.println("Su número elegido es "+eleccion);
					}else {
						System.out.println("Introduce un número correcto");
					}
					}while(!(eleccion>=1 && eleccion<=99999));
					
					break;
					
			
				case 2:
						eleccion = sor.generaradorDecimo();
						sor.imprimirDecimo(eleccion);
						break;
					
				case 3:
					
					sor.imprimirGanador(sor.comprobarGanador(eleccion));
					System.out.print("El número ganador es: " + sor.getNumeroGanador());
					System.out.println(", y tu número era: " + eleccion + "\n");
					
					break;
			}
			
			
			
			
			
		}while(opcion!=0);
		
		
		
		
		
		

	}

}
