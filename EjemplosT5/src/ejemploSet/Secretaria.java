package ejemploSet;


import java.util.Set;

public class Secretaria {

	
	private Set<Alumno>listado;

	public Secretaria(Set<Alumno> listado) {
		super();
		this.listado = listado;
	}

	public Set<Alumno> getListado() {
		return listado;
	}

	public void setListado(Set<Alumno> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Secretaria [listado=" + listado + "]";
	}

	
	public void agregarAlumno(Alumno a) {
		
		listado.add(a);
		
	}
	
	public void listarAlumnos() {
		
		for (Alumno alumno : listado) {
			
			System.out.println(alumno);
		}
	}
	
	
}
