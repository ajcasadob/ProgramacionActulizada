package proyecto;

import java.util.Random;
import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

		int opcion, opcionLugar,opcionMenu2, tiempo, hasta = 5, desde = 1,seguir,horas;
		String pistas[] = { "Fútbol 11", "Fútbol 7", "Fútbol Sala" };
		double precios[] = { 15.50, 10.50, 7.45 };
		double resultado,aPagar;
		String condicion1="Las pistas estan todas disponible, disfruta de tú reserva."
				+ " \nRecuerda hacer un uso responsable de las instalaciones.",
				condicion2="En estos momentos todas nuestras pistas estan "
						+ "ocupadas, \ninténtelo de nuevo mas tarde o en otro momento.";

		String caseMen0 = "Salir", caseMen1 = "Alquiler de pistas", caseMen2 = "Precios",
				caseMen3 = "Disponibilidad de pistas";
		Random rnd = new Random(System.nanoTime());

		System.out.println("Bienvenidos a pistaGols");
		System.out.println("*************************");

		tiempo = rnd.nextInt(hasta - desde + 1) + desde;
		if(tiempo != 2) {
			tiempo = 1;
		}
		
		do {

			System.out.println("Menu principal.");
			System.out.println();
			System.out.println("*************************");
			System.out.printf("0. %s\n" + "1. %s\n" + "2.%s\n" + "3.%s\n", caseMen0, caseMen3, caseMen2, caseMen1);
			System.out.println("*************************");
			opcion = Leer.datoInt();

			switch (opcion) {
				case 0:
				System.out.println("Saliendo....");
				break;
				case 1:
				switch (tiempo) {

				case 1:
					System.out.println(condicion1);
					break;

				case 2:
					System.out.println(condicion2);
					break;

				}
				System.out.println("*************************");
				break;

			case 2:

				System.out.println("Estos son los precios de las pistas por horas\n");
				for (int i = 0; i < pistas.length; i++) {
					System.out.print(pistas[i] + "\t");
				}
				System.out.println("\n*****************************************************");
				for (int i = 0; i < precios.length; i++) {
					System.out.printf("%.2f€ \t\t", precios[i]);
				}

				break;

			case 3:

				do {

					System.out.println("""
							  	
							1. Polideportivo Los Remedios(Calle Niebla)
							2. Colegio Salesianos Triana (Calle Conde Bustillo)
							3. Polideportivo la Macarena (Calle Av.Macarena)

										""");
					opcionLugar = Leer.datoInt();
					
					
					System.out.println("Elige el campo que quieres");
					System.out.println("""
							1. Fútbol 11
							2. Fútbol 7
							3. Fútbol Sala
							0. Salir""");
					opcionMenu2=Leer.datoInt();
					
					if(tiempo==2) {
						
						System.out.println(condicion2);
						opcionMenu2=0;
					}else {
						
						System.out.println(condicion1);
						
						
					}
					if(opcionMenu2==1 || opcionMenu2==2 || opcionMenu2==3) {
						
						
						System.out.printf("La pista de %s cuesta %.2f€\n", pistas[opcionMenu2 - 1],
								precios[opcionMenu2 - 1]);
						System.out.println("1.Continuar\n 0.Volver\n");
						seguir = Leer.datoInt();
						
					}else {
						opcionMenu2=0;
						seguir=0;
					}
					if(seguir==1) {
						
						System.out.println("\n¿Cuántas horas quieres alquilar?");
						horas = Leer.datoInt();
						resultado = horas * precios[opcionMenu2 - 1];
						System.out.printf("\nEn total las %d horas en el campo de %s son: %.2f€\n",
								horas, pistas[opcionMenu2 - 1], resultado);
						System.out.println("1.Continuar\n 0.Volver\n");
						seguir = Leer.datoInt();
						if(seguir==1) {
							
							System.out.println("¿Con cuánto va a pagar?");
							aPagar=Leer.datoDouble();
							while(aPagar<resultado){
							if(aPagar<resultado) {
								
								System.out.println("Insuficiente dinero");
								System.out.println("Introduzca una cantidad valida");
								aPagar=Leer.datoDouble();
							
							}
								
	
							}
							
						}
							System.out.println("Aquí te muestro su ticket:");
						
						
					}
					break;
					
					
					
				} while (opcionMenu2 != 0);
				
			}

		} while (opcion != 0);

	}
}
