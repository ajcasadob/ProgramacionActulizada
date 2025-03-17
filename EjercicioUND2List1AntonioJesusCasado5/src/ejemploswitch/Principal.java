package ejemploswitch;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int opcion=0;
		
		System.out.println("Bienvenido, vamos hacer un menu, elija alguna de estas opciones");
		System.out.println("Pulse 1 para flamenco");
		System.out.println("Pulse 2 para hiphop");
		System.out.println("Pulse 3 para rap");
		System.out.println("Pulse 4 regaeeton");
		opcion=Leer.datoInt();
		
		switch(opcion) {
		
		case 1:
			System.out.println("La hungara");
			break;
				
		case 2: 
			System.out.println("Drake");
			break;
			
		case 3:
			System.out.println("Eminem");
			break;
		case 4:
			System.out.println("Anueel doblea");
			break;
		default:
			System.out.println("Eso no existe nene");
		}
		

	}

}
