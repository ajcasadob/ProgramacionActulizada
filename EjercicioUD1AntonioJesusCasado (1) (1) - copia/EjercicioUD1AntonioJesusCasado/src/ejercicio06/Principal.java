package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double precioProducto= 50;
    double descuentoProducto=20;
    double porcentaje=100;
    double precioDelDescuento;
    double precioFinal;
    precioDelDescuento= precioProducto*descuentoProducto/porcentaje;
    precioFinal= precioProducto-precioDelDescuento;
    System.out.println("Bienvenidos internautas, aqui os muestro un descuento molon");
    System.out.printf("El precio del producto es de %.2f euros y"
    		+ " le vamos aplicar un descuento del %.2f por ciento, por lo que el descuento "
    		+ "es de %.2f euros y se nos queda en %.2f euros ",precioProducto,descuentoProducto,precioDelDescuento,precioFinal);
	}

}
