package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		
		/*2. Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero estilo hotel para que tenga caché.
			Debemos gestionar mi “minihotel” y para ello, debemos crear la clase Habitación, una clase Hotel con una
			lista de Habitaciones y una clase principal de prueba para gestionar el hotel (realmente habría algunas clases
			más, como serían Cliente, Productos, etc. Pero no entraremos en eso).
			
			Podemos poner todos los métodos en la clase Hotel. Se podrá hacer lo siguiente:
			
			1- Agregar una habitación a la lista (cuyos atributos serán tipo, precio, qué servicios extra tiene, String con el
			nombre de cliente asignado, número de días contratados, si está limpia, etc.)
			- Ver si está ocupada o no.
			- Calcular precio final según número de días, servicios extra contratados y consumo del minibar.
			- Mostrar factura.
			- Aquellos métodos que se quieran añadir.*/
		int tam=100,opcion,numDias,id=0;
		double precio;
		String nombrePension,nombrePersona;
		boolean servicioLimpieza;
		
		Habitacion lista[]=new Habitacion[tam];
		Hotel ht= new Hotel(lista);
		Habitacion hb=new Habitacion(100.4,"Desayuno","pepe",5,true,0);
		Habitacion hb1=new Habitacion(100.4,"Desayuno","pepe",5,true,1);
		Habitacion hb2=new Habitacion(100.4,"Desayuno","pepe",5,true,2);
		Habitacion hb3=new Habitacion(100.4,"Desayuno","pepe",5,true,3);
		Habitacion hb4=new Habitacion(100.4,"Desayuno","pepe",5,true,4);
		
		
		
		System.out.println("Bienvenidos a mi programa");		
		
		do {
			System.out.println();
			imprimirMenu();
			opcion=Leer.datoInt();
			
			
				switch(opcion) {
				
					case 0:
						System.out.println("Saliendo..");
						break;
						
					case 1: 
						
						System.out.println("Indíque el precio de la habitación");
						precio=Leer.datoDouble();
						System.out.println("Indíque pensión seleccionada (Desayuno, Media pensión, Pensión completa)");
						nombrePension=Leer.dato();
						System.out.println("Indíque su nombre");
						nombrePersona=Leer.dato();
						System.out.println("Indíque cuántos días desea alquilar la habitación");
						numDias=Leer.datoInt();
						System.out.println("Indíque si la habitación esta limpia(true) o sucia(false)");
						servicioLimpieza=Leer.datoBoolean();
						id++;
						
						
						Habitacion hb5= new Habitacion (precio,nombrePension,nombrePersona,numDias,servicioLimpieza,id);
						
						
				
				}
			
			
			
			
		}while(opcion!=0);
		
		

	}
	public static void imprimirMenu(){
		
		System.out.println("""
		0.Salir
		1.Agregar una habitación.
		2.Comprobar disponibilidad
		3.Calcular precio de la habitación.
		4.Mostrar factura		
				""");
		
		}
}
