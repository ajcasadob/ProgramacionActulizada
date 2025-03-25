package repaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int opcion, numTras;
		double metrosCu, precio;
		String dir;
		boolean ocu;
		List<Trastero> lista = new ArrayList<>();
		
		Oficina o = new Oficina(lista);
		
		o.addTrastero(new Trastero(20, "piripi", 6, 47.0, false));
		o.addTrastero(new Trastero(15, "jesus", 8, 47.0, true));
		o.addTrastero(new Trastero(16, "caracol", 9, 60.0, false));
		o.addTrastero(new Trastero(27, "loco", 10, 78.0, true));
		o.addTrastero(new Trastero(39, "jelou", 11, 4.0, false));
		
		
		do {
			
		
			
			System.out.println("""
			0.Salir
			1.Agregar un nuevo trastero	
			2.Buscar trastero por precio
			3.Buscar un trastero por numero	
			4.Buscar el trastero mas caro
			5.Eliminar un trastero
			6.Modificar un trastero elegido por el usuario
			7.Ordenar por orden natural
					""");
			System.out.println("Elija la opción deseada");
			opcion=Integer.parseInt(sc.nextLine());
			
				switch(opcion) {
				
					case 0:
						System.out.println("Saliendo..");
					break;
					
					case 1:
						System.out.println("Indíque los metros cuadrados");
						metrosCu = Double.parseDouble(sc.nextLine());
						System.out.println("Indíque la dirección");
						dir = sc.nextLine();
						System.out.println("Indíque nº trastero");
						numTras = Integer.parseInt(sc.nextLine());
						System.out.println("Indíque precio: ");
						precio = Double.parseDouble(sc.nextLine());
						System.out.println("Indíque ocupación");
						ocu = Boolean.parseBoolean(sc.nextLine());
						
						
						
						if(o.addTrastero(new Trastero(metrosCu, dir, numTras, precio, ocu))) {
							
							System.out.println("Agregado correctamente");
						}else {
							System.out.println("No se pudo agregar");
						}
						break;
						
					case 2:
						System.out.println("Indíque el precio del trastero: ");
						precio= Double.parseDouble(sc.nextLine());
						
						System.out.println(o.findByPrice(precio));
						
						
						
						break;
					case 3:
						
						System.out.println("Indíque el numero de trastero");
						numTras=Integer.parseInt(sc.nextLine());
						
						
						System.out.println(o.findByNum(numTras));
						break;
					case 4:
						System.out.println(o.findByPriceMax());
						
						
						break;
					case 5:
						System.out.println("Indíque el numero de trastero a eliminar");
						numTras= Integer.parseInt(sc.nextLine());
						if(o.deleteTras(numTras)) {
							System.out.println("Trastero eliminado correctamente");
						}else {
							System.out.println("Trastero no encontrado");
						}
						
						
						break;
						
					case 6:
						
						System.out.println("Indíque el numero de trastero a modificar");
						numTras= Integer.parseInt(sc.nextLine());
						System.out.println("Indíque el precio");
						precio = Double.parseDouble(sc.nextLine());
						o.editTrastero(numTras, precio);
						
						break;
					case 7:
						System.out.println(o.OrderByNature());
						
						break;
						
					case 8:
						System.out.println(o.OrderByNoNature());
						break;
					case 9:
						o.listarTrasteros();
						break;
						default:
							
							System.out.println("opción incorrecta");
							break;
				
				}
		}while(opcion!=0);
		
		
	}

}
;