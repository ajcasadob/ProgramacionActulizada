package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreAsig;
		String aulaRealiza;
		String fecha;
		cabecera a1;
		
		
		System.out.println("Diga el nombre de la asignatura");
		nombreAsig=Leer.dato();
		System.out.println("Diga el aula donde se realiza");
		aulaRealiza=Leer.dato();
		System.out.println("Digame la fecha");
		fecha=Leer.dato();
		
		a1=new cabecera(nombreAsig, aulaRealiza, fecha);
		
		System.out.println(a1);
	}

}
