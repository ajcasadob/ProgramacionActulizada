package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import crud.CrudInventario;
import model.Producto;

public class Principal {
	
	/*
    Enunciado del ejercicio:
    Se requiere desarrollar un sistema de gestión de inventario de productos.
    Debe de contener la clase Producto,Inventario(Crud), y la Principal.
    El sistema debe permitir:
    - Agregar productos con un ID, nombre, precio, categoría y stock.
    - Eliminar productos por su ID.
    - Buscar productos por su ID.
    - Listar todos los productos registrados.
    - Ordenar los productos por precio y nombre.
    - Mezclar aleatoriamente el orden de los productos.
    - Determinar el producto más caro y el más barato.
    - Invertir el orden de la lista de productos.
    - Encontrar un producto con precio mínimo y máximo.
    - Rellenar una lista con un producto específico.
    
*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        List<Producto> listaProductos = new ArrayList<>();
        CrudInventario inventario = new CrudInventario(listaProductos);

        int op,id,stock,idEliminar,idBuscar;
        String nombre,categoria;
        double precio;
        
        inventario.agregarProducto(new Producto(0, "Leche", 1.5, "Lacteo", 3));
        inventario.agregarProducto(new Producto(1, "Pan", 1.0, "Panadería", 10));
        inventario.agregarProducto(new Producto(2, "Manzana", 0.8, "Frutas", 15));
        inventario.agregarProducto(new Producto(3, "Queso", 3.5, "Lácteo", 5));
        inventario.agregarProducto(new Producto(4, "Jabón", 2.0, "Higiene", 8));
        inventario.agregarProducto(new Producto(5, "Arroz", 1.2, "Granos", 20));
        inventario.agregarProducto(new Producto(6, "Café", 4.5, "Bebidas", 6));
        inventario.agregarProducto(new Producto(7, "Azúcar", 1.3, "Dulces", 12));
        inventario.agregarProducto(new Producto(8, "Pollo", 5.0, "Carnes", 7));
        inventario.agregarProducto(new Producto(9, "Pasta", 1.8, "Granos", 14));
        inventario.agregarProducto(new Producto(10, "Zanahoria", 0.9, "Verduras", 18));
        
        do {
        	
            System.out.println("\nMenú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Listar productos");
            System.out.println("5. Ordenar productos por nombre");
            System.out.println("6. Ordenar productos por precio");
            System.out.println("7. Mezclar productos");
            System.out.println("8. Producto más caro");
            System.out.println("9. Producto más barato");
            System.out.println("10. Invertir lista de productos");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");

             op = Integer.parseInt(sc.nextLine());
            

            switch (op) {
                case 1:
                    System.out.print("ID: ");
                     id = Integer.parseInt(sc.nextLine());
                    
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Precio: ");
                     precio = Double.parseDouble(sc.nextLine());
                    
                    System.out.print("Categoría: ");
                     categoria = sc.nextLine();
                    System.out.print("Stock: ");
                    stock = Integer.parseInt(sc.nextLine());
                    inventario.agregarProducto(new Producto(id, nombre, precio, categoria, stock));
                    break;
                case 2:
                    System.out.print("ID a eliminar: ");
                   idEliminar = Integer.parseInt(sc.nextLine());
                    	inventario.eliminarUnProducto(idEliminar);
                    break;
                case 3:
                    System.out.print("ID a buscar: ");
                    idBuscar = Integer.parseInt(sc.nextLine());
                    	Producto p = inventario.buscarProductoPorId(idBuscar);
                    	if(p==null) {
                    		System.out.println("Este producto no existe");
                    	}else {
                    		System.out.println(p);
                    		
                    	}
                    
                    break;
                case 4:
                    inventario.listarProductos();
                    break;
                case 5:
                    System.out.println(inventario.ordenarPorNombre());
                    break;
                case 6:
                    System.out.println(inventario.ordenarPorPrecioList());
                    break;
                case 7:
                    System.out.println(inventario.mezclarProductos());
                    break;
                case 8:
                	
                	System.out.println(inventario.obtenerProductosMasCaro());
                	
                	break;
                case 9:
                	System.out.println(inventario.obtenerProductosBaratos());
                		
                	break;
                case 10:
                    System.out.println(inventario.invertirListaProductos());
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    
                   break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }while(op!=0);
        sc.close();
    }
}
