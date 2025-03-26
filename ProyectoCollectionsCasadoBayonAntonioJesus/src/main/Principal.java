package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import crud.CrudInventario;
import model.Producto;

public class Principal {
	
	/*
    Enunciado del ejercicio:
    Se requiere desarrollar un sistema de gestión de inventario de productos utilizando la clase Collections de Java.
    El sistema debe permitir:
    - Agregar productos con un ID, nombre y precio.
    - Eliminar productos por su ID.
    - Buscar productos por su ID.
    - Listar todos los productos registrados.
    - Ordenar los productos por precio.
    - Mezclar aleatoriamente el orden de los productos.
    - Determinar el producto más caro y el más barato.
    - Invertir el orden de la lista de productos.
    - Implementar un menú interactivo para gestionar las operaciones.
*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		  int opcion,id,idEliminar,idBuscar;
		  String nombre;
		  double precio;
	        List<Producto> listaProductos = new ArrayList<>();
	       CrudInventario  inventario = new CrudInventario(listaProductos);

	        
	            do {
	            	
	            	System.out.println("\nMenú:");
		            System.out.println("1. Agregar producto");
		            System.out.println("2. Eliminar producto");
		            System.out.println("3. Buscar producto");
		            System.out.println("4. Listar productos");
		            System.out.println("5. Ordenar productos por precio");
		            System.out.println("6. Mezclar productos");
		            System.out.println("7. Producto más caro");
		            System.out.println("8. Producto más barato");
		            System.out.println("9. Invertir orden de la lista");
		            System.out.println("10. Salir");
		            System.out.print("Seleccione una opción: ");

	            opcion = Integer.parseInt(sc.nextLine());
	            

	            switch (opcion) {
	                case 1:
	                    System.out.print("ID: ");
	                    id = Integer.parseInt(sc.nextLine());
	                    
	                    System.out.print("Nombre: ");
	                    nombre = sc.nextLine();
	                    System.out.print("Precio: ");
	                    precio = Double.parseDouble(sc.nextLine());
	                    inventario.agregarProducto(new Producto(id, nombre, precio));
	                    break;
	                case 2:
	                    System.out.print("ID a eliminar: ");
	                    idEliminar = Integer.parseInt(sc.nextLine());
	                    inventario.eliminarProducto(idEliminar);
	                    break;
	                case 3:
	                    System.out.print("ID a buscar: ");
	                    idBuscar = Integer.parseInt(sc.nextLine());
	                    Producto encontrado = inventario.buscarProducto(idBuscar);
	                    if (encontrado != null) {
	                        System.out.println(encontrado);
	                    } else {
	                        System.out.println("Producto no encontrado");
	                    }
	                    break;
	                case 4:
	                    inventario.listarProductos();
	                    break;
	                case 5:
	                    inventario.ordenarPorPrecio();
	                    System.out.println("Productos ordenados por precio.");
	                    break;
	                case 6:
	                    inventario.mezclarProductos();
	                    System.out.println("Productos mezclados aleatoriamente.");
	                    break;
	                case 7:
	                    System.out.println("Producto más caro: " + inventario.obtenerMasCaro());
	                    break;
	                case 8:
	                    System.out.println("Producto más barato: " + inventario.obtenerMasBarato());
	                    break;
	                case 9:
	                    inventario.invertirLista();
	                    System.out.println("Lista de productos invertida.");
	                    break;
	                case 10:
	                    System.out.println("Saliendo...");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        }while(opcion!=0);
	}
	

}
