package ejercicio03;

import java.util.Set;

public class CrudAlumno {
    

    private Set<Alumno> alumnos;

    public void  insertarAlumno(Alumno alumno){

        alumnos.add(alumno);

    }


    public Alumno buscarAlumnoPorId (int id){
        for(Alumno a : alumnos){
            if(a.getId()== id){
                return a;
            }
        }
        return null;
    }

    public void eliminarAlumno(int id) {
        
        Alumno a = buscarAlumnoPorId(id);
        if(a !=null){
            alumnos.remove(a);
        }

    }

    public void actualizarAlumno(int id,String email){
        Alumno a = buscarAlumnoPorId(id);
        if(a!=null){
            a.setEmail(email);

        }
    }

    public Alumno mostrarAlumno(int id){
        Alumno a = buscarAlumnoPorId(id);
        if(a!=null){
            return a;
        }
        return null;
    }

}
