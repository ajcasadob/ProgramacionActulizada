package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int op,id,tope;
		String name,mensaje;
		double precio;
		
		List<Mensaje> list = new ArrayList<>();
		
		WhatsApp men = new WhatsApp(list);
		
		men.addMensaje(new Mensaje(10, "Pepe", "Hola"));
		men.addMensaje(new Mensaje(1, "Luis", "Adios"));
		men.addMensaje(new Mensaje(8, "Jose", "Bien"));
		men.addMensaje(new Mensaje(3, "Andres", "Mal"));
		men.addMensaje(new Mensaje(6, "Antonio", "Cabreado"));
		men.addMensaje(new Mensaje(2, "Simon", "Bienvenido"));
		
		
		
		
		do {
			
			System.out.println("""
			0. -Salir
			1. -Añadir un nuevo mensaje	
			2. -Borrar un mensaje
			3. -Modificar un mensaje	
			4. -Mostrar toda la lista con un iterator
			5. - Buscar el cuerpo de un mensaje
			6. -Buscar id de un mensaje
			7.- Calcular precio por mensaje
			8. -Imprimir por pantalla tamaño de la lista
			9. - Ordenar la lista en orden alfabetico por nombre (natural)
			10. -Ordenar la lista por id de menor a mayor (no natural)
					""");
			System.out.println("Elije la opción que desee");
			op = Integer.parseInt(sc.nextLine());
			
				switch(op) {
				
					case 0:
						
						System.out.println("Saliendo..");
						break;
					
					case 1:
						
						System.out.println("Introduce la id");
						id= Integer.parseInt(sc.nextLine());
						System.out.println("Introduce el nombre del contacto");
						name = sc.nextLine();
						System.out.println("Introduce el mensaje");
						mensaje = sc.nextLine();
						
						men.addMensaje(new Mensaje(id, name, mensaje));
						
						
						
						break;
						
					case 2:
						
							System.out.println("Introduce la id del mensaje que desea eliminar:");
							id=Integer.parseInt(sc.nextLine());
							men.eliminarMensaje(id);
						
						break;
						
					case 3:
						
						System.out.println("Introduce la id del mensaje que se va a modificar");
						id = Integer.parseInt(sc.nextLine());
						men.modificarUnMensaje(id);
						
						break;
						
					case 4:
						
						men.imprimirTodaLaLista();
						break;
						
					case 5:
						
						System.out.println("introduce el cuerpo del mensaje:");
						mensaje = sc.nextLine();
						System.out.println(men.buscarCuerpoMensaje(mensaje));
						
						
						break;
						
					case 6:
						
						System.out.println("Introduce la id que desea buscar:");
						id = Integer.parseInt(sc.nextLine());
						
						
						System.out.println(men.buscarPorId(id));
						
						break;
						
					case 7:
						
						System.out.println("Introduce la id del contacto que desea calcular");
						id = Integer.parseInt(sc.nextLine());
						System.out.println("Introduce el precio del mensaje:");
						precio = Double.parseDouble(sc.nextLine());
						
						System.out.println(men.calcularDinero(id, precio));
						
						
						
						break;
						
					case 8:
							System.out.println("Introduce el tope:");
							tope = Integer.parseInt(sc.nextLine());
							
							men.imprimirPorPantallaMensaje(tope);
						
						break;
						
					case 9:
							
							System.out.println(men.ordenarNatural());
						
						break;
						
					case 10 :
						
						System.out.println(men.ordenarNoNatural());
						
						break;
						
						default:
							
							System.out.println("La opción elegida no esta establecida");
							break;
				
				}
			
			
			
			
			
			
			
			
		}while(op!=0);
		
		sc.close();
		
	}

}
