package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double notaUno,notaDos,notaTres,resultadoMedia;
		int division=3,suspensos=0;
		
		System.out.println("Indique la primera nota");
		notaUno=Leer.datoDouble();
		System.out.println("Indique la segunda nota");
		notaDos=Leer.datoDouble();
		System.out.println("Indique la tercera nota");
		notaTres=Leer.datoDouble();
		
		resultadoMedia=(notaUno+notaDos+notaTres)/division;
		
		if(resultadoMedia>=5) {
			System.out.println("Enhorabuena, estas aprobado");
		}else {
			System.out.println("Lo siento, intentalo la proxima vez");
		}if(notaUno<5) {
			suspensos++;
			
		}if(notaDos<5) {
			suspensos++;
			;
		}if(notaTres<5) {
			suspensos++;
			System.out.println("Tienes "+suspensos+" suspensos");
		}
		
		

	}

}
