package ejercicio03;

public class Secretaria {
    
	private CrudAlumno notas;

	public Secretaria(CrudAlumno notas) {
		super();
		this.notas = notas;
	}

	public CrudAlumno getNotas() {
		return notas;
	}

	public void setNotas(CrudAlumno notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Secretaria [notas=" + notas + "]";
	}
	
	public double calcularNotaMedia(Alumno alumno) {
		
		double notaSuma=0.0;
		
		for(double nota: alumno.getNotas()) {
			
			notaSuma+=nota;
		}
		return notaSuma/alumno.getNotas().size();
		
	}
	
	public int calcularSuspensos(Alumno alumno) {
		
		int numSuspensos=0;
		
		for(double nota: alumno.getNotas()) {
			
			if(nota<5) {
				numSuspensos++;
			}
		}
		return numSuspensos;
		
	}
		public double calcularMediaSuspensos(int id) {
		
		
		double mediaNotas=0.0;
		double contador=0.0;
		
		Alumno a =notas.buscarAlumnoPorId(id);
		
		for(double nota: a.getNotas()) {
			
			if(nota<5) {
				mediaNotas+=nota;
				contador++;
			}
		}
		return mediaNotas/contador;
		
	}
	
    
}
