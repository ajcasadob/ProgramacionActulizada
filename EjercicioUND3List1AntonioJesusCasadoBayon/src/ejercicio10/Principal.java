package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion,cantidad=0,opcion2,numSaltos=0 , totalBilletesVendidos = 0;
		double precio=2.5,precioSaltos=0.5,dineroVentas=0,aPagar=0,saldoTotal=0,precioPPersona=0,aDevolver=0,nuevoPrecio;
		String contra="1234",pass1="";
		Billete bl=new Billete(precio, precioSaltos,numSaltos);
		Maquina mq=new Maquina(saldoTotal,contra,bl );
		
		System.out.println("Bienvenidos a metro Sevilla");
		
		
		do {
			System.out.println("\nElija la opción que desee:");
			System.out.println("""
			0.Salir
			1.Comprar billete
			2.Pagar billete
			3.Imprimir tickets
			4.Modo administrador		
					""");
			opcion=Leer.datoInt();
			
			
			
			
			switch(opcion) {
			
			case 0:
				System.out.println("Saliendo..");
				System.out.println("Gracias por su visita.");
				break;
				
			case 1:
				
				System.out.println("¿Cuántos billetes desea comprar?");
				cantidad=Leer.datoInt(); //leemos la cantidad de billetes que quiere el user
				totalBilletesVendidos += cantidad; //guardamos esa cantidad en una variable !!!!!! ESTO DEBERÍA SER PROPIEDAD/ATTR DE MÁQUINA
				System.out.println("¿Cuántos saltos vas a dar?");
				numSaltos=Leer.datoInt();
				dineroVentas=bl.calcularVenta(cantidad);
				break;
				
			case 2:
				
				bl.imprimirVenta(cantidad, dineroVentas);
				System.out.println("¿Con cuánto dinero desea pagar?");
				aPagar=Leer.datoDouble();
				precioPPersona=mq.calcularPrecio(aPagar, cantidad);
				break;
				
			case 3:
				
				mq.imprimirTicket(aPagar, cantidad,precioPPersona);
				break;
			case 4:
				
				System.out.println("Introduzca la clave de acesso");
				pass1=Leer.dato();
				if(mq.comprobarPass(pass1)) {
					
					do {
						System.out.println("""
								0.Salir
								1.Comprobar Saldo
								2.Resetear a 0.
								3.Cambiar precio de billetes		
										""");
					System.out.println("Elija la opción correcta:");
					opcion2=Leer.datoInt();
					switch(opcion2) {
					
						case 0:
						
						System.out.println("Saliendo..");
						break;
						
						case 1:
							mq.imprimirRecaudacion(mq.recaudacionTotal(totalBilletesVendidos));
							break;
						
							
							
						case 2:
							//reseteamos todas las variables
							mq.setSaldoTotal(0);
							cantidad = 0;
							totalBilletesVendidos = 0;
							System.out.println("Saldo actual es:"+mq.getSaldoTotal());
							break;
							
						case 3:
							System.out.println("Introduzca el nuevo precio");
							nuevoPrecio=Leer.datoDouble();
							bl.setPrecio(nuevoPrecio);
							System.out.println("Nuevo precio establecido es de "+bl.getPrecio()+" €");
							break;
							default:
								System.out.println("Introduzca un dato correcto");
								break;
							
					}	
					}while(opcion2!=0);	
				}else {
					System.out.println("Password incorrecta, intentelo de nuevo");
				
				}
				
				
			}
			
			
			
		}while(opcion!=0);
		
		
		
	}

}
