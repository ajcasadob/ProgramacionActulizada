package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int opcion;
		String quinela[]= {"1","x","2"};
		String chinos[]= {"1","2","3"};
		
		
		
		Generadora g1=new Generadora();
		
		
		
		
		
		do {
			
			g1.Menu();
			System.out.println("Elije una opcion");
			opcion=Leer.datoInt();
			
		switch(opcion) {
		
			
			case 0:
				
			System.out.println("Saliendo...");
			
			break;
			
			case 1:
				
				
				g1.imprimirQuinela(g1.generadorQuinela(quinela));
				
				break;
				
			case 2:
				
				g1.imprimirParoImpar(g1.generadorParoImpar());
				
				break;
				
			case 3:	
				
				g1.imprimirChino(g1.generadorChino(chinos));
				
				break;
				
			case 4:
				
				g1.imprimirPrimitiva(g1.generarPrimitiva());
				break;
				
		}
		}while(opcion!=0);

	}

}
