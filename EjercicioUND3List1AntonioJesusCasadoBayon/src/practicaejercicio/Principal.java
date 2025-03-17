package practicaejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion;
		
		int veces=6;
		
		
		
		Generadora gn=new Generadora();
		
		System.out.println("Bienvenidos a mi programa\n");
		gn.menu();
		
		
		do {
			System.out.println("Elige la opción que mas se adapte");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo..");
					break;
					
				case 1:
					
					gn.imprimirQuinela(gn.generadorQuinela());
					break;
					
				case 2:
					
					gn.imprimirPosne(gn.generadorPoSne());
					break;
				case 3:
					
					gn.imprimirChino(gn.generarChino());
					break;
				case 4:
					
					for(int i=0;i<veces; i++) {
						gn.imprimirPrimitiva(gn.generadorPrimitiva());
					}
					break;
					default:
						System.out.println("La opción elegida no esta establecida");
						break;
			}
			
			
		}while(opcion!=0);
		

	}

}
