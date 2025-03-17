package proyecto;

import utilidades.Leer;
import vista.Imprimir;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcion=0;
		
		//Imprimir
		Imprimir i=new Imprimir();
		
		//Instanciar preguntas
		
		
		
		i.imprimirBienvenida();
		
		i.imprimirMenuPrincipal();
		opcion=Leer.datoInt();
		while(opcion<0 || opcion>6) {
			System.out.println("Opción incorrecta!!\n");
			i.imprimirMenuAtrapa();
			opcion=Leer.datoInt();
		}
		
		switch(opcion) {
			case 1:
				i.imprimirMenuYPortadaAtrapa();
				opcion=Leer.datoInt();
				while(opcion<0 || opcion>1) {
					System.out.println("Opción incorrecta!!\n");
					i.imprimirMenuAtrapa();
					opcion=Leer.datoInt();
				}
				if(opcion==1) {
					i.imprimirPreguntas();
					
				}else {
					break;
				}
				
			case 0:
				
			
			
		}
		

		

	}

}
