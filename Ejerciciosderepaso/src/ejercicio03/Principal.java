package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numUno,numeroDos=2;

		System.out.println("Introduce un numero para saber si es par o impar");
		numUno=Leer.datoInt();
		
		if(numUno%numeroDos==0) {
			
			System.out.println("Este numero es par");
			
		}else {
			System.out.println("Este numero es impar");
		}
		
		
		
	}

}
