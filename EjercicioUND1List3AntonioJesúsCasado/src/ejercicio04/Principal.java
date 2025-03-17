package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radioCircu;
		double radioCirculo;
		double formula;
		double formulaDos;
		System.out.println("Bienvenidos, vamos a calcular la longitud de una circunferencia y el area de un circulo");
		
		System.out.println("Por favor, si es usted tan amable indíque el radio de dicha circunferencia aqui:");
		radioCircu=Leer.datoDouble();
		formula=Math.PI*2*radioCircu;
		System.out.println("Indíqueme por aqui el radio del circulo");
		radioCirculo=Leer.datoDouble();
		formulaDos=Math.PI*Math.pow(radioCirculo, 2);
		System.out.printf("La longitud de unacircunferencia es de %.2f metros y el area del circulo es %.2f metros",formula,formulaDos);
		
	}

}
