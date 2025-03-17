package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		
		int numSuma = 0,numeroCero = 0;
		double resultado,numDivision=8;

		System.out.println("Bienvenidos, vamos a realizar un programa de arrays");

		int valor[] = new int[8];

		for (int i = 0; i < valor.length; i++) {

			System.out.println("Indíca aqui los valores a rellenar " + (i+1));
			valor[i] = Leer.datoInt();
			
			if (valor[i] == 0)
				numeroCero++;
		
		}
		for (int i = 0; i < valor.length; i++) {

			numSuma += valor[i];

		}
		resultado = numSuma /numDivision;
		
		for (int i = 0; i < valor.length; i++) {

			System.out.print(valor[i] + ", ");

		}
		System.out.println("\nEl resultado de la suma y division es:" + resultado);
		
		System.out.println("La cantidad de numero de cero es: "+numeroCero);

	}

}
