package ejerciciodeprueba;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
	
		int tam=100,numProducto=0,opcion,id=0,seccion;
		String nombre;
		double precio,porcentaje,transporte=0;
		boolean fragil;
		Producto lista[]=new Producto[tam];
		
		
		
		Tienda t= new Tienda(lista);
		Producto p=new Producto(5.5,"pipas",0,true,100);
		Producto p1=new Producto(3.5,"calabaza",1,false,101);
		Producto p2=new Producto(6.5,"fresas",2,true,102);
		Producto p3=new Producto(9.5,"leche",3,false,103);
		Producto p4=new Producto(8.5,"papas",4,true,104);
		Producto p5=new Producto(7.5,"sopa",5,false,105);
		
		
		t.agregarProductos(p, numProducto++);
		t.agregarProductos(p1, numProducto++);
		t.agregarProductos(p2, numProducto++);
		t.agregarProductos(p3, numProducto++);
		t.agregarProductos(p4, numProducto++);
		t.agregarProductos(p5, numProducto++);
		
		Producto p6=null;
		boolean p6Creado=false;
		
		
		do {
			imprimirMenu();
			System.out.println("Elije la opción que necesite");
			opcion=Leer.datoInt();
			
			
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo...");
					System.out.println("Gracias por usar mi programa");
					break;
					
				case 1:
					
					t.listarProductos();
					
					break;
				case 2:
					System.out.println("Indícame el nombre del producto que quieres comprobar la fragilidad");
					id=Leer.datoInt();
					
					t.ImprimirFragilidad(id, numProducto);
					
					break;
					
				case 3:
					
					System.out.println("Indícame el precio del producto que quieres añadir");
					precio=Leer.datoDouble();
					System.out.println("Indícame el nombre del producto");
					nombre=Leer.dato();
					id+=5;
					System.out.println("Indícame si el producto es fragil(true) o no fragil(false)");
					fragil=Leer.datoBoolean();
					System.out.println("Indícame la seccion del producto");
					seccion=Leer.datoInt();
					
					p6=new Producto(precio,nombre,id,fragil,seccion);
					t.agregarProductos(p6, numProducto++);
					p6Creado=true;
					
					break;
					
				case 4:
					
					System.out.println(t.calcularPrecioFab(numProducto)+" €");	
					
					
					break;
				case 5:
					
					if(p6Creado) {
					System.out.println("Indícame la id del producto que desea buscar");
					id=Leer.datoInt();
					System.out.println("Indícame el porcentaje del transporte");
					transporte=Leer.datoDouble();
					System.out.println("Indícame el porcentaje que se le quiere aplicar");
					porcentaje=Leer.datoDouble();
					
					t.buscarPorId(id, numProducto);
					System.out.println(t.calcularPvp(numProducto, porcentaje, transporte, p6)+" €");
					
					
					}else {
						System.out.println("No se ha añadido ningún producto aún");
					}
					
					
					break;
				case 6:
					
					
					break;
				default:
					System.out.println("La opción elegida no esta establecida");
					break;
			}
			
			
			
			
			
			
		}while(opcion!=0);
		
	
		
		
		
		

	}
	public static void imprimirMenu() {
	
	System.out.println("""
	0.Salir
	1.Listar todos los productos.
	2.Comprobar si es fragil(true) o no fagril(false).
	3.Añadir un producto a la lista
	4.Calcular la cantidad invertida
	5.Calcular PVP
	6.Calcular posibles ganancias
					
			""");
	
	
}
}
