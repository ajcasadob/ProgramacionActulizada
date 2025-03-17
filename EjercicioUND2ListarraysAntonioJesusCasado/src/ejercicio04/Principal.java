package ejercicio04;

import utilidades.Leer;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int valor[] = new int[10];
		int numSuma=0,resultado,posicion,desde,hasta;
		
		System.out.println("¿Desde que numero quieres comenzar?");
		desde=Leer.datoInt();
		System.out.println("¿Hasta que numero quieres?");
		hasta=Leer.datoInt();

		for (int i = 0; i < valor.length; i++) {

			valor[i] = r.nextInt(hasta - desde) + desde;

		}
		for (int i = 0; i < valor.length; i++) {

			System.out.print(valor[i]+ ",");

		}
		for (int i = 0; i < valor.length; i++) {

			numSuma+=valor[i];

		}
		resultado=numSuma/valor.length;
		System.out.println("\nLa media de todos los numeros es: "+resultado);
		System.out.println("¿Qué posición quieres saber, introduce del 1 al 10?");
		posicion=Leer.datoInt();
		
		if(posicion>=0 && posicion<=valor.length) {
			System.out.println("Su numero es "+valor[posicion-1]);
		}else {
			System.out.println("Posición incorrecta. Debes elegir entre el 1 y 10");
		}
		
		
	}

}
