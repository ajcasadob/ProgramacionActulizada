package ejercicio05;

import utilidades.Leer;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, hasta, desde,numSuma=0;
		int mayor, menor,aCambiar,nuevoNumero;
		
		
		Random r = new Random(System.nanoTime());

		System.out.println("Bienvenidos, vamos a relizar un programa");
		System.out.println("¿Qué cantidad de elementos quieres que contenga?");
		tam = Leer.datoInt();
		int valor[] = new int[tam];
		System.out.println("¿Desde que numero quieres empezar?");
		desde = Leer.datoInt();
		System.out.println("¿Hasta que numero quieres llegar?");
		hasta = Leer.datoInt();

		
	
		
		for (int i = 0; i < valor.length; i++) {

			valor[i] = r.nextInt(hasta - desde + 1) + desde;

		}
		
		mayor=valor[0];
		menor=valor[0];
		for (int i = 0; i < valor.length; i++) {

			System.out.println(valor[i]);
			numSuma+=valor[i];
			
		}
		
		  
		for(int i=0; i<valor.length;i++) {
			
			if(valor[i]>mayor) {
				mayor=valor[i];
			}
		}
		
	   for(int i=0;i<valor.length;i++) {
		   if(valor[i]<menor) {
				
				menor=valor[i];
				
			}
	   }
	  
		   System.out.println("¿Que elementos quieres cambiar?");
			  aCambiar=Leer.datoInt();
			  System.out.println("¿Qué numero quieres introducir?");
			  nuevoNumero=Leer.datoInt();
	   
			  valor[aCambiar-1]=nuevoNumero;
	   
			  for(int i=0;i<valor.length;i++) {
				  
				  System.out.println(valor[i]);
			  }
		
			System.out.println("El numero mayor es "+mayor);
			System.out.println("El numero menor es "+menor);
			System.out.println("La suma total es "+numSuma);

		

	}

}
