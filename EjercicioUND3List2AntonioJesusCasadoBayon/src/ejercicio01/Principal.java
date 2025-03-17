package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica). En esta
			clase se debe tener el método para calcular el precio de coste, que será el precio de fábrica más un porcentaje
			pasado como parámetro que será el coste en el transporte.
			En una clase Tienda, con un array de productos como atributo se podrá:
			c1- Listar datos de todos los productos.
			c2- Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.
			c3- Añadir un producto a la lista pasando como parámetro un producto.
			c4- Calcular la cantidad invertida por la tienda en comprar todos los productos, es decir, la suma de todos los
			precios de fábrica.
			c5- Calcular el PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro, sumado al precio
			de coste.
			c6- Calcular las posibles ganancias cuando se hayan vendido todos los productos, es decir, la suma de todos los
			precios de venta al público menos la suma de todos los precios de fábrica.
			Crear un main de prueba con un menú donde se pueda hacer todo esto.*/
		
		int tam=100,opcion,numProductos=0;
		double precioFab=0 , porcentajeGanancia = 0;
		String nombre="",name2="";
		int id=6;
		boolean fragil=true;
		int seccion=0;
		
		
		Producto pEncontrado = null;
		Producto lista[]=new Producto[tam];
		Tienda t=new Tienda(lista);
		Producto p=new Producto(4.5,"fanta",2,false,230);
		Producto p1=new Producto(1.2,"pipas",3,true,132);
		Producto p2=new Producto(3.2,"cocacola",4,true,527);
		Producto p3=new Producto(6.1,"camiseta",5,false,144);
		Producto p4=new Producto(7.0,"calabaza",6,true,765);
		t.agregarProductos(p, numProductos++);// <- 0 agrega el producto en el 0 y luego suma ++
		t.agregarProductos(p1, numProductos++);
		t.agregarProductos(p2, numProductos++);
		t.agregarProductos(p3, numProductos++);
		t.agregarProductos(p4, numProductos++);
		
		
		System.out.println("Bienvenidos a mi tienda");
		System.out.println();
		
		do {
			
			imprimirMenu();
			System.out.println("Elija una opción");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
			
			
				case 0:
					System.out.println("Saliendo...");
					System.out.println("Gracias por usar mi programa");
					break;
					
				case 1:
					
					//temporal guardado en variables
					System.out.println("¿Cual es el precio de fabrica?");
					precioFab=Leer.datoDouble();
					System.out.println("¿Cual es su nombre?");
					nombre=Leer.dato();
					id++;
					System.out.println("¿Es un producto fragil(true), o no fagril(false).");
					fragil=Leer.datoBoolean();
					System.out.println("¿Cuál es la seccion del producto?");
					seccion=Leer.datoInt();
					
					//Instanciamos un objeto con los valores que ha proporcionado el user
					Producto p8=new Producto(precioFab,nombre,id,fragil,seccion);
					
					//El objeto creado se guarda en la lista de la tienda
					t.agregarProductos(p8, numProductos++);
					
						
			
					break;
				case 2:
					
					t.listarTodos();
					
					break;
				case 3:
					System.out.println("¿Qué id de producto quieres comprobar?");
					id=Leer.datoInt();
					t.imprimirFragil(id, numProductos);
					
					break;
						
				case 4:
					System.out.println(t.calcularCantidadInvertida(numProductos) + " €"); 
					break;
					
				case 5:
					
					System.out.println("¿Dime nombre del artículo qué quieres calcular el pvp?");
					nombre=Leer.dato();
					System.out.println("¿Qué porcentaje de ganancia quieres tener?");
					porcentajeGanancia=Leer.datoDouble();
					
					pEncontrado = t.buscarPorNombre(nombre, numProductos);
					
					if(pEncontrado == null) {
						System.out.println("No se ha encontrado");
					}else {
						
						System.out.println("El pvp será: " + t.calcularPVP(pEncontrado, porcentajeGanancia)+" €");
						
					}
					break;
					
				case 6:
					
					System.out.printf("Las posibles ganancias son %.2f",t.calcularGanancias(p, porcentajeGanancia, numProductos)); 
					
					
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
	1.Añadir productos a la tienda.
	2.Listar datos de los productos.
	3.Comprobar si el producto es fragil(true), no fragil(false).
	4.Calcular cantidad invertida.
	5.Calcular PVP
	6.Calcular ganancias
			
			""");
}
	
}
