package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int numero;
		String frase;
		Copiado cp1=new Copiado ();
		
		System.out.println("Bienvenidos, vamos a repetir la frase que me digas las veces que tu quieras");
		System.out.println("Escribe aquí la frase que quieras repetir");
		frase=Leer.dato();
		System.out.println("¿Cuántas veces quieres repetirla?");
		numero=Leer.datoInt();
		
		cp1.realizarCopiado(frase, numero);
		
		
		
		
		
		

	}

}
