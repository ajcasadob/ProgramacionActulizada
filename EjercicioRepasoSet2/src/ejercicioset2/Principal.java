package ejercicioset2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Gestionaremos una empresa de alquiler de vehículos. Tendremos la clase
		 * Vehiculo, cuyas características son: ,Matrícula (String, identificador único),
		 * Marca (String)
		 *
		 * Modelo (String)
		 * 
		 * Año de fabricación (int)
		 * 
		 * Precio de alquiler por día (double)
		 * 
		 * Si está alquilado o no (boolean)
		 * 
		 * También tendremos una clase EmpresaAlquiler, donde tendremos como atributo un
		 * Set de vehículos y métodos para:
		 * 
		 * Añadir un nuevo vehículo, validando que la matrícula no se repita.
		 * 
		 * Buscar un vehículo por matrícula y devolver sus detalles.
		 * 
		 * Buscar todos los vehículos dentro de un rango de precio de alquiler.
		 * 
		 * Buscar el vehículo más caro (el de mayor precio de alquiler).
		 * 
		 * Eliminar un vehículo por matrícula.
		 * 
		 * Modificar el precio de alquiler de un vehículo dado su matrícula.
		 * 
		 * Mostrar todos los vehículos no alquilados.
		 * 
		 * Ordenar los vehículos por año de fabricación de forma descendente y
		 * mostrarlos (esto requiere convertir el Set en una lista temporalmente).
		 * 
		 * Ordenar los vehículos por precio de alquiler de menor a mayor.
		 */

		
		Scanner sc = new Scanner(System.in);
		
		int op,year;
		String matri,marca,model;
		double price,rango1,rango2;
		boolean ocu;
		
		Set<Vehiculo> setCar = new HashSet<Vehiculo>();
		
		EmpresaAlquiler a = new EmpresaAlquiler(setCar);
		
		a.addCar(new Vehiculo("4567KWJ", "Seat", "Leon", 2012, 100.0, false));
		a.addCar(new Vehiculo("1234ABC", "Toyota", "Corolla", 2020, 120.0, true));
		a.addCar(new Vehiculo("9876XYZ", "Volkswagen", "Golf", 2019, 110.0, false));
		a.addCar(new Vehiculo("5678KLM", "Ford", "Focus", 2018, 95.0, true));
		a.addCar(new Vehiculo("3456DEF", "Renault", "Clio", 2021, 105.0, false));
		a.addCar(new Vehiculo("7890GHI", "Peugeot", "208", 2017, 90.0, true));
		a.addCar(new Vehiculo("2345JKL", "Hyundai", "Tucson", 2022, 130.0, false));
		a.addCar(new Vehiculo("6789MNO", "Kia", "Sportage", 2016, 115.0, true));
		a.addCar(new Vehiculo("1122PQR", "BMW", "Serie 1", 2020, 150.0, false));
		a.addCar(new Vehiculo("4455STU", "Mercedes", "Clase A", 2021, 160.0, true));
		a.addCar(new Vehiculo("7788VWX", "Audi", "A3", 2019, 140.0, false));
		
		do {
				System.out.println("""
				0. -Salir
				1. -Añadir new vehículo	
				2. -Buscar vehículo por matrícula
				3. -Buscar por rango de precio	
				4. -Buscar el vehículo mas caro
				5. -Eliminar un vehícula por matrículo
				6. -Modificar precio
				7. -Mostrar vehículos no alquilados
				8. -Ordenar por orden de fabricación
						""");
				System.out.println("Elije la opción deseada");
				op = Integer.parseInt(sc.nextLine());
			
			
			
				switch(op) {
				
					case 0:
						System.out.println("Saliendo...");
					
						break;
					
					case 1:
						System.out.println("Matrícula :");
						matri = sc.nextLine();
						System.out.println("Marca :");
						marca = sc.nextLine();
						System.out.println("Modelo: ");
						model = sc.nextLine();
						System.out.println("Año: ");
						year = Integer.parseInt(sc.nextLine());
						System.out.println("Precio:");
						price = Double.parseDouble(sc.nextLine());
						System.out.println("Ocupación:");
						ocu = Boolean.parseBoolean(sc.nextLine());
						
						a.addCar(new Vehiculo(matri, marca, model, year, price, ocu));
						
						break;
						
					case 2:
						
						System.out.println("Introduce matrícula");
						matri = sc.nextLine();
						
						System.out.println(a.findByMatri(matri));
					
						break;
					case 3:
						
						System.out.println("Rango de precio 1:");
						rango1 = Double.parseDouble(sc.nextLine());
						System.out.println("Rango de precio 2:");
						rango2 = Double.parseDouble(sc.nextLine());
						System.out.println(a.findByRangePriceSet(rango1, rango2));
						
						
						break;
						
					case 4:
						
						System.out.println(a.findByPriceCarHight());
						
						
						break;
					case 5:
						
						System.out.println("Matrícula: ");
						matri = sc.nextLine();
						a.deletedByMatri(matri);
						
						break;
						
					case 6:
							System.out.println("Matrícula: ");
							matri = sc.nextLine();
							System.out.println("Precio:");
							price= Double.parseDouble(sc.nextLine());
							a.editCarPrice(matri, price);
						
						break;
						
					case 7:
						
						a.showAllCarNotRent();
						break;
						
					case 8:
						
						System.out.println(a.orderByYear());
							
						
						break;
						
					case 9:
						
						System.out.println(a.orderByPrice());
						break;
				
				}
			
			
		}while(op!=0);
		
		
		
		
	}

}
