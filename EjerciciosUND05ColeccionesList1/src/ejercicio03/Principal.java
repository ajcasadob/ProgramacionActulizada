package ejercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    	List<Double> notas = new ArrayList<Double>();  
    	
        Alumno a1 = new Alumno("Juan", "Perez", 1, 20, "12345678", "juany@gmail.com",notas);
        Alumno a2 = new Alumno("Pedro", "Gomez", 2, 21, "87654321", "pedro@gmial.com",notas);
        Alumno a3 = new Alumno("Maria", "Lopez", 3, 22, "45678912", "maria@gmail.com",notas);
        
        Set<Alumno> alumnos= new HashSet<Alumno>();
        CrudAlumno crud = new CrudAlumno(alumnos);
        Secretaria scr = new Secretaria(crud);
        String nombre,apellido,dni,email;
        int edad,id;
        
        
        crud.insertarAlumno(a1);
        crud.insertarAlumno(a2);
        crud.insertarAlumno(a3);

        do{
            System.out.println("""
                    1. Insertar Alumno
                    2. Buscar Alumno
                    3. Eliminar Alumno
                    4. Actualizar Alumno
                    5. Mostrar Alumno
                    6.Mostar todos los alumnos
                    7. Calcular nota media
                    8. Calcular suspensos
                    9. Calcular media de suspensos
                    10. Insertar notas
                    0. Salir
                    """);

                    switch (Integer.parseInt(sc.nextLine())) {

                        case 1:
                            System.out.println("Introduce el nombre del alumno");
                            nombre= sc.nextLine();
                            System.out.println("Introduce el apellido del alumno");
                            apellido= sc.nextLine();
                            System.out.println("Introduce la edad del alumno");
                            edad=Integer.parseInt(sc.nextLine());
                            System.out.println("Introduce el dni del alumno");
                            dni=sc.nextLine();
                            System.out.println("Introduce el email del alumno");
                            email=sc.nextLine();
                            System.out.println("Introduce la nota del alumno");
                            notas.add(Double.parseDouble(sc.nextLine()));   
                            Alumno a = new Alumno(nombre, apellido, 4, edad, dni, email,notas);
                            crud.insertarAlumno(a);
                            
                            
                            break;

                        case 2:
                            System.out.println("Introduce el id del alumno");
                            id = Integer.parseInt(sc.nextLine());
                            System.out.println(crud.buscarAlumnoPorId(id));
                            break;

                        case 3:
                            System.out.println("Introduce el id del alumno");
                            id = Integer.parseInt(sc.nextLine());
                            crud.eliminarAlumno(id);
                            break;
                           
                         case 4:
                            System.out.println("Introduce el id del alumno");
                            id = Integer.parseInt(sc.nextLine());
                            System.out.println("Introduce el email del alumno");
                            email=sc.nextLine();
                            crud.actualizarAlumno(id, email);
                            break;
                        case 5:
                        
                            System.out.println("Introduce el id del alumno");
                            id = Integer.parseInt(sc.nextLine());
                            System.out.println(crud.mostrarAlumno(id));
                            break;
                        case 6:

                            for(Alumno al: alumnos){
                                System.out.println(al);
                            }
                            break;
                        case 7:
                            System.out.println("Introduce el id del alumno");
                            id = Integer.parseInt(sc.nextLine());
                            System.out.println(scr.calcularNotaMedia(crud.buscarAlumnoPorId(id)));
                            break;
                        case 8:
                            System.out.println("Introduce el id del alumno");
                            id = Integer.parseInt(sc.nextLine());
                            System.out.println(scr.calcularSuspensos(crud.buscarAlumnoPorId(id)));
                            break;
                        case 9:
                            System.out.println("Introduce el id del alumno");
                            id = Integer.parseInt(sc.nextLine());
                            System.out.println(scr.calcularMediaSuspensos(id));
                            break;    
                        case 10:
                            System.out.println("Introduce el id del alumno");
                            id = Integer.parseInt(sc.nextLine());
                            System.out.println("Introduce la nota del alumno");
                            notas.add(Double.parseDouble(sc.nextLine()));
                            break;          
                        
                    
                        default:

                        System.out.println("Opcion no valida");
                            break;
                    }





        }while(Integer.parseInt(sc.nextLine())!=0);


        sc.close();
    }
}
