package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int numero;
		
		Operaciones op1=new Operaciones();
		
		System.out.println("Diga un número");
		numero=Leer.datoInt();
		
		System.out.println("El número que has introducido es "+op1.comprobadorPositivoNegativo(numero)+ 
				" y " +op1.comprobadorParImpar(numero));
		
		
	}

}
