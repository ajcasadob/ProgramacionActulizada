package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion;
		double cantidad,saldo=0;
		
		
		String nombre;
		Cuentacorriente cc;
		
		
		
		System.out.println("Bienvenidos al banco");
		System.out.println("¿Cuál es su nombre?");
		nombre=Leer.dato();
		
		cc=new Cuentacorriente(saldo, nombre);
		
		do {
			
			System.out.println("""
		  \n0.Salir
			1.Ingresar dinero
			2.Retirar dinero
			3.Calcular a dólares americanos
			4.Consulta saldo
					""");
			System.out.println("Elige la opción que desee");
			opcion=Leer.datoInt();
			
			switch(opcion) {
				
				case 0:
				System.out.println("Saliendo..");
				break;
				
				case 1:
					System.out.println("¿Cuánto dinero desea ingresar?");
					cantidad=Leer.datoDouble();
					cc.sumarCantidad(cantidad);
					break;
						
				case 2:
					System.out.println("¿Cuánto dinero desea retirar?");
					cantidad=Leer.datoDouble();
					cc.restarCantidad(cantidad);
					break;
				
				case 3:
					cc.imprimirCambio(cc.cambiarDolares());
					break;
				case 4:
					
					cc.imprimirSaldo( nombre);
					
					break;
					default:
						System.out.println("La opción elegida no esta establecida");
						break;
			
			}
			
		}while(opcion!=0);

	}

}
