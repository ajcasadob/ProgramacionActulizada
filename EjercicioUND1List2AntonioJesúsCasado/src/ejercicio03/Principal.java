package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double millaMarina=1852;
		double milla;
		double totalMetros;
		System.out.println("Bienvenidos, vamos a calcular millas marinas a metros");
		System.out.println("¿Cuántas millas marinas quieres medir en metros?");
		milla=Leer.datoDouble();
		totalMetros=millaMarina*milla;
		System.out.printf(" %.2f millas marinas son %.2f metros",milla,totalMetros);
		
	}

}
