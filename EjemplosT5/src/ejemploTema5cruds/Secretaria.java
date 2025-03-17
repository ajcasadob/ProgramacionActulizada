package ejemploTema5cruds;

import java.security.PublicKey;
import java.util.List;

public class Secretaria {

	
	private List<Alumno> listAlumno;

	public Secretaria(List<Alumno> listAlumno) {
		super();
		this.listAlumno = listAlumno;
	}

	public List<Alumno> getListAlumno() {
		return listAlumno;
	}

	public void setListAlumno(List<Alumno> listAlumno) {
		this.listAlumno = listAlumno;
	}

	@Override
	public String toString() {
		return "Secretaria [listAlumno=" + listAlumno + "]";
	}
	
	
	public void agregarAlumno(Alumno a) {
		
		listAlumno.add(a);
		
	}
	
	public Alumno buscarPorDni(String dni) {
		Alumno tem=null;
		boolean salir=false;
		
		for (int i = 0; i <listAlumno.size() && !salir; i++) {
			if(listAlumno.get(i).getDni().equalsIgnoreCase(dni)) {
				tem= listAlumno.get(i);
				salir=true;
			}
		}
		return  tem;
		
	}
	
	public int buscarPorDniv2(String dni) {
		int temp=-1;
		boolean salir=false;
		for (int i = 0; i <listAlumno.size()&& !salir; i++) {
			
			if(listAlumno.get(i).getDni().equalsIgnoreCase(dni)) {
				temp=i;
				salir=true;
			}
		}
		return temp;
	}
	
	
	public void borrarAlumno(String dni) {
		
		int index= buscarPorDniv2(dni);
		if(index>=0) {
			listAlumno.remove(index);
		}
		
	}
	
	public void imprimirLista() {
		
		for (Alumno alumno : listAlumno) {
			
			System.out.println(alumno);
			
		}
	}
	
	public void modificarNota(double nota,String dni) {
		
		int index= buscarPorDniv2(dni);
		if(index>=0) {
			listAlumno.get(index).setNotaMedia(nota);
		}
	}
	
	
	// No es un crud, calcula la media total seria del paquete controller
	
	public double calcularNotaMedia() {
		double sumaMediaTotal=0.0;
		for (Alumno alumno : listAlumno) {
			
			sumaMediaTotal+=alumno.getNotaMedia();
		}
		
		return sumaMediaTotal/listAlumno.size();
	
		
		
	}
	
	public boolean agregar2(Alumno al) {
		return listAlumno.add(al);
	}
	
	public void erroAgregarAlumno(boolean b) {
		
		if(b) {
			System.out.println("Agregado correctamente");
		}else {
			System.out.println("Error al agregar");
		}
	}
}

