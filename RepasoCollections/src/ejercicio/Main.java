package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int op,numTras;
		double metros,price;
		String dir;
		boolean ocu;
		List<Trastero> lista= new ArrayList<Trastero>();
		
		Oficina o = new Oficina(lista);
		
		o.addTrastero(new Trastero(10,"Conde",1,30.0,true));
		o.addTrastero(new Trastero(17,"rey",6,25.0,false));
		o.addTrastero(new Trastero(60,"mendez",20,16.0,false));
		o.addTrastero(new Trastero(15,"julñios",8,76.0,true));
		o.addTrastero(new Trastero(20,"ramon",9,89.0,false));
		
		
		do {
			
			System.out.println("""
			0.- Salir
			1. -Añadir trastero	
			2. -Buscar un trastero por precio	
			3. -Buscar un nº de trastero
			4. -Buscar el trastero con precio maximo
			5. - Eliminar un trastero
					""");
			System.out.println("Elige una opcion:");
			op= Integer.parseInt(sc.nextLine());
			
				switch(op) {
				
					case 0:
						System.out.println("Saliendo...");
						break;
					case 1:
						
						System.out.println("Introduce los metros: ");
						metros= Double.parseDouble(sc.nextLine());
						System.out.println("Introduce la dirección:");
						dir= sc.nextLine();
						System.out.println("Introduce nº de trastero:");
						numTras= Integer.parseInt(sc.nextLine());
						System.out.println("Introduce el precio:");
						price = Double.parseDouble(sc.nextLine());
						System.out.println("Introduce si esta ocupado:");
						ocu= Boolean.parseBoolean(sc.nextLine());
						
						if(o.addTrastero(new Trastero(metros,dir,numTras,price,ocu))) {
							
							System.out.println("Trastero agregado correctamente");
						}else {
							System.out.println("El trastero no se ha podido agregar");
						}
								
						
						break;
						
					case 2:
						
						System.out.println("Indica el precio del trastero que desea buscar");
						price= Double.parseDouble(sc.nextLine());
						
						System.out.println(o.findByPrice(price));
						
						
						break;
					case 3:
						System.out.println("Indica el nº de trastero que desea buscar:");
						numTras= Integer.parseInt(sc.nextLine());
						
						System.out.println(o.findByNum(numTras));
						
						
						break;
					case 4:
						
						System.out.println(o.findByMaxMoney());
						
						break;
					case 5:
						
						System.out.println("Indica el numero de trastero");
						numTras= Integer.parseInt(sc.nextLine());
						
							if(o.deleteObjet(numTras)) {
								
								System.out.println("Trastero eliminado correctamente");
							}else {
								System.out.println("El trastero no se ha podido eliminar");
							}
						
						break;
				
				
				}
			
			
			
			
			
		}while(op!=0);
		
		
	}

}
