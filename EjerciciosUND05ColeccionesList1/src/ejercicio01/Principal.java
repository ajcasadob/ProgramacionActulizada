package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		String titulo,contenido,fecha;

		Nota n1 = new Nota("Java","Programacion","12/12/2020");
		Nota n2 = new Nota("Phyton","Programacion","12/12/2021");
		Nota n3 = new Nota("SQL","Base de datos","12/12/2023");
		Nota n4 = new Nota("css","Lenguaje de marcas","12/12/2025");
		List <Nota> listado = new ArrayList<Nota>(); 

		Notas notas = new Notas(listado);
		do{
			System.out.println("1.- Agregar Nota");
			System.out.println("2.- Eliminar Nota");
			System.out.println("3.- Mostrar Notas");
			System.out.println("0.- Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
				case 0:
					System.out.println("Saliendo del programa");
					break;
				case 1:
					System.out.println("Introduce el titulo de la nota");
					titulo = sc.nextLine();
					System.out.println("Introduce el contenido de la nota");
					contenido = sc.nextLine();
					System.out.println("Introduce la fecha de la nota");
					fecha = sc.nextLine();
					Nota n = new Nota(titulo,contenido,fecha);
					notas.agregarNota(n);
					notas.agregarNota(n1);
					notas.agregarNota(n2);
					notas.agregarNota(n3);
					notas.agregarNota(n4);
					break;
				case 2:
					System.out.println("Introduce el titulo de la nota a eliminar");
					titulo = sc.nextLine();
					for (Nota nota : listado) {
						if(nota.getTitulos().equals(titulo)) {
							notas.eliminarNota(nota);
						}
					}
					break;	
				case 3:
					notas.mostrarNotas();
					break;		


				default:
					System.out.println("Opcion no valida");
					break;
			}

		}while(opcion != 0);

		sc.close();

	}

}
