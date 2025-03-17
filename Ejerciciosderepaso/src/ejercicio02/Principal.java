package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numUno,numDos,resultado;
		
		System.out.println("Introduzca un numero con decimal");
		numUno=Leer.datoDouble();
		System.out.println("Introduzca el segundo numero con decimal");
		numDos=Leer.datoDouble();
		
		if(numDos==0) {
			System.out.println("No se puede dividir");
		}else {
			
			resultado=numUno/numDos;
			System.out.printf("El resultado de la division es %.2f",resultado);
		}
	}

}
