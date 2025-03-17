package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Alumno>listadoAlumnos= new HashSet<Alumno>();
		
		listadoAlumnos.add(new Alumno("45997345j", "Antonio", 5.0));
		listadoAlumnos.add(new Alumno("45467345j", "Miguel", 10.0));
		Secretaria s= new Secretaria(listadoAlumnos);
		//System.out.println(listadoAlumnos);
		
		s.listarAlumnos();
		
		
		
	}

}
