package ejercicio11;

public class GestionNotas {

	private Alumno al;

	public GestionNotas(Alumno al) {
		super();
		this.al = al;
	}

	public Alumno getAl() {
		return al;
	}

	public void setAl(Alumno al) {
		this.al = al;
	}
	
	
	public void calcularMedia() {
		
		double notas[]=al.getNotas();
		double suma=0.0;
		for(int i=0;i<notas.length;i++) {
			
			suma+=notas[i];
		}
		
		 al.setNotaMedia(suma/notas.length);
	}
	
	public int contarSuspensos() {
		int minimoAp=5;
		int contador=0;
		double notas[]=al.getNotas();
		
		for(int i=0;i<notas.length;i++) {
			
			if(notas[i]<minimoAp) {
				
				contador++;
			}
			
		}
		return contador;
		
	}
	
}
