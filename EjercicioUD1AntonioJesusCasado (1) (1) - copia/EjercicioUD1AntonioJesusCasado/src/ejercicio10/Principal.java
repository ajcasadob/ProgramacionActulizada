package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreCliente;
		String nombreProducto;
		int unidadesCant;
		double precioProducto=12.99;
		double DescuentoProducto=3;
		double porcentaje=100;
		double precioDescuento;
		double precioFinal;
		double precioSin;
		
		System.out.println("Bienvenido al mejor bazar de tu barrio.");
		System.out.println("Dígame su nombre");
		nombreCliente= Leer.dato();
		System.out.println("¿Qué producto desea?");
        nombreProducto=Leer.dato();
        System.out.println("¿Cuántas unidades desea?");
        unidadesCant=Leer.datoInt();
        precioDescuento= (double)precioProducto*unidadesCant*DescuentoProducto/porcentaje;
        precioFinal= unidadesCant*precioProducto-precioDescuento;
        precioSin= unidadesCant*precioProducto;
        System.out.printf("El precio de %s es de %.2f euros. Por %d unidades el precio es de "
        		+ "%.2f euros pero tiene un descuento del %.0f por lo que se le queda en %.2f.  ",nombreProducto,precioProducto,
        		unidadesCant,precioSin,DescuentoProducto,precioFinal);
        
	}

}
