package ejemplowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		int tope;
		
		
		System.out.println("¿Cuántas veces quieres que imprima?");
		tope=Leer.datoInt();
		
		
		while(contador<tope) {
			contador++;
			System.out.println("Soy la caña");
			
		}
		System.out.println("byebye");
		

	}

}
