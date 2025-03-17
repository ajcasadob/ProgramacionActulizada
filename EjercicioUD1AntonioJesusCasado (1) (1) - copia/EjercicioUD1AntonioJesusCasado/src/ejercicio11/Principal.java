package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double caudal;
		double horas;
		double conversionS=3600;
		double conversionL=0.001;
		double metrosC;
		
		System.out.println("Bienvenido, con este programa podrás calcular "
				+ "los metros cúbicos que puedes sacar de un pozo");
		System.out.println("¿Me podría indicar cuál es el caudal del pozo?");
		caudal=Leer.datoDouble();
		System.out.println("¿Cuántas horas se llevará conectado?");
		horas=Leer.datoDouble();
		metrosC=caudal*conversionL*conversionS*horas;
		System.out.printf("Su pozo tiene un caudal de %.2f litros/s y sacara en %.2f "
				+ "horas %.2f metros cúbicos",caudal,horas,metrosC);
		
		

	}

}
