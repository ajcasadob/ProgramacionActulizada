package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double notas = 0;
		double sumaNotas = 0;
		double notaMedia = 0;
		int contadorSuspenso = 0;
		int numerodeNotas = 1;
		double media = 6;

		for (int i = 0; i < media; i++) {

			System.out.println("Digame la nota " + (i + numerodeNotas));
			notas= Leer.datoDouble();

			sumaNotas += notas;

			if (notas < 5) {

				contadorSuspenso++;

			}

			notaMedia = sumaNotas / media;
		}
		System.out.println("La nota media es " + notaMedia);
		System.out.println("El numero total de suspenso es:" + contadorSuspenso);

	}

}
