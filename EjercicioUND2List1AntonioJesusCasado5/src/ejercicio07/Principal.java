package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioProducto;
		int cantidad;
		double totalPrecio;
		double descuento;
		double porcentaje=100;
		double precioConDescuento;
		int totalCompra=100;
		double restaDescuentoTotal;
		
		System.out.println("Bienvenido, vamos a calcular si puedes optar a este descuento o no has gastado lo suficiente");
		System.out.println("¿Me podrías indicar el precio del producto?");
		precioProducto=Leer.datoDouble();
		System.out.println("¿Cuánta cantidad te quieres llevar?");
		cantidad=Leer.datoInt();
		System.out.println("¿Qué porcentaje de descuento se le aplica?");
		descuento=Leer.datoDouble();
		totalPrecio=precioProducto*cantidad;
		precioConDescuento=totalPrecio*descuento/porcentaje;
		restaDescuentoTotal=totalPrecio-precioConDescuento;
		
		if(totalPrecio>=totalCompra) {
			
			System.out.printf("El descuento de tu compra es de %.2f € y "
					+ "el total con el descuento aplicado es de %.2f€",precioConDescuento,restaDescuentoTotal);
			
		}
		else{
			System.out.println("No se puede aplicar descuento");
			
		}
		
		

	}

}