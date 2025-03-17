package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double precioProducto,precioTotal,descuentoAAplicar,calculoConDescuento,precioFinal;
		int cantidad,total=100,porcentaje=100;
		
		System.out.println("Por favor, indiqueme el precio del producto");
		precioProducto=Leer.datoDouble();
		System.out.println("¿Cuánta cantidad desea usted?");
		cantidad=Leer.datoInt();
		System.out.println("¿Qué descuento se le aplica?");
		descuentoAAplicar=Leer.datoDouble();
		precioTotal=precioProducto*cantidad;
		
		if(precioTotal>total) {
			
			System.out.println("Enhorabuena, usted tiene un descuento");
			calculoConDescuento=precioTotal*descuentoAAplicar/porcentaje;
			precioFinal=precioTotal-calculoConDescuento;
			System.out.println("Su compra es de "+precioFinal+ "euros");
			
		}else {
			System.out.println("Lo siento, no es suficiente para aplicarle el descuento");
			System.out.println("Su cuenta  es de "+precioTotal+"€");
		}
		
		
		
		
		
		

	}

}
