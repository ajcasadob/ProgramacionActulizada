package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio;
		double longitudCircu;
		double radiocircu;
		double areaCircu;
		System.out.println("Introduce el radio de la circunferencia");
		radio=Leer.datoDouble();
		System.out.println("Introduce el radio del círculo");
		radiocircu=Leer.datoDouble();
		areaCircu=Math.PI*Math.pow(radiocircu, 2);
		longitudCircu= Math.PI*2*radio;
		
		System.out.printf("La longitud de una circunferencia es de %.2f metros ",longitudCircu);
		System.out.printf("\nEste es el calculo del area de un circulo %.2f metros ",areaCircu);
		
			

	}

}
