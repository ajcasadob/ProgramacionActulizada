package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int saldoBanco=1000,dineroRetirado,totalDinero;
		
		
		System.out.println("¿Cuánto dinero quiere retirar de la cuenta?");
		dineroRetirado=Leer.datoInt();
		
		if(saldoBanco<dineroRetirado) {
			
			System.out.println("No tienes suficiente dinero");
			
		}else {
			totalDinero=saldoBanco-dineroRetirado;
			System.out.println("Su saldo actual es de "+totalDinero+ "€");
		}
		

	}

}
