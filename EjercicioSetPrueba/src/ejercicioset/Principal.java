package ejercicioset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Principal {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int op,anio;
		String matri,marca;
		double precio,precio1,precio2;
		boolean ocu;
		
		Set<Vehiculo> listSet = new HashSet<Vehiculo>();
		
		EmpresaAlquiler eA = new EmpresaAlquiler(listSet);
		eA.addCar(new Vehiculo("3456JWT", "Seat", 8, 50.0, false));
		eA.addCar(new Vehiculo("8945JWT", "Renault", 9, 80.0, true));
		eA.addCar(new Vehiculo("6735JWT", "Peugeot", 10, 60.0, true));
		eA.addCar(new Vehiculo("3456JWT", "Hyundai", 12, 40.0, false));
		eA.addCar(new Vehiculo("3455JWT", "Citroen", 6, 26.0, false));
		
		do {
			
			System.out.println("""
			0. -Salir
			1. -Añadir un nuevo vehículo
			2. -Buscar un vehículo por matricula
			3. -Buscar todos los vehículos por precio de alquiler
			4. -Buscar vehiculo mas caro	
			5. -Eliminar un vehiculo por matricula	
			6. -Modificar el precio de alquiler
			7. -Mostrar todos los vehículos no alquilados
			8. -Ordenar por año de fabricación de menor a mayor
			9.- Ordenar por precio de alquiler menor a mayor
					""");
			op= Integer.parseInt(sc.nextLine());
			
				switch(op) {
				
					case 0:
						System.out.println("Saliendo...");
						break;
						
					case 1:
						
						System.out.println("Introduce la matricula del vehiculo");
						matri = sc.nextLine();
						System.out.println("Introduce la marca del vehiculo");
						marca = sc.nextLine();
						System.out.println("Introduce el año");
						anio = Integer.parseInt(sc.nextLine());
						System.out.println("Introduce el precio por dia");
						precio = Double.parseDouble(sc.nextLine());
						System.out.println("Esta ocupado el vehiculo / False o True");
						ocu = Boolean.parseBoolean(sc.nextLine());
							eA.addCar(new Vehiculo(matri, marca, anio, precio, ocu));
							
						break;
					case 2: 
						System.out.println("Introduce la matricula a buscar");
						matri= sc.nextLine();
						System.out.println(eA.findByMatri(matri));
						
						
						break;
						
					case 3:
						System.out.println("Introduce el rango de precio 1");
						precio1= Double.parseDouble(sc.nextLine());
						System.out.println("Introduce el rango de precio 2");
						precio2= Double.parseDouble(sc.nextLine());
						System.out.println(eA.findByMoneyRent(precio1, precio2));
						
						break;
						
					case 4:
						System.out.println(eA.findByHighestValuatedCar());
							
						
						break;
						
					case 5:
						
						System.out.println("Introduce la matrícula");
						matri = sc.nextLine();
						eA.deleteCar(matri);
						break;
						
					case 6:
						System.out.println("Introduce la matrícula de un vehículo");
						matri = sc.nextLine();
						eA.editMatriCar(matri);
						
						break;
					case 7:
						eA.showCarNotRent();
						break;
						
					case 8:
						System.out.println(eA.orderByFabri());
						
						break;
						
					case 9:
						System.out.println(eA.orderByPrice());
						break;
						
					default:
						
						System.out.println("Saliendo...");
						break;
				
				}
			
			
			
		}while(op!=0);
		
		sc.close();
	}
	
	
}
