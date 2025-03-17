package ejercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {
    
    public static void main(String[] args) {
        
    	List<Double> notas = new ArrayList<Double>();  
    	
        Alumno a1 = new Alumno("Juan", "Perez", 1, 20, "12345678", "juany@gmail.com",notas);
        Alumno a2 = new Alumno("Pedro", "Gomez", 2, 21, "87654321", "pedro@gmial.com",notas);
        Alumno a3 = new Alumno("Maria", "Lopez", 3, 22, "45678912", "maria@gmail.com",notas);
        
        Set<Alumno> alumnos= new HashSet<Alumno>();
        CrudAlumno crud = new CrudAlumno();
        
        
        crud.insertarAlumno(a1);
        crud.insertarAlumno(a2);
        crud.insertarAlumno(a3);


        
    }
}
