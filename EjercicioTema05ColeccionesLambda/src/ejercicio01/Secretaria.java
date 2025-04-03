package ejercicio01;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Secretaria {

	private List<Alumno> list;

	public Secretaria(List<Alumno> list) {
		super();
		this.list = list;
	}

	public List<Alumno> getList() {
		return list;
	}

	public void setList(List<Alumno> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Secretaria [list=" + list + "]";
	}
	
	//Obtener todos los alumnos de la lista
	public List<Alumno> obtenerTodosLosAlumnos(){
		
		return list.stream().toList();
	}
	
	//Mostrar todos los alumnos imprimiendolos
	
	public void mostrarTodosLosAlumnos() {
		
		list.stream().forEach(System.out::println);
	}
	
	//Imprimir todos los alumnos cuyo nombre empiece por una letra
	
	public void imprimirAlumnosPorLetra (String letra) {
		
		list.stream()
			.filter(al -> al.getName().startsWith(letra))
			.forEach(System.out::println);
		
	}
	
	//Dar el tamaño de la lista usando count
	
	public long tamañoLista() {
		
		return list.stream().count();
		
	}
	
	//Obtener los alumnos con nota media mayor de 9 en el curso 1dam
	
	public List<Alumno> obtenerAlumnoMediaMayor(){
		
		
		return list.stream()
				.filter(al -> al.getNotaMe()>9 && al.getNameCur().equalsIgnoreCase("1ºDAM"))
				.toList();
	}
	
	//Imprimir los 3 primeros alumnos de la lista usando limit
	
	public void imprimirTresPrimeroAlumnos() {
		
		list.stream().limit(3).forEach(System.out::println);
	}
	
	//Obtener el alumno de menor edad
	
	public Optional<Alumno> obtenerAlumnoMenorEdad(){
		
	return 	list.stream()
			.min(Comparator.comparingInt(al-> al.getEdad()));
	}
	
	//Obtener el primer alumno de la lista con findFirst()
	
	public Optional<Alumno> obtenerPrimerAlumnoDeLaLista(){
		
		return list.stream().findFirst();
	}
	
	//Obtener una nueva lista con los alumnos cuya longitud de la cadena de nombre sea mayor a 10 letras
	
	public List<Alumno> obtenerMayorLongitudDeNombre(){
		
		return list.stream().filter(al -> al.getName().length()>10).toList();
	}
	
	//Obtener los alumnos que empiecen por la letra A y la longitud de su nombre sea menor o igual a 6
	
	public List<Alumno> obtenerAlumnosPorAyMenorOIgualASeisLetras(){
		
		return list.stream()
				.filter(al -> al.getName().startsWith("A") && al.getName().length()<=6).toList();
	}
}
