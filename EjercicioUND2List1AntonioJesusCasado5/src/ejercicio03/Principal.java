package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero;
		int numeroUno=2;
		
		System.out.println("Bienvenidos, vamos a crear un programa para mostrar si el numero es par o impar");
		System.out.println("Me podrías indicar un numero por favor");
		numero=Leer.datoDouble();
		
		if(numero%numeroUno==0) {
			System.out.printf("El numero %.2f es par",numero);
			
		}
		else {
			System.out.printf("El numero %.2f es impar",numero);
		}

	}

}
