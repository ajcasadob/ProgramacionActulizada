package ejercicio02;

import utilidades.Leer;

public class Principal {

	 public static void main(String[] args) {
	     
	      
		 	int opcion;
	        double dineroRecibido, precioTotal;
	        Producto p = new Espadalaser(100, 5, "Espada láser", "doble", true);
	        Producto p1= new Moviles(200, 10, "Móvil", "Samsung");
	        Producto p2= new Espadalaser(150, 3, "Espada láser", "simple", false);
	        
	       
	        Producto [] productos={p,p1,p2};
	        Ventas ventas = new Ventas(productos);
	        System.out.println("Cantidad total de productos: " + ventas.getCantidadTotalProductos());
	        System.out.println("Cantidad total recaudada: " + ventas.calcularCantidadTotal());
	        System.out.println("Cambio a devolver: " + ventas.devolverCambio(100, 150));
	        
	        ventas.mostrarListadoProductosConAviso();

	   
	    
	    do {
	        System.out.println("Menú de opciones:");
	        System.out.println("1. Mostrar cantidad total de productos");
	        System.out.println("2. Mostrar cantidad total recaudada");
	        System.out.println("3. Devolver cambio");
	        System.out.println("4. Mostrar listado de productos con aviso");
	        System.out.println("5. Salir");
	        System.out.print("Seleccione una opción: ");
	        opcion = Leer.datoInt();
	        
	        switch (opcion) {
	        case 1:
	            System.out.println("Cantidad total de productos: " + ventas.getCantidadTotalProductos());
	            break;
	        case 2:
	            System.out.println("Cantidad total recaudada: " + ventas.calcularCantidadTotal());
	            break;
	        case 3:
	            System.out.print("Ingrese el dinero recibido: ");
	             dineroRecibido =Leer.datoDouble();
	            System.out.print("Ingrese el precio total: ");
	             precioTotal = Leer.datoDouble();
	            System.out.println("Cambio a devolver: " + ventas.devolverCambio(dineroRecibido, precioTotal));
	            break;
	        case 4:
	            ventas.mostrarListadoProductosConAviso();
	            break;
	        case 5:
	            System.out.println("Saliendo del programa...");
	            break;
	        default:
	            System.out.println("Opción no válida. Intente nuevamente.");
	        }
	    } while (opcion != 5);
	    }
}
