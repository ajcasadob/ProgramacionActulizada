package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor;
		double doble;
		double triple=3;
		double tripleV;
		double mitad=2;
		double mitadV;
		System.out.println("Bienvenidos, vamos a un programa que lea un valor entero "
				+ "por teclado y muestre por pantalla su doble, su triple y"
				+ "su mitad");
		System.out.println("Ingresame el valor aquí:");
		valor=Leer.datoDouble();
		doble=valor*mitad;
		System.out.printf("\nSu doble es %.0f",doble);
		tripleV=valor*triple;
		System.out.printf("\nSu triple es %.0f",tripleV);
		mitadV=valor/mitad;
		System.out.printf("\nSu mitad es %.1f",mitadV);
	}

}
