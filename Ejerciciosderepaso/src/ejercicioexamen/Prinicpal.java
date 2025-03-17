package ejercicioexamen;

import java.util.Random;

import utilidades.Leer;

public class Prinicpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, valor[], tam = 8, hasta, desde, sumaVotos = 0, menor = 1000, contador = 0, totalAndaluces = 2500000, media=0,
				aCambiar, nuevoValor,mayor,indiceProvincia=0;
		Random aleatorios = new Random(System.nanoTime());
		double porcentaje = 100, resultado;
		System.out.println(
				"Bienvenidos, vamos a realizar un programa que haga el recuento de votos de nuestro partido PRINT");

		System.out.println("Elija la opcion deseada:");
		String provincias[] = { "Almería", "Cordóba", "Sevilla", "Granada", "Jáen", "Huelva", "Cádiz", "Málaga" };
		valor = new int[tam];
		do {
			System.out.println("\n");
			System.out.println("""
					0. Salir
					1. Generar provincias con votos
					2. Mostrar total de votos en todas las provincias
					3. Mostrar número de provincias con menos de 1000 votos
					4. Porcentaje de votos en Andalucía
					5. Introducir votos por teclado a una provincia
					6. Mostrar media de votos entre todas las provincias
					7. Provincias con más votos conseguidos
					""");
			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:

				System.out.println("¿Desde qué número quieres empezar?");
				desde = Leer.datoInt();
				System.out.println("¿Hasta que numero quieres llegar?");
				hasta = Leer.datoInt();

				for (int i = 0; i < valor.length; i++) {

					valor[i] = aleatorios.nextInt(hasta - desde + 1) + desde;

				}

				for (int i = 0; i < provincias.length; i++) {

					System.out.print(provincias[i] + "\t\t");

				}
				System.out.println("\n");
				for (int i = 0; i < valor.length; i++) {

					System.out.print(valor[i] + "\t\t");
				}

				break;

			case 2:
				sumaVotos = 0;
				for (int i = 0; i < valor.length; i++) {

					sumaVotos += valor[i];

				}
				System.out.println("La suma total de votos entre todas las provincias es de " + sumaVotos + " votos");

				break;

			case 3:
				contador = 0;
				for (int i = 0; i < valor.length; i++) {

					if (valor[i] < menor) {

						valor[i] = menor;
						contador++;
					}

				}

				System.out.println("El número de provincias con menos de 1000 votos es de " + contador);
				break;

			case 4:

				resultado = sumaVotos * porcentaje / (double) totalAndaluces;

				System.out.printf("El porcentaje de participación de votos es de %.2f %% ", resultado);

				break;

			case 5:

				System.out.println("¿Qué provincia quieres añadir votos? Elije del 1 al 8.");
				aCambiar = Leer.datoInt();
				System.out.println("¿Cuánta cantidad de votos quieres añadir?");
				nuevoValor = Leer.datoInt();

				valor[aCambiar - 1] += nuevoValor;

				for (int i = 0; i < provincias.length; i++) {

					System.out.print(provincias[i] + "\t\t");

				}
				System.out.println("\n");
				for (int i = 0; i < valor.length; i++) {

					System.out.print(valor[i] + "\t\t");
				}
				
				break;
				
			case 6:
				sumaVotos=0;
				for(int i=0;i<valor.length;i++) {
					
					sumaVotos+=valor[i];
					
					
					
				}
				media=sumaVotos/valor.length;
				System.out.println("La media de votos de Andalucía es de "+media);
				break;
				
			case 7:
				mayor=valor[0];
				for(int i=0;i<valor.length;i++) {
					
					if(mayor<valor[i]) {
						
						mayor=valor[i];
						indiceProvincia=i;
					}
					
				}
				System.out.println("La provincia con mas votos es "+provincias[indiceProvincia]+ " con un total de  "+mayor+" votos");
				break;
				default:
					System.out.println("Introduzca una opción valida");
					break;
			}

		} while (opcion != 0);

	}

}
