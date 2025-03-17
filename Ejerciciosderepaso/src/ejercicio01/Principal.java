package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numUno,numDos;

		System.out.println("Introduzca el primer numero entero por teclado");
		numUno=Leer.datoInt();
		System.out.println("Introduzca el segundo numero");
		numDos=Leer.datoInt();
		
		if(numUno>=numDos) {
			
			System.out.println("Este es el numero mayor "+numUno);
			
			if(numUno==numDos) {
				System.out.println("Ambos numero son iguales");
				
			}
		}else {
			System.out.println("Este es el numero mayor "+numDos);
			
			
		}
		
		
	}

}
