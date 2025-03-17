package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numeroUno;
		double numeroDos;
		double resultadoDivision;
		int numeroCero=0;
		
		System.out.println("Bienvenidos, vamos a probar el programa que hemos diseñado para esta división");
		System.out.println("Indíqueme el primero numero");
		numeroUno=Leer.datoDouble();
		System.out.println("Indíqueme el segundo numero");
		numeroDos=Leer.datoDouble();
		resultadoDivision=numeroUno/numeroDos;
		
		if(numeroDos<=numeroCero) {
			System.out.println("No se puede realizar");
			
		}
		else {
			System.out.printf("El resultado de la división es %.2f",resultadoDivision);
		}

	}

}
