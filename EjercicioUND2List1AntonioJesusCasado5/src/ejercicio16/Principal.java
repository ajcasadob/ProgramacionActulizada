package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma=0;
		int multiplicacion=1;
		int numero;
		
		System.out.println("Bienvenidos, vamos a leer una secuencia de 10 numeros y mostraremos su resultado en suma y producto");
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Ingresa el numero " +i+ " : ");
			numero=Leer.datoInt();
			suma+=numero;
			multiplicacion*=numero;
			
		}
		System.out.println("La suma de los 10 numero es:"+suma);
		System.out.println("La multiplicación de los 10 numeros es "+multiplicacion);

	}

}
