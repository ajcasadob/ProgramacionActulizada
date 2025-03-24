package ejercicio04;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Realizar, usando la clase HashMap, una agenda de teléfonos (un Contacto como clave y el número de
		teléfono como valor). Crear aquellos métodos que se utilizan normalmente en una agenda, como
		agregar, borrar, mostrar, buscar por algún criterio (por ejemplo, por nombre), modificar algún dato,
		etc. Y un main para probar todo.*/
		Scanner sc = new Scanner(System.in);
		
		int opcion=0;
		String nombre, telefono="";
		HashMap<Contacto,String> lista = new HashMap<Contacto,String>();
		
		
		
		Contacto contacto1= new Contacto("Juan","678546789");
		Contacto contacto2= new Contacto("Pedro","67547346");
		Contacto contacto3= new Contacto("Isidro","4564677");
		Contacto contacto4= new Contacto("Luis","67456476");
		Agenda agenda2 = new Agenda(lista);

		
		agenda2.addTlf(contacto1, telefono);
		agenda2.addTlf(contacto2, telefono);
		agenda2.addTlf(contacto3, telefono);
		agenda2.addTlf(contacto4, telefono);
		
		do {
			
			System.out.println("Elige una opción:");
			System.out.println("""
					1. Añadir contacto
					2. Eliminar contacto
					3. Mostrar contactos
					4. Buscar por nombre
					0. Salir
					
					
					""");
			opcion=Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			
			case 0:
				System.out.println("Saliendo....");
				
				break;
			case 1:
				System.out.println("Introduce el nombre del contacto:");
				nombre= sc.nextLine();
				System.out.println("Introduce el numero de telefono:");
				telefono= sc.nextLine();
				Contacto contacto = new Contacto(nombre, telefono);
				agenda2.addTlf(contacto, telefono);
				break;
			
			case 2:
				System.out.println("Introduce el nombre del contacto a eliminar:");
				
				nombre= sc.nextLine();
				agenda2.deleteTlf(nombre);
				
				break;
				
			case 3: 
				agenda2.showTlf();
				break;	
				
			case 4:
				System.out.println("Introduce el nombre del contacto a buscar:");
				nombre= sc.nextLine();
				System.out.println(agenda2.buscarPorNombre(nombre));
				break;
				
			default:
				System.out.println("Opción no válida");
				break;	
					
					
			}
			
			
			
			
			
		}while(opcion!=0);
		
		
		
		
		sc.close();

	}

}
