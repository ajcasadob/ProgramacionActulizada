package tpvalquiler;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	
	/*Día 1:
	 * Joaquín: Desarrollo menú principal y estructuración del contenido, eleccion de texto climático para el case 1 y creación de 'máquina' de carga de array bidimensional
	 * Álvaro:
	 * 
	 * Día 2: 
	 * Joaquín: Creación de case 2 del menú principal para gestionar y alquilar vehículos
	 * Álvaro:
	 * 
	 * Día 3:
	 * Joaquín: Finalizar gestión de alquiler y creación de opiniones 
	 * Álvaro: generación de un número random entre el 1 y el 3 para el case 1 del menu principal, case 4 del menu aleatorio
	 * */
	/*Este programa permitira al usuario, consultar climatología(que si es adversa limitara los alquileres), consultar
	 * o alquilar vehiculos, dejar valoraciones del servicio y ademas poder participar en un sorteo de un viaje
	 * a Las Navas.*/

	public static void main(String[] args) {

		Scanner keyB = new Scanner(System.in);
		Random rnd = new Random(System.nanoTime());
		int[][] priceTable = new int[3][3];
		int [] valueTable = new int[3];
		String [] valueString = {"Poco satisfecho","Satisfecho","Muy satisfecho"};
		String aux;
		double totPrice;
		int menuCase = 0, exitCase = 0, menuCaseAlq, earthSeaAir = 0, waterIncrement = 5, airIncrement = 15,weatherRnd,valueMenu=0,valueSwitch = 0,negativeCounter=0,
				varZero = 0, varOne = 1, varTwo = 2, varThree = 3, earthCase = 0, waterCase = 0,airCase=0, counter = 1, userInputTime = 0,rndUser,jackpot = 7,
				baseRnd1 = rnd.nextInt(15 - 10 + 1) + 10, baseRnd2 = rnd.nextInt(130 - 100 + 1) + 100,
				baseRnd3 = rnd.nextInt(650 - 570 + 1) + 570;
		String[] menuHeader = { "Hora", "Día", "Semana" };
		String caseMen1 = "Información climatológica", caseMen2 = "Gestionar/Consultar alquieres de vehículos",
				caseMen3 = "Dejar una valoración", caseMen4 = "Sorteo", caseMen0 = "Salir del programa";

		// éstos 4 bucles 'for' cargan el array bidimensional de la siguiente forma,
		// la primera linea de la tabla (i==0) se carga con -> j==0: nums 10-15, j==1:
		// nums 100-130, j==2: nums 570-650
		// las siguientes multiplican éstos valores, Ejemplo: i==1 es igual que i==0
		// pero * 5.
		for (int i = 0; i < priceTable.length; i++) {

			if (i == varZero) {
				for (int j = 0; j < priceTable[i].length; j++) {

					if (j == varZero)
						priceTable[i][j] = baseRnd1;
					if (j == varOne)
						priceTable[i][j] = baseRnd2;
					if (j == varTwo)
						priceTable[i][j] = baseRnd3;

				}
			}
			if (i == varOne) {
				for (int j = 0; j < priceTable[i].length; j++) {

					if (j == varZero)
						priceTable[i][j] = baseRnd1 * waterIncrement;
					if (j == varOne)
						priceTable[i][j] = baseRnd2 * waterIncrement;
					if (j == varTwo)
						priceTable[i][j] = baseRnd3 * waterIncrement;

				}
			}
			if (i == varTwo) {
				for (int j = 0; j < priceTable[i].length; j++) {

					if (j == varZero)
						priceTable[i][j] = baseRnd1 * airIncrement;
					if (j == varOne)
						priceTable[i][j] = baseRnd2 * airIncrement;
					if (j == varTwo)
						priceTable[i][j] = baseRnd3 * airIncrement;

				}
			}
		}
		// termina carga de array de precios
		
		//Aleatorizador de clima para que salte entre las partes del switch
		weatherRnd = rnd.nextInt(3-1+1)+1;
		
		//aleatorizador de id user para sorteo
		rndUser = rnd.nextInt(10-1+1)+1;
		/* por si quieres ver como se genera el aleatorio del clima System.out.println(weatherRnd);*/

		//comienzo del programa
		System.out.println("            Bienvenido a la terminal de alquiler Tiamar.");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Le supliremos sus necesidades de movilidad tanto por tierra, aire o mar.");
		System.out.println("------------------------------------------------------------------------");

		do {

			System.out.printf("Menú principal.\n" + "1.- %s\n" + "2.- %s\n" + "3.- %s\n" + "4.- %s\n" + "0.- %s\n",
					caseMen1, caseMen2, caseMen3, caseMen4, caseMen0);
			aux = keyB.nextLine();
			menuCase = Integer.parseInt(aux);

			switch (menuCase) {

			// climatología random si es el caso 1(caso de climatología extrema) permite consulta en todos, pero solo permite alquilar vehículos terrestres.
			case 1:
				System.out.println(caseMen1);
				System.out.println("-------------------------------------------------------------------------------------");
				//este switch no tiene default porque el usuario no introduce el valor, se introduce por el weatherRnd (1 , 2 o 3)
				switch(weatherRnd) {
				case 1:
					System.out.println("Temperatura: -2 grados C.\n"
									 + "Mar: fuerte oleaje cambiante, bandera roja\n"
									 + "Aire: fuertes rachas de viento, turbulencias y ventisca\n"
									 + "Tierra: El pavimento esta completamente congelado, recomendamos uso de cadenas.");
					break;
				case 2:
					System.out.println("Temperatura: 15 grados C.\n"
							 		 + "Mar: oleaje intermedio, bandera amarilla\n"
							 		 + "Aire: rachas de viento moderadas, lluvia escasa\n"
							 		 + "Tierra: El pavimento esta mojado, rogamos extremar precaución.");
					break;
				case 3:
					System.out.println("Temperatura: 25 grados C.\n"
							 		 + "Mar: completamente en calma, bandera verde\n"
							 		 + "Aire: viento escaso/nulo\n"
							 		 + "Tierra: el pavimento está seco");
					break;
				}
				System.out.println("-------------------------------------------------------------------------------------");
				break;

			// gestión de alquiler
			case 2:

				do {
					System.out.println(caseMen2);
					System.out.println("----------------------------------------------------------");
					do {
						System.out.println("¿Quiere consultar precios(1) o alquilar(2) algún vehículo?");
						System.out.println("Si quiere salir del menú de alquiler pulse 0.");
						System.out.println("----------------------------------------------------------");
						aux = keyB.nextLine();
						menuCaseAlq = Integer.parseInt(aux);
						if (menuCaseAlq != varZero && menuCaseAlq != varOne && menuCaseAlq != varTwo)
							System.out.println("Opción no válida, inténtelo de nuevo: ");
					} while (menuCaseAlq != varZero && menuCaseAlq != varOne && menuCaseAlq != varTwo);
					//excepciones para que introduzca (1 , 2 o 0) obligatoriamente
					
					// entrada alquiler, sólamente entra si pulsa 1(consulta) o 2(alquilar) si pulsa 0 ignora el bloque y sale.
					if (menuCaseAlq == varOne || menuCaseAlq == varTwo) {
						do {
							System.out.println("\nElija que tipo de vehículo necesita:\n" 
											 + "1.- Tierra.\n"
											 + "2.- Mar.\n" 
											 + "3.- Aire.\n" 
											 + "0.- Salir del menú");
							aux = keyB.nextLine();
							earthSeaAir = Integer.parseInt(aux);
							switch (earthSeaAir) {
							//-----------------------------------------------------------------------------------
							//case tierra
							//-----------------------------------------------------------------------------------
							case 1:
								do {
									System.out.println("--------------------------------------------------------");
									System.out.println("Vehículos de tierra:\n" 
													 + "1.- Motocicleta Enduro.\n"
													 + "2.- Turismo 5 puertas tracción total.\n"
													 + "3.- Remolque de carga +3500kg.\n");

									System.out.println("--------------------------------------------------------");
									//imprimo array de string que guarda dia - hora - semana
									System.out.println("El precio de éstos vehículos es: ");
									for (int i = 0; i < menuHeader.length; i++) {
										System.out.print(menuHeader[i] + "|\t");
									}
									System.out.println("");
									
									//imprimo primera fila del array de precios que corresponde con los precios de vehículos de tierra
									for (int j = 0; j < priceTable.length; j++) {
										System.out.print(priceTable[varZero][j] + "€ \t");
									}
									System.out.println("");
									System.out.println("--------------------------------------------------------");
									
									// aqui termina consulta, si habia pulsado alquiler se muestra también lo del if de justo debajo, con la gestion de alquiler
									if (menuCaseAlq == varTwo) {

										do {
											System.out.println("¿Cuál desearía alquilar?(0 para salir)");
											aux = keyB.nextLine();
											earthCase = Integer.parseInt(aux);
											switch (earthCase) {
											case 1:
												System.out.println("Le aconsejamos nuestra oferta de servicio de protecciones Enduro.");
												if(weatherRnd==varOne)
													System.out.println("Conduzca con precaución por el mal tiempo.");
												break;
											case 2:
												System.out.println("Perfecta elección, agarre total, mayor tracción, mayor disfrute de la conducción.");
												break;
											case 3:
												System.out.println("El tomador del remolque debe acreditar su permiso de circulación que le habilite.");
												break;
											case 0:
												System.out.println("Saliendo...");
												break;
											default:
												System.out.println("Opción no válida, inténtelo de nuevo: ");
											}
											//excepcion de este do-while es para que salga en el momento que elija el vehiculo o pulse salir.
										} while (earthCase != varZero && earthCase != varOne && earthCase != varTwo && earthCase != varThree);

										//aqui filtro que no pase por aqui si pulsa salir (0)
										if (earthCase == varOne || earthCase == varTwo || earthCase == varThree) {
											do {
												System.out.println("¿Por cuánto tiempo desea alquilar los servicios?(0 para salir)");
												for (int i = 0; i < menuHeader.length; i++) {
													System.out.println(counter + ". " + menuHeader[i] + "s.");
													counter++;
												}
												//aqui arriba he pintado el menu con un array de string al que le he añadido una 's' porque esta en singular guardado y quiero que se muestre en plural
												counter = varOne;
												aux = keyB.nextLine();
												earthCase = Integer.parseInt(aux);
												switch (earthCase) {

												//en cada case del switch calculo con un precio de la tabla por el numero de dias-semanas-horas que va a alquilar
												case 1:
													System.out.println("Alquiler por " + menuHeader[varZero] + "s.");
													System.out.println("¿Cuántas " + menuHeader[varZero] + "s desea alquilar?");
													aux = keyB.nextLine();
													userInputTime = Integer.parseInt(aux);
													totPrice = (double) priceTable[varZero][varZero] * userInputTime;
													System.out.printf("Sería un total de %.2f €.\n", totPrice);
													break;

												case 2:
													System.out.println("Alquiler por " + menuHeader[varOne] + "s.");
													System.out.println("¿Cuántas " + menuHeader[varOne] + "s desea alquilar?");
													aux = keyB.nextLine();
													userInputTime = Integer.parseInt(aux);
													totPrice = (double) priceTable[varZero][varOne] * userInputTime;
													System.out.printf("Sería un total de %.2f €.\n", totPrice);
													break;

												case 3:
													System.out.println("Alquiler por " + menuHeader[varTwo] + "s.");
													System.out.println("¿Cuántas " + menuHeader[varTwo] + "s desea alquilar?");
													aux = keyB.nextLine();
													userInputTime = Integer.parseInt(aux);
													totPrice = (double) priceTable[varZero][varTwo] * userInputTime;
													System.out.printf("Sería un total de %.2f €.\n", totPrice);
													break;

												case 0:
													System.out.println("Saliendo...");
													break;

												default:
													System.out.println("Opción no válida, inténtelo de nuevo: ");
												}
											} while (earthCase != varZero && earthCase != varOne && earthCase != varTwo && earthCase != varThree);
										}
										//este if comprueba si has alquilado ya algo y te pregunta para redireccionarte a alquilar otro vehiculo de este tipo o te saca del submenu
										if (earthCase == varOne || earthCase == varTwo || earthCase == varThree) {
											do {
												System.out.println("¿Desea alquilar mas servicios de este tipo?\n"
																 + "1.- Sí.\n" 
																 + "2.- No.\n");
												aux = keyB.nextLine();
												earthCase = Integer.parseInt(aux);
												switch (earthCase) {
												case 1:
													System.out.println("Redireccionando... ");
													break;
												case 2:
													System.out.println("Saliendo... ");
													earthCase = varZero;
													break;
												case 0:
													System.out.println("Opción no válida.");
													earthCase = varThree;
													break;
												default:
													System.out.println("Opción no válida, inténtelo de nuevo: ");
												}
											} while (earthCase != varZero && earthCase != varOne);
										}

									}
								} while (earthCase != varZero);

								break;
								
							//------------------------------------------------------------------------------------------	
							//case mar , este case es idem al de arriba pero con las variables de mar y con la excepcion de que aunque entres para alquilar, 
							//si la climatologia es adversa no te deja , solo podrias consultar (marcado con anotación en el codigo más abajo)
							//si por este motivo no te deja alquilar, manda un mensaje sobre el porque no podrias alquilar ese dia.
							//------------------------------------------------------------------------------------------
							case 2:
								do {
									System.out.println("--------------------------------------------------------");
									System.out.println("Vehículos marítimos:\n" 
													 + "1.- Velero de 15m de eslora.\n"
													 + "2.- Moto de agua 600cc.\n"
													 + "3.- Barco a vapor.\n");

									System.out.println("--------------------------------------------------------");
									System.out.println("El precio de éstos vehículos marítimos es: ");
									for (int i = 0; i < menuHeader.length; i++) {
										System.out.print(menuHeader[i] + "|\t");
									}
									System.out.println("");

									for (int j = 0; j < priceTable.length; j++) {
										System.out.print(priceTable[varOne][j] + "€ \t");
									}
									System.out.println("");
									System.out.println("--------------------------------------------------------");
									
									//aqui te deja entrar en el programa solamente en dia clima levemente adverso y clima apaciguado pero no en el extremo que seria (weatherRnd == varOne)
									if (weatherRnd==varTwo || weatherRnd == varThree) {
										if (menuCaseAlq == varTwo) {
	
											do {
												System.out.println("¿Cuál desearía alquilar?(0 para salir)");
												aux = keyB.nextLine();
												waterCase = Integer.parseInt(aux);
												switch (waterCase) {
												case 1:
													System.out.println("Perfecto para una travesía corta disfrutando la brisa marina.");
													break;
												case 2:
													System.out.println("Fantástica elección, un aparato hecho primordialmente para el disfrute.");
													break;
												case 3:
													System.out.println("Le aconsejamos nuestro servicio de carbón bituminoso para alimentar la caldera.");
													break;
												case 0:
													System.out.println("Saliendo...");
													break;
												default:
													System.out.println("Opción no válida, inténtelo de nuevo: ");
												}
											} while (waterCase != varZero && waterCase != varOne && waterCase != varTwo && waterCase != varThree);
	
											if (waterCase == varOne || waterCase == varTwo || waterCase == varThree) {
												do {
													System.out.println("¿Por cuánto tiempo desea alquilar los servicios?(0 para salir)");
													for (int i = 0; i < menuHeader.length; i++) {
														System.out.println(counter + ". " + menuHeader[i] + "s.");
														counter++;
													}
													counter = varOne;
													aux = keyB.nextLine();
													waterCase = Integer.parseInt(aux);
													switch (waterCase) {
													//aqui opera con la parte de la tabla de precios que corresponde a los vehiculos de agua
													case 1:
														System.out.println("Alquiler por " + menuHeader[varZero] + "s.");
														System.out.println("¿Cuántas " + menuHeader[varZero] + "s desea alquilar?");
														aux = keyB.nextLine();
														userInputTime = Integer.parseInt(aux);
														totPrice = (double) priceTable[varOne][varZero] * userInputTime;
														System.out.printf("Sería un total de %.2f €.\n", totPrice);
														break;
	
													case 2:
														System.out.println("Alquiler por " + menuHeader[varOne] + "s.");
														System.out.println("¿Cuántas " + menuHeader[varOne] + "s desea alquilar?");
														aux = keyB.nextLine();
														userInputTime = Integer.parseInt(aux);
														totPrice = (double) priceTable[varOne][varOne] * userInputTime;
														System.out.printf("Sería un total de %.2f €.\n", totPrice);
														break;
	
													case 3:
														System.out.println("Alquiler por " + menuHeader[varTwo] + "s.");
														System.out.println("¿Cuántas " + menuHeader[varTwo] + "s desea alquilar?");
														aux = keyB.nextLine();
														userInputTime = Integer.parseInt(aux);
														totPrice = (double) priceTable[varOne][varTwo] * userInputTime;
														System.out.printf("Sería un total de %.2f €.\n", totPrice);
														break;
	
													case 0:
														System.out.println("Saliendo...");
														break;
	
													default:
														System.out.println("Opción no válida, inténtelo de nuevo: ");
													}
												} while (waterCase != varZero && waterCase != varOne && waterCase != varTwo && waterCase != varThree);
											}
	
											if (waterCase == varOne || waterCase == varTwo || waterCase == varThree) {
												do {
													System.out.println("¿Desea alquilar mas servicios de este tipo?\n"
																	 + "1.- Sí.\n" 
																	 + "2.- No.\n");
													aux = keyB.nextLine();
													waterCase = Integer.parseInt(aux);
													switch (waterCase) {
													case 1:
														System.out.println("Redireccionando... ");
														break;
													case 2:
														System.out.println("Saliendo... ");
														waterCase = varZero;
														break;
													case 0:
														System.out.println("Opción no válida.");
														waterCase = varThree;
														break;
													default:
														System.out.println("Opción no válida, inténtelo de nuevo: ");
													}
												} while (waterCase != varZero && waterCase != varOne);
											}
	
										}
									}
									//aqui esta el mensaje que manda si no te deja alquilar por clima
									if(weatherRnd==varOne) {
										System.out.println("Lo sentimos nuestro servicio de alquiler de embarcaciones está cerrado por mal tiempo.");
										waterCase = varZero;
									}
								} while (waterCase != varZero);
								
								break;

							//------------------------------------------------------------------------------
							// case air , idem al de agua pero con sus propios precios de aire, que recuerdo son 10 veces mas costosas que las de tierra
							//------------------------------------------------------------------------------
							case 3:
								do {
									System.out.println("--------------------------------------------------------");
									System.out.println("Vehículos aéreos:\n" 
													 + "1.- Ultra ligero.\n"
													 + "2.- Helicóptero Tiger Español.\n"
													 + "3.- MV-22 Osprey VTOL.\n");

									System.out.println("--------------------------------------------------------");
									System.out.println("El precio de éstos vehículos aéreos es: ");
									for (int i = 0; i < menuHeader.length; i++) {
										System.out.print(menuHeader[i] + "|\t");
									}
									System.out.println("");

									for (int j = 0; j < priceTable.length; j++) {
										System.out.print(priceTable[varTwo][j] + "€ \t");
									}
									System.out.println("");
									System.out.println("--------------------------------------------------------");
									
									if (weatherRnd==varTwo || weatherRnd == varThree) {
									if (menuCaseAlq == varTwo) {

										do {
											System.out.println("¿Cuál desearía alquilar?(0 para salir)");
											aux = keyB.nextLine();
											airCase = Integer.parseInt(aux);
											switch (airCase) {
											case 1:
												System.out.println("Perfecto para los entusiastas de la aeronáutica.");
												break;
											case 2:
												System.out.println("Fantástica elección, un aparato hecho primordialmente para el ámbito militar(no incluye armamento ni blindaje.).");
												break;
											case 3:
												System.out.println("Con su VTOL(vertical take-off and landing) es capaz de despegar en casi cualquier sitio.");
												break;
											case 0:
												System.out.println("Saliendo...");
												break;
											default:
												System.out.println("Opción no válida, inténtelo de nuevo: ");
											}
										} while (airCase != varZero && airCase != varOne && airCase != varTwo && airCase != varThree);

										if (airCase == varOne || airCase == varTwo || airCase == varThree) {
											do {
												System.out.println("¿Por cuánto tiempo desea alquilar los servicios?(0 para salir)");
												for (int i = 0; i < menuHeader.length; i++) {
													System.out.println(counter + ". " + menuHeader[i] + "s.");
													counter++;
												}
												counter = varOne;
												aux = keyB.nextLine();
												airCase = Integer.parseInt(aux);
												switch (airCase) {

												case 1:
													System.out.println("Alquiler por " + menuHeader[varZero] + "s.");
													System.out.println("¿Cuántas " + menuHeader[varZero] + "s desea alquilar?");
													aux = keyB.nextLine();
													userInputTime = Integer.parseInt(aux);
													totPrice = (double) priceTable[varTwo][varZero] * userInputTime;
													System.out.printf("Sería un total de %.2f €.\n", totPrice);
													break;

												case 2:
													System.out.println("Alquiler por " + menuHeader[varOne] + "s.");
													System.out.println("¿Cuántas " + menuHeader[varOne] + "s desea alquilar?");
													aux = keyB.nextLine();
													userInputTime = Integer.parseInt(aux);
													totPrice = (double) priceTable[varTwo][varOne] * userInputTime;
													System.out.printf("Sería un total de %.2f €.\n", totPrice);
													break;

												case 3:
													System.out.println("Alquiler por " + menuHeader[varTwo] + "s.");
													System.out.println("¿Cuántas " + menuHeader[varTwo] + "s desea alquilar?");
													aux = keyB.nextLine();
													userInputTime = Integer.parseInt(aux);
													totPrice = (double) priceTable[varTwo][varTwo] * userInputTime;
													System.out.printf("Sería un total de %.2f €.\n", totPrice);
													break;

												case 0:
													System.out.println("Saliendo...");
													break;

												default:
													System.out.println("Opción no válida, inténtelo de nuevo: ");
												}
											} while (airCase != varZero && airCase != varOne && airCase != varTwo && airCase != varThree);
										}

										if (airCase == varOne || airCase == varTwo || airCase == varThree) {
											do {
												System.out.println("¿Desea alquilar mas servicios de este tipo?\n"
																 + "1.- Sí.\n" 
																 + "2.- No.\n");
												aux = keyB.nextLine();
												airCase = Integer.parseInt(aux);
												switch (airCase) {
												case 1:
													System.out.println("Redireccionando... ");
													break;
												case 2:
													System.out.println("Saliendo... ");
													airCase = varZero;
													break;
												case 0:
													System.out.println("Opción no válida.");
													airCase = varThree;
													break;
												default:
													System.out.println("Opción no válida, inténtelo de nuevo: ");
												}
											} while (airCase != varZero && airCase != varOne);
											}

										}
									}
								if(weatherRnd==varOne) {
									System.out.println("Lo sentimos nuestro servicio de alquiler de aeronaves está cerrado por mal tiempo.");
									airCase = varZero;
								}
								} while (airCase != varZero);
								break;

							case 0:
								System.out.println("Saliendo...");
								break;

							default:
								System.out.println("Opción no válida, inténtelo de nuevo: ");
							}
						} while (earthSeaAir != exitCase);
						// fin entrada alquiler

						// excepciones menu alquiler
					}
					if (menuCaseAlq != varZero && menuCaseAlq != varOne && menuCaseAlq != varTwo) {
						System.out.println("Opción no válida, inténtelo de nuevo: ");

					}
					if (menuCaseAlq == varZero) {
						System.out.println("Saliendo...");
					}
				} while (menuCaseAlq != exitCase);

				break;

			// opinión sobre el programa
			case 3:
				System.out.println(caseMen3);
				//aqui se guardan 3 contadores de valoraciones positivas en un array unidimensional (valueTable) en funcion del grado de satisfaccion
				do {
					System.out.println("Menu de valoraciones:\n"
									 + "1.- Dejar una valoracion positiva.\n"
									 + "2.- Dejar una valoracion negativa.\n"
									 + "3.- Consultar histórico de votos\n"
									 + "0.- Salir del menú.\n");
					aux = keyB.nextLine();
					valueMenu = Integer.parseInt(aux);
					switch(valueMenu) {
					case 1:
						do {
						System.out.println("Eliga entre 1 y 3 su grado de satisfacción,\n"
										 + "siendo 1 poco satisfecto, 2 satisfecho y 3 muy satisfecho.\n"
										 + "(0 para salir.)");
						aux = keyB.nextLine();
						valueSwitch = Integer.parseInt(aux);
						switch(valueSwitch) {
						
						case 0:
							System.out.println("Saliendo...");
							break;
							
						case 1:
							valueTable[varZero] += varOne;
							System.out.println("Gracias por la valoración.");
							valueSwitch = varZero;
							break;
							
						case 2:
							valueTable[varOne] += varOne;
							System.out.println("Gracias por la valoración.");
							valueSwitch = varZero;
							break;
							
						case 3:
							valueTable[varTwo] += varOne;
							System.out.println("Gracias por la valoración.");
							valueSwitch = varZero;
							break;
							
							default:
								System.out.println("Opción no válida, inténtelo de nuevo: ");
						}
						}while(valueSwitch != varZero);
						break;
						//contador este contador guarda en una variable normal entera el número de votos negativos
					case 2:
						System.out.println("Gracias por su valoración.\n"
										 + "Aquí tienes el teléfono de atención al cliente:\n"
										 + "932 82 34 12.");
						negativeCounter++;
						break;
					//aqui se pintan las opiniones de los dos tipos	
					case 3:
						for (int i = 0; i < valueString.length; i++) {
							System.out.print(" | " + valueString[i] + " | ");
						}
						System.out.println(" ");
						for (int i = 0; i < valueTable.length; i++) {
							System.out.print("   " + valueTable[i] + " \t\t\t");
						}
						System.out.println(" ");
						
						System.out.printf("\nTenemos %d valoraciones negativas.\n",negativeCounter);
						System.out.println("-------------------------------------------------------");
						
						break;
						
					case 0:
						System.out.println("Saliendo... ");
						break;
						
						default:
							System.out.println("Opción no válida, inténtelo de nuevo: ");
					}
					
				}while(valueMenu != exitCase);
				
				break;

			// sorteo
			// cada vez que se inicia el programa se genera un rnd entre 1 y 10 , si sale 7, te regalan un viaje ficticio a Navas
			case 4:
				if (rndUser==jackpot)
					System.out.println("¡¡¡Enhorabuena has ganado: UN VIAJE A LAS NAVAS!!!");
				else {
					System.out.println("¡Vaya parece que no hubo suerte!, otra vez será.");
				}
				break;

			// salida del programa
			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Vaya, parece que la opción introducida no es válida, inténtelo de nuevo:");

			}

		} while (menuCase != exitCase);

		System.out.println("Gracias por usar el programa :):");
		keyB.close();

	}

}