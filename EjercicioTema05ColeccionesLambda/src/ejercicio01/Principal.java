package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca = new Scanner(System.in);
		
        List<Alumno> alumnos = new ArrayList<>();
        int op;
        
        alumnos.add(new Alumno("Juan", "Pérez", "Matemáticas", 8.5, 20));
        alumnos.add(new Alumno("Ana", "González", "Historia", 9.0, 22));
        alumnos.add(new Alumno("Carlos", "López", "Física", 7.5, 21));
        alumnos.add(new Alumno("Lucía", "Martínez", "Biología", 6.8, 19));
        alumnos.add(new Alumno("Pedro", "Hernández", "Literatura", 9.3, 23));
        alumnos.add(new Alumno("Marta", "Gómez", "Química", 8.2, 20));
        alumnos.add(new Alumno("Luis", "Díaz", "Inglés", 7.8, 21));
        alumnos.add(new Alumno("Sofía", "Ramírez", "Arte", 9.1, 22));
        alumnos.add(new Alumno("Fernando", "Torres", "Geografía", 8.7, 24));
        alumnos.add(new Alumno("Laura", "Jiménez", "Educación Física", 6.5, 18));
        
        
        Secretaria sc = new Secretaria(alumnos);
        
       
        
        
        
        
        
        do {
        	
        	System.out.println("\nMenú:");
            System.out.println("1. Obtener todos los alumnos de la lista usando filter.");
            System.out.println("2. Mostrar todos los alumnos.");
            System.out.println("3. Imprimir todos los alumnos cuyo nombre empiece con una letra determinada.");
            System.out.println("4. Dar el tamaño de la lista.");
            System.out.println("5. Obtener los alumnos con nota media mayor de 9 en el curso 1DAM.");
            System.out.println("6. Imprimir los 3 primeros alumnos de la lista.");
            System.out.println("7. Obtener el alumno de menor edad.");
            System.out.println("8. Obtener el primer alumno de la lista.");
            System.out.println("9. Obtener los alumnos cuya longitud de la cadena de su nombre sea mayor a 10 letras.");
            System.out.println("10. Obtener los alumnos que empiecen por la letra A y la longitud de su nombre sea menor o igual a 6.");
            System.out.println("0. Salir.");
            System.out.print("Selecciona una opción: ");
        	op = Integer.parseInt(sca.nextLine());
        	
        	switch(op) {
        	
        		case 1:
        			System.out.println(sc.obtenerTodosLosAlumnos());
        			
        		break;
        		
        		case 2:
        				sc.mostrarTodosLosAlumnos();
        			break;
        		case 3:
        			sc.imprimirAlumnosPorLetra("a");
        			break;
        			
        		case 4:
        			System.out.println(sc.tamañoLista());
        				
        			break;
        		case 5:
        			System.out.println(sc.obtenerAlumnoMediaMayor());
        				
        			break;
        			
        		case 6:
        			
        			sc.imprimirTresPrimeroAlumnos();
        			break;
        			
        		case 7:
        			sc.obtenerAlumnoMenorEdad().ifPresent(System.out::println);
        			
        			break;
        			
        		case 8:
        			sc.obtenerPrimerAlumnoDeLaLista().ifPresent(System.out::println);
        			break;
        			
        		case 9:
        			System.out.println(sc.obtenerMayorLongitudDeNombre());
        			
        			break;
        			
        		case 10:
        			System.out.println(sc.obtenerAlumnosPorAyMenorOIgualASeisLetras());
        			break;
        			
        		case 0:
        			System.out.println("Saliendo..");
        			break;
        			default:
        				System.out.println("Esa opción no esta establecida..");
        				break;
        		
        	
        	
        	}
        	
        	
        	
        }while(op!=0);
       
        sca.close();
		
	}

}
