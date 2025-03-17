package ejemplo02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double suma,n2;
		int n1;
		
		//Intanciamos el objeto
		Numero n=new Numero();
		
		
		//Llamar a métodos,con parámetros directamente escritos
		suma=n.Sumar(4, 2.5);
		
		
		System.out.println("La suma es "+suma);
		
		System.out.println("¿cuál es el primer número que quieres sumar, int?");
		n1=Leer.datoInt();
		System.out.println("¿Cuál es el segundo número, double?");
		n2=Leer.datoDouble();
		
		suma=n.Sumar(n1, n2);
		
		System.out.println("La suma total es de "+suma);
		
		

	}

}
