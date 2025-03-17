package pormicuenta;

import utilidades.Leer;

public class ejercicio01 {

	public static void main(String[] args) {
		float valorHorNor = 0f;
		float valorHorExtr = 0f;
		float horasNor = 0f;
		float horasExtr = 0f;
		float compSueldBas = 0f;
		float compSueldExtr = 0f;
		float sueldTot = 0f;
		
		System.out.println("Buenas trabajador, este programa le ayudará a calcular su sueldo.");
		System.out.println("Porfavor separe los decimales con un punto.");
		System.out.println("\n----------------------------------------------------------------------------------------------");
		System.out.println("Para empezar introduzca aquí las horas que ha trabajado excluyendo las horas extra: ");
		horasNor = Leer.datoFloat();
		
		System.out.println("Introduzca por favor el valor de una hora de trabajo normal para usted: ");
		valorHorNor = Leer.datoFloat();
		
		System.out.println("Introduzca las horas extra que ha trabajado(si no ha trabajado ninguna deje el valor como 0): ");
		horasExtr = Leer.datoFloat();
		
		System.out.println("Introduzca aqui el valor al que cobra una hora extra: ");
		valorHorExtr = Leer.datoFloat();
		
		compSueldBas = horasNor * valorHorNor;
		compSueldExtr = horasExtr * valorHorExtr;
		sueldTot = compSueldBas + compSueldExtr;
		
		System.out.println("\n----------------------------------------------------------------------------------------------");
		   System.out.printf("                           Su sueldo será de %.2f euros.\n",sueldTot);
		System.out.println("\n                          Gracias por usar este programa :):");

	}

}
