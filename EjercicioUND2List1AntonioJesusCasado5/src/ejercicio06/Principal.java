package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double notaUno;
		double notaDos;
		double notaTres;
		int divisor=3;
		double notaMedia;
		int notaMinimo=5;
		int numeroSuspenso=0;
		
		System.out.println("Bienvenidos, vamos a relizar un programa para calcular la media de las notas");
		System.out.println("Indícame cuánto has sacado en el examen de programación aqui:");
		notaUno=Leer.datoDouble();
		System.out.println("Indícame cuánto has sacado en el examen de sistemas operativos aqui:");
		notaDos=Leer.datoDouble();
		System.out.println("Indícame cuánto has sacado en el examen de base de datos aqui:");
		notaTres=Leer.datoDouble();
		notaMedia=(notaUno+notaDos+notaTres)/divisor;
		
		if(notaMedia>=notaMinimo) {
			System.out.printf("Enhorabuena tu media es un %.2f",notaMedia);
			
		}
		else {
			System.out.println("Sigue intetandolo");
			System.out.printf("Lo siento tu media es de %.2f",notaMedia);
		}
		if(notaUno<notaMedia) {
			numeroSuspenso++; //NumeroSuspenso= numeroSuspenso+1	
		}
		if(notaDos<notaMedia) {
			numeroSuspenso++;	
		}
		if(notaTres<notaMedia) {
			numeroSuspenso++;
		}
		System.out.println("\nTiene usted un total de "+numeroSuspenso+" suspenso");
			
	}
	}
