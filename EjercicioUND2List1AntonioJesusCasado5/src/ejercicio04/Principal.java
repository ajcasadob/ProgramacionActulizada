package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double saldoCuenta=600;
		double dinero;
		double dineroTotal;
		
		
		System.out.println("Bienvenida, vamos a crear un programa que te calcule el saldo de tu cuenta");
		System.out.println("¿Cuánto dinero desea usted sacar?");
		dinero=Leer.datoDouble();
		dineroTotal=saldoCuenta-dinero;
		
		
		if(saldoCuenta>=dinero) {
			System.out.printf("El saldo actual de tu cuenta es de %.2f €, con el dinero que has solicitado sacar",dineroTotal);
			
		}
		else {
			System.out.println("Lo siento no tienes dinero suficiente");
		}
		System.out.println("Gracias por usar el programa, saludos");

	}

}
