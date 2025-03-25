package ejerciciotipoexamen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double metrosCua=0.0, precio=0.0;
		String direccion="";
		int numTrastero=0,opcion;
		boolean ocupacion=false;
		
		List <Trastero> listaTrastero = new ArrayList<>();
		
		Oficina of = new Oficina(listaTrastero);
		
		of.addTrastero(new Trastero(20.2,"jaula",8,40.000,true));
		of.addTrastero(new Trastero(30.2,"pepito",2,45.000,true));
		of.addTrastero(new Trastero(40.2,"rafaelito",6,70.000,false));
		of.addTrastero(new Trastero(50.2,"andrelo",5,80.000,true));
		of.addTrastero(new Trastero(90.2,"elloco",3,90.000,false));
		
		
		//of.listarTrasteros();
		
		do {
			
			System.out.println("""
			0. Salir
			1.Añadir un nuevo trastero
			2.Buscar un trastero por precio
			3.Buscar un trastero por numero
			4.Buscar el trastero mas caro
			5.Eliminar un trastero
			6. Modicar el precio de un trastero elegido por el usuario
			7.Ordenar trastero por orden natural(Numero)
			8.Ordenar trastero por precio y orden no natural(Precio)
			9. Mostrar los trasteros no ocupados		
					""");
			System.out.println("Elije la opción: ");
			opcion=Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			
				case 0:
				
				System.out.println("Saliendo..");
				break;
			
				case 1:
					System.out.println("Indíque los metros cuadrados: ");
					metrosCua = Double.parseDouble(sc.nextLine());
					System.out.println("Indíque la direccion: ");
					direccion = sc.nextLine();
					System.out.println("Indíque numero de trastero");
					numTrastero = Integer.parseInt(sc.nextLine());
					System.out.println("Indíque su precio :");
					precio = Double.parseDouble(sc.nextLine());
					System.out.println("Indíque la ocupación del piso (True: Ocupado, False: Libre");
					ocupacion= Boolean.parseBoolean(sc.nextLine());
					of.addTrastero(new Trastero(metrosCua, direccion, numTrastero, precio, ocupacion));
					break;
				case 2:
					
					System.out.println("Indíque el precio");
					precio = Double.parseDouble(sc.nextLine());
					
					if(of.BuscarPorPrecio(precio).isEmpty()) {
						System.out.println("No hay trasteros con ese precio");
					}else {
						System.out.println(of.BuscarPorPrecio(precio));
					}
					
					break;
				case 3:
					System.out.println("Introduzca el número de trastero");
					numTrastero= Integer.parseInt(sc.nextLine());
					
					if(of.buscarPorNumero(numTrastero)!=null) {
						System.out.println(of.buscarPorNumero(numTrastero));
						
					}else {
						System.out.println("No se ha encontrado el trastero");
					}
					
					break;
				case 4:
					if(of.buscarMayorPrecio().isEmpty()) {
						System.out.println("No hay trasteros con ese precio");
					}else {
						System.out.println(of.buscarMayorPrecio());
					}
					
					break;
				case 5:
					System.out.println("Indique el numero de trastero");
					numTrastero= Integer.parseInt(sc.nextLine());
					of.eliminarTrastero(numTrastero);
					
					break;
					
				case 6:
					
					System.out.println("Indique el numero de trastero");
					numTrastero= Integer.parseInt(sc.nextLine());
					System.out.println("Indíque el nuevo precio");
					precio= Double.parseDouble(sc.nextLine());
					of.modificarTrastero(numTrastero, precio);
					
					break;
				case 7:
					System.out.println(of.ordenarNatural());
					break;
					
				case 8:
					System.out.println(of.ordenarNoNatural());
					
					break;
				case 9:
					
					of.listarTrasteros();
					break;
					
					default:
						
						System.out.println("La opción elegida no esta establecida");
						break;
			}
			
			
			
			
			
		}while(opcion != 0);
		
		
		sc.close();
	}

}
