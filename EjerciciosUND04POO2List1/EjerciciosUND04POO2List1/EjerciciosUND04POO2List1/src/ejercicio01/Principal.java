package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double porcentajeGanancia;
		Ordenador o=new Ordenador(100.0,4.50,500.0,"Asus");
		Sobremesa s=new Sobremesa(150.0,5.60,700.0,"HP",40.5);
		Portatil p=new Portatil(170.0,6.70,800.0,"Gigabyte",true,5.8);
		
		System.out.println("Bienvenidos, vamos a realizar un calculeo facil");
		
		System.out.println("¿Qué porcentaje de ganancia quieres aplicar?");
		porcentajeGanancia=Leer.datoDouble();
		
		
		System.out.println(o.calcularPrecioVenta(porcentajeGanancia));
		System.out.println(s.calcularPrecioVenta(porcentajeGanancia));
		System.out.println(p.calcularPrecioVenta(porcentajeGanancia));
		
	}

}
