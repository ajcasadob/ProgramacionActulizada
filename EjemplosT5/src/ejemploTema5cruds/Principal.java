package ejemploTema5cruds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		List<String>listaNombres=new ArrayList <String>();
		
		listaNombres.add("Luis");
		listaNombres.add("Angel");
		listaNombres.add("Luis");
		
		System.out.println(listaNombres);*/
		
		int opcion;
		String dni, nombre;
		double nota;
		Scanner sc = new Scanner(System.in);
		Alumno a1= new Alumno ("234564j","Antonio",7.6);
		Alumno a2= new Alumno ("233454j","Joaquin",8.6);
		Alumno a3= new Alumno ("237884j","Pepe",9.6);
		Alumno a4= new Alumno ("233454j","Jose",10.0);
		Alumno a5= new Alumno ("234564j","Paula",7.8);
		
		List <Alumno> listado = new ArrayList<Alumno>(); 
		Secretaria s= new Secretaria(listado);
		
		listado.add(a1);
		listado.add(a2);
		listado.add(a3);
		listado.add(a4);
		listado.add(a5);
		
		
		
		System.out.println("Bienvevidos a mi programa de gestion de alumnos");
		do{
			System.out.println();
			System.out.println("1.- Agregar Alumno");
			System.out.println("2.- Buscar Alumno");
			System.out.println("3.- Eliminar Alumno");
			System.out.println("4.- Modificar Alumno");
			System.out.println("5.- Listar todos los alumnos");
			System.out.println("6.-Borrar alumno por dni");
			System.out.println("7.- Ver media de todos los alumnos");
			System.out.println("0.- Salir");
			System.out.println("Introduce una opcion");
			opcion=Integer.parseInt(sc.nextLine());
			switch (opcion) {
			
				case 0:
					System.out.println("Saliendo del programa");
					break;
				case 1:
					System.out.println("Introduce el dni del alumno");
					 dni=sc.nextLine();
					System.out.println("Introduce el nombre del alumno");
					 nombre=sc.nextLine();
					System.out.println("Introduce la nota media del alumno");
					nota=Double.parseDouble(sc.nextLine());
					//Alumno a= new Alumno(dni,nombre,nota);
					//NO HACE FALTA INSTANCIAR UN ALUMNO DE ESTA MANERA, SE PUEDE INSTANCIAR DIRECTAMENTE.
					s.agregarAlumno(new Alumno(dni, nombre, nota));
					s.imprimirLista();
					break;
					
				case 2:
					System.out.println("Introduce el dni del alumno a buscar");
					dni=sc.nextLine();
					Alumno temp= s.buscarPorDni(dni);
					if(temp!=null) {
						System.out.println("Alumno encontrado: "+temp);
					}else {
						System.out.println("Alumno no encontrado");
					}
					break;
				case 3:
					System.out.println("Introduce el dni del alumno a borrar");
					dni=sc.nextLine();
					s.borrarAlumno(dni);
					s.imprimirLista();
					break;
				case 4:
					System.out.println("Introduce el dni del alumno a modificar");
					dni=sc.nextLine();
					System.out.println("Introduce la nueva nota del alumno");
					nota=Double.parseDouble(sc.nextLine());
					s.modificarNota(nota, dni);
					s.imprimirLista();
					break;	
				case 5:
					
					s.imprimirLista();
					break;
				case 6:
					System.out.println("Introduce el DNI del alumno que desea borrar");
					dni=sc.nextLine();
					s.borrarAlumno(dni);
					s.imprimirLista();
					
					break;
				case 7:
					System.out.printf("La media total de todos los alumnos es %.2f ", s.calcularNotaMedia());
					
					
					break;

				default:
				System.out.println("Opcion no valida");
					break;
			}

		}while(opcion!=0);
		
		sc.close();
		
	}

}
