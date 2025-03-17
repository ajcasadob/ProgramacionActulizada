package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double edad;
		double unAño=365;
		double totalDias;
		
		System.out.println("Bienvenidos, la edad de una persona en días");
		System.out.println("¿Cuántos años tienes?");
		edad=Leer.datoDouble();
		totalDias=edad*unAño;
		System.out.printf("Pues con %.0f años tendrías %.2f dias vividos",edad,totalDias);
		
	}

}
