package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Socios so = new Socios("Antonio","Casado",0,"4343563",24);
		Socios so1 = new Socios("Pepe","Oliva",1,"3435353",25);
		Socios so2 = new Socios("Jesus","Santos",2,"4545646",26);
		Socios so3 = new Socios("Lucas","Ortiz",3,"4546474",27);
		Socios so4 = new Socios("Jose","Pastor",4,"3435363",28);
		
		int opcion=0;
		
		
		
		List<Socios> lista = new ArrayList<Socios>();
		CrudSocio crdSo = new CrudSocio(lista);
		
		lista.add(so);
		lista.add(so1);
		lista.add(so2);
		lista.add(so3);
		lista.add(so4);
		
		
		
		System.out.println(	crdSo.buscarPorId(1));
		
		do {
			
			System.out.println("Elija la opción que prefiera");
			System.out.println("""
			0.Salir		
			1.Buscar socios
			2.Mostar todos los datos
			3.Borrar datos		
					""");
			opcion=Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			
				case 0: 
				System.out.println("Saliendo...");
				break;
				
				case 1:
					System.out.println("Indíque la Id del socio que desea buscar");
					
					
					System.out.println(crdSo.buscarPorId(Integer.parseInt(sc.nextLine())));
					break;
				case 2:
					System.out.println(crdSo.toString());
					
					break;
				case 3:
					System.out.println("¿Que ID de socio desea eliminar?");
					crdSo.eliminarSocio(Integer.parseInt(sc.nextLine()));
					
				default:
					System.out.println("La opción elegida no esta establecida");
					break;
					
					
					
					
			
			}
			
			
			
		
		}while(opcion!=0);

		
		
		
		
		
		
		
		sc.close();
	}

}
