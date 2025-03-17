
package proyectodos;

import java.util.Random;
import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		int eleccion, eleccionCase1, eleccionPistas, horas, hasta = 3, desde = 1, tiempo, seguir;
		String pistas[] = { "Fútbol 11", "Fútbol 7", "Fútbol Sala" };
		double precios[] = { 15.50, 10.50, 7.45 };
		
		double resultado;
		Random aleatorios = new Random(System.nanoTime());
		// MENSAJE DE BIENVENIDA
		System.out.println("\tBienvenidos a Pista Gol");
		System.out.println("*********************************************");
		// BUCLE DEL MENU PRINCIPAL
		do {
			System.out.println("\nMenú principal");
			System.out.println("""
					0. Salir
					1. Pistas disponibles
					2. Precios
					3. Disponibilidad de pistas""");

			eleccion = Leer.datoInt();
			// AQUÍ LEEMOS LA ELECCIÓN DEL USUARIO Y ENTRA EN EL SIGUIENTE MENU O SALE DEL
			// PROGRAMA.
			if (eleccion > 3) {
				System.out.println("Introduzca un número válido");
			} else {
				switch (eleccion) {
				case 0:
					System.out.println("Saliendo...");
					System.out.println("Gracias por utilizar mi programa");
					break;

				case 1:
					do {
						System.out.println("Elija la ubicación");
						System.out.println("""
								1. Polideportivo Los Remedios(Calle Niebla)
								2. Colegio Salesianos Triana (Calle Conde Bustillo)
								3. Polideportivo la Macarena (Calle Av.Macarena)
								0. Salir""");

						eleccionCase1 = Leer.datoInt();
						// AQUÍ DEBE DE INTRODUCIR UN NÚMERO VÁLIDO
						if (eleccionCase1 > 3) {
							System.out.println("Introduzca un número válido");
						} else if (eleccionCase1 != 0) {
							// MENÚ DE LA ELECCIÓN DEL CAMPO
							do {
								System.out.println("Elige el campo que quieres");
								System.out.println("""
										1. Fútbol 11
										2. Fútbol 7
										3. Fútbol Sala
										0. Salir""");

								eleccionPistas = Leer.datoInt();

								if (eleccionPistas > 3) {
									System.out.println("Introduzca un número válido");

								} else if (eleccionPistas != 0) {
									// GENERAR DISPONIBILIDAD ALEATORIA
									tiempo = aleatorios.nextInt(hasta - desde + 1) + desde;
									switch (tiempo) {
									// MOSTRAR PRECIO DE LAS PISTAS SELECCIONADAS
									case 1:
										System.out.printf("La pista de %s cuesta %.2f€\n", pistas[eleccionPistas - 1],
												precios[eleccionPistas - 1]);
										System.out.println("¿Marca 1. si quieres continuar, para volver pulsa 0.?");
										seguir = Leer.datoInt();
										if (seguir == 1) {
											System.out.println("\n¿Cuántas horas quieres alquilar?");
											horas = Leer.datoInt();
											resultado = horas * precios[eleccionPistas - 1];
											System.out.printf("\nEn total las %d horas en el campo de %s son: %.2f€\n",
													horas, pistas[eleccionPistas - 1], resultado);

											

										}
										break;
									case 2:
										System.out.println("Pocas horas disponibles, reserva cuanto antes");
										break;
									case 3:
										System.out.println("En este momento todas nuestras pistas están ocupadas");
										break;
									}
								}
							} while (eleccionPistas != 0);
						}
					} while (eleccionCase1 != 0);
					break;

				case 2:
					System.out.println("Estos son los precios de las pistas por horas\n");
					for (int i = 0; i < pistas.length; i++) {
						System.out.print(pistas[i] + "\t");
					}
					System.out.println(
							"\n*********************************************************************************************");
					for (int i = 0; i < precios.length; i++) {
						System.out.printf("%.2f€ \t\t", precios[i]);
					}
					System.out.println("\n");
					break;
				// MOSTRAR DISPONIBILIDAD DE LAS PISTAS
				case 3:
					tiempo = aleatorios.nextInt(hasta - desde + 1) + desde;
					System.out.println("------------------------------------------------------------------");
					switch (tiempo) {
					case 1:
						System.out.println("Disponibilidad total del alquiler de esta pista");
						break;
					case 2:
						System.out.println("Pocas horas disponibles, reserva cuanto antes");
						break;
					case 3:
						System.out.println("En este momento todas nuestras pistas están ocupadas");
						break;
					}
					System.out.println("------------------------------------------------------------------");
					break;
				}
			}
		} while (eleccion != 0);
	}
}
