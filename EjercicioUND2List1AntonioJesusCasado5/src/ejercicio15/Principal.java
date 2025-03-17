package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroBase;
		
		System.out.println("Bienvenidos, vamos a realizar un programa para que nos realice una tabla de multiplicar");
		System.out.println("¿Podría indícarme el numero que quieres saber la tabla?");
		numeroBase=Leer.datoInt();
		
		System.out.println("Esta es la tabla de multiplicar del numero "+numeroBase);
		
		for(int i=1; i <=10; i++) {
			
			System.out.println(numeroBase+ " x "+i+" = "+(numeroBase*i));
			
		}

	}

}
