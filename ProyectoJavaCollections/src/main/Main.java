package main;



import crud.LibroCrud;
import model.Libro;

import java.util.List;
import java.util.Scanner;

/*
 * Sistema de Gestión de Libros
 * ...
 */

public class Main {

    public static void main(String[] args) {
        LibroCrud crud = new LibroCrud();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Listar libros");
            System.out.println("4. Ordenar libros por título");
            System.out.println("5. Invertir orden");
            System.out.println("6. Buscar libro por título");
            System.out.println("7. Mostrar libro más antiguo");
            System.out.println("8. Obtener lista sincronizada");
            System.out.println("9. Obtener lista inmutable");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Año de publicación: ");
                    int anio = scanner.nextInt();
                    crud.agregarLibro(new Libro(titulo, autor, anio));
                    break;
                case 2:
                    System.out.print("Título del libro a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    crud.eliminarLibro(tituloEliminar);
                    break;
                case 3:
                    crud.listarLibros();
                    break;
                case 4:
                    crud.ordenarLibrosPorTitulo();
                    System.out.println("Libros ordenados.");
                    break;
                case 5:
                    crud.invertirOrden();
                    System.out.println("Orden invertido.");
                    break;
                case 6:
                    System.out.print("Título a buscar: ");
                    String buscar = scanner.nextLine();
                    crud.buscarLibro(buscar);
                    break;
                case 7:
                    crud.mostrarLibroMasAntiguo();
                    break;
                case 8:
                    List listaSync = crud.obtenerListaSincronizada();
                    System.out.println("Lista sincronizada creada. Tamaño: " + listaSync.size());
                    break;
                case 9:
                    List listaInmutable = crud.obtenerListaInmutable();
                    System.out.println("Lista inmutable creada. Tamaño: " + listaInmutable.size());
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
