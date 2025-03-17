package proyecto;

import java.util.Random;
import utilidades.Leer;

public class Principal {

	// Miércoles 30 hablar sobre el proyecto
	// Jueves 31 Germán empezo el caso 0 y 2 y Antonio ha hecho el caso 1 y 4
	// Lunes 4 hemos hecho entre los 2 el caso 3 y hemos puesto bonito la impresión, también hemos documentado el código.
	public static void main(String[] args) {
		int opcion, opcionLugar, opcionMenu2 = 0, tiempo, hasta = 5, desde = 1, seguir, horas, tam = 3, modificar,
				aCambiar, numeroPersonas;
		String pistas[] = { "Fútbol 11", "Fútbol 7", "Fútbol Sala" };
		double precios[] = { 15.50, 10.50, 7.45 };
		double resultado, aPagar, aDevolver;
		String datosPersonales[] = new String[tam];

		String[] preguntas = { "Nombre", "DNI", "F.Nacimiento", "Altura", "Peso", "Gmail" };
		String datos[] = { "Nombre", "DNI", "Fecha" };
		//OPCIONES DE LA CONDICIÓN
		String condicion1 = "Las pistas están todas disponibles, disfruta de tu reserva.\nRecuerda hacer un uso responsable de las instalaciones.";
		String condicion2 = "En estos momentos todas nuestras pistas están ocupadas,\ninténtelo de nuevo más tarde o en otro momento.";
		//OPCIONES DEL MENÚ
		String caseMen0 = "Salir", caseMen1 = "Alquiler de pistas", caseMen2 = "Precios",
				caseMen3 = "Ver la disponibilidad de pistas", caseMen4 = "Registro de personas", nuevoDato;
		
		Random rnd = new Random(System.nanoTime());

		System.out.println("Bienvenidos a pistaGols");
		System.out.println("---------------------------------------");
		// Genera un número aleatorio para determinar el estado de las pistas
		tiempo = rnd.nextInt(hasta - desde + 1) + desde;
		if (tiempo != 2) {
			tiempo = 1;
		}
		// Bucle principal del menú
		do {
			System.out.println("Menu principal.");
			System.out.println("-----------------------------");
			System.out.printf("0. %s\n1. %s\n2. %s\n3. %s\n4. %s\n", caseMen0, caseMen3, caseMen2, caseMen1, caseMen4);
			System.out.println("-----------------------------");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Saliendo....");
				System.out.println("Gracias por utilizar mi programa :)");
				break;
				// Opción para alquilar pistas disponibles
			case 1:
				switch (tiempo) {
				case 1:
					System.out.println("************************************************************");
					System.out.println(condicion1);
					break;
				case 2:
					System.out.println("************************************************************");
					System.out.println(condicion2);
					break;
				}
				System.out.println("************************************************************");
				break;
				// Opción para mostrar precios
			case 2:
				System.out.println("Estos son los precios de las pistas por horas\n");
				System.out.println("--------------------------------------------------------------");
				for (int i = 0; i < pistas.length; i++) {
					System.out.print(pistas[i] + "\t");
				}
				System.out.println("\n");
				for (int i = 0; i < precios.length; i++) {
					System.out.printf("%.2f€ \t\t", precios[i]);
				}
				System.out.println("\n--------------------------------------------------------------");
				break;
			case 3:
				// Opción para ver disponibilidad de pistas
				do {
					System.out.println("--------------------------------------------------------------------------------------------------------");
					System.out.println("""
							1. Polideportivo Los Remedios (Calle Niebla)
							2. Colegio Salesianos Triana (Calle Conde Bustillo)
							3. Polideportivo la Macarena (Calle Av. Macarena)
							""");
					System.out.println("--------------------------------------------------------------------------------------------------------");

					
					opcionLugar = Leer.datoInt();
					// Procesa la elección de la pista
					if (opcionLugar > 3 || opcionLugar < 1) {
						System.out.println("Elige una opción correcta");
					} else {
						System.out.println("--------------------------------------------------------------------------------------------------------");
						System.out.println("Elige el campo que quieres");
						System.out.println("""
								1. Fútbol 11
								2. Fútbol 7
								3. Fútbol Sala
								0. Salir
								""");
						System.out.println("--------------------------------------------------------------------------------------------------------");

						opcionMenu2 = Leer.datoInt();
						if (tiempo == 2) {
							System.out.println("************************************************************");
							System.out.println(condicion2);
							System.out.println("************************************************************");

							opcionMenu2 = 0;
						} else {
							System.out.println("************************************************************");
							System.out.println(condicion1);
							System.out.println("************************************************************");

						}
						if (opcionMenu2 == 1 || opcionMenu2 == 2 || opcionMenu2 == 3) {
							System.out.printf("La pista de %s cuesta %.2f€\n", pistas[opcionMenu2 - 1],
									precios[opcionMenu2 - 1]);
							System.out.println("1.Continuar \n0.Volver");
							seguir = Leer.datoInt();
						} else {
							opcionMenu2 = 0;
							seguir = 0;
						}
						if (seguir == 1) {
							System.out.println("¿Cuántas horas quieres alquilar?");
							horas = Leer.datoInt();
							resultado = horas * precios[opcionMenu2 - 1];
							System.out.printf("\nEn total las %d horas en el campo de %s son: %.2f€\n", horas,
									pistas[opcionMenu2 - 1], resultado);
							System.out.println("1.Continuar \n0.Volver");
							seguir = Leer.datoInt();
                            // Verificación de datos

							if (seguir == 1) {
								System.out.println(
										"Ahora le vamos a pedir los datos para la reserva: \n1. Nombre\n2. DNI\n3. Fecha Reserva");
								for (int i = 0; i < datosPersonales.length; i++) {
									System.out.printf("Introduzca el dato número %d\n", i + 1);
									datosPersonales[i] = Leer.dato();
								}
								System.out.println("Les muestro sus datos personales\n");
								System.out.println("-------------------------------------------------");
								for (String valor : datos) {
									System.out.printf("%s\t\t", valor);
								}
								System.out.println("\n");
								for (String valor : datosPersonales) {
									System.out.printf("%s\t\t", valor);
								}
								System.out.println("\n-------------------------------------------------");
								System.out.println("¿Están los datos correctos?\n1. Correcto\n2. Modificar Datos");
								modificar = Leer.datoInt();
								while (modificar != 1) {
									System.out
											.println("¿Qué dato quieres cambiar?\n1. Nombre\n2. DNI\n3. Fecha Reserva");
									aCambiar = Leer.datoInt();
									System.out.println("Introduce el nuevo dato");
									nuevoDato = Leer.dato();
									datosPersonales[aCambiar - 1] = nuevoDato;
									System.out.println("Estos son los nuevos datos");
									System.out.println("\n---------------------------------------------------");
									for (String valor : datos) {
										System.out.printf("%s\t\t", valor);
									}
									System.out.println("\n");
									for (String valor : datosPersonales) {
										System.out.printf("%s\t\t", valor);
									}
									System.out.println("\n---------------------------------------------------");
									System.out
											.println("¿Están los datos correctos?\n1. Correcto\n2. Modificar Datos");
									modificar = Leer.datoInt();
								}
                                // Procesar pago

								System.out.println("\n¿Con cuánto va a pagar?");
								aPagar = Leer.datoDouble();
								while (aPagar < resultado) {
									System.out.println("Insuficiente dinero");
									System.out.println("Introduzca una cantidad válida");
									aPagar = Leer.datoDouble();
								}
								aDevolver = aPagar - resultado;
								System.out.println("Aquí te muestro su ticket:");
								System.out.println(
										"\n-----------------------------------pistaGols-----------------------------------");
								System.out.println("Datos Personales");
								for (String valor : datos) {
									System.out.printf("%s\t\t", valor);
								}
								System.out.println("\n");
								for (String valor : datosPersonales) {
									System.out.printf("%s\t\t", valor);
								}
								System.out.printf("\nA pagar: %.2f€ \nPagado: %.2f€ \nA devolver: %.2f€", resultado,
										aPagar, aDevolver);
								System.out.println("\n0. Salir");
								opcionMenu2 = Leer.datoInt();
							}
						}
					}
				} while (opcionMenu2 != 0);
				break;
				// Opción para registrar personas
			case 4:
				
				System.out.println("Registro de personas");
				System.out.print("¿Cuántas personas vas a registrar? ");
				numeroPersonas = Leer.datoInt();

				String[][] datosPersonas = new String[numeroPersonas][preguntas.length];
				for (int i = 0; i < numeroPersonas; i++) {
					System.out.printf("\nDatos de la persona %d:%n", i + 1);
					for (int j = 0; j < preguntas.length; j++) {
						System.out.printf("Introduce tu %s: ", preguntas[j]);
						datosPersonas[i][j] = Leer.dato();
					}
				}
				System.out.println("\nDatos de las personas registradas:");
				System.out.println(
						"--------------------------------------------------------------------------------------------------------");
				for (String pregunta : preguntas) {
					System.out.print(pregunta + "\t            \t");
				}
				System.out.println(
						"\n--------------------------------------------------------------------------------------------------------");
				for (int i = 0; i < numeroPersonas; i++) {
					for (int j = 0; j < preguntas.length; j++) {
						System.out.print(datosPersonas[i][j] + "\t\t");
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("Esa opción no existe, no juegues con mis sentimientos");
				break;
			}
		} while (opcion != 0);
	}
}
