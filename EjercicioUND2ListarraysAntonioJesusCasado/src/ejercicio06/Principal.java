package ejercicio06;

import utilidades.Leer;


import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		Random r = new Random(System.nanoTime());
		double desde, hasta;
		double cien=100.0;

		System.out.println("Bienvenido,cuantos datos quieres mostrar");
		tam = Leer.datoInt();

		String nombres[] = new String[tam];

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("¿Que nombres quieres introducir?");
			nombres[i] = Leer.dato();

		}
		

		System.out.println("¿Desde que numero quieres empezar?");
		desde = Leer.datoDouble();
		System.out.println("¿Hasta que numero quieres llegar?");
		hasta = Leer.datoDouble();
		double valor[] = new double[tam];

		for (int i = 0; i < valor.length; i++) {

			valor[i] = r.nextDouble(hasta - desde + 1) + desde;

		}
		for (int i = 0; i < nombres.length; i++) {

			System.out.print("   "+nombres[i] + "\t\t");

		}
		System.out.println();
		for (int i = 0; i < valor.length; i++) {
			System.out.print("   "+Math.round(valor[i]*cien)/cien+"\t\t\t");
		}
	}

}
