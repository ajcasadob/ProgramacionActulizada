package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String productoUno;
		int unidadUno, unidadDos, unidadTres;
		String productoDos;
		String productoTres;
		String nombre;
		String date;
		double dineroCliente;
		double precioUno= 2.5;
		double precioDos=1.5;
		double precioTres=6.5;
		double cuentaFinal;
		double vueltaDinero;
		double totalProductoUno,totalProductoDos,totalProductoTres;

		System.out.println("Bienvenidos, vamos a elaborar un ticket");
		
		
		System.out.println("¿Qué producto desea?");
		productoUno=Leer.dato();
		System.out.println("¿Cuantas unidades desea?");
		unidadUno=Leer.datoInt();
		System.out.println("¿Quiere alguna bebida?");
		productoDos=Leer.dato();
		System.out.println("¿Cuantas unidades?");
		unidadDos=Leer.datoInt();
		System.out.println("¿Qué menu desea?");
		productoTres=Leer.dato();
		System.out.println("¿Cuántas unidades desea?");
		unidadTres=Leer.datoInt();
		System.out.println("¿Quien le atendio?");
		nombre=Leer.dato();
		System.out.println("¿Qué fecha es hoy?");
		date=Leer.dato();
		System.out.println("¿Cuanto dinero entrega?");
		dineroCliente=Leer.datoDouble();
		cuentaFinal=(double)unidadUno*precioUno+(double)unidadDos*precioDos+(double)unidadTres*precioTres;
		vueltaDinero=dineroCliente-cuentaFinal;
		totalProductoUno=(double)unidadUno*precioUno;
		totalProductoDos=(double)unidadDos*precioDos;
		totalProductoTres=(double)unidadTres*precioTres;
		
		System.out.printf("*****************************************BURGUER KING************************************************************");
		System.out.printf("\n\t\tProducto\t\t Unidades \t\t Total");
		System.out.printf("\n\t\t %s \t\t %d unds \t\t %.2f €",productoUno,unidadUno,totalProductoUno);
		System.out.printf("\n\t\t %s \t\t %d unds \t\t %.2f €",productoDos,unidadDos,totalProductoDos);
		System.out.printf("\n\t\t %s \t\t %d unds \t\t %.2f €",productoTres,unidadTres,totalProductoTres);
		System.out.printf("\n\t\t\t\t\t\t\t\t\t\t Total a pagar %.2f €",cuentaFinal);
		System.out.printf("\n\t\t\t\t\t\t\t\t\t\t Total a devolver %.2f €",vueltaDinero);
		System.out.printf("\nGracias por su visita, le atendio %s, a fecha de %s ",nombre,date);
		
		
		
		
		

	}

}
