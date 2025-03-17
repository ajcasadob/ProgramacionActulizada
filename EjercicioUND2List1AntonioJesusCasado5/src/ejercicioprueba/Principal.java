package ejercicioprueba;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		int mayoria = 18;
		double saldo;
		double topeSaldo = 100;

		System.out.println("¿Cuál es tu edad?");
		edad = Leer.datoInt();
		System.out.println("¿Cuál es tu pasta?");
		saldo = Leer.datoDouble();

		if (edad >= mayoria || saldo >= topeSaldo) {
			System.out.println("Adelante");
		} else {
			System.out.println("No puedes pasar");
		}
		System.out.println("Adiós");

	}

}
