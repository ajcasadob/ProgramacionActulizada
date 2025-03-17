package ejemplosobjetos;

import java.util.Random;

public class Alumno3 {

	
	private int id;
	private String nombre;
	
	
	public Alumno3(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double calcularMedia(double notas[]) {
		double suma=0.0;
		for(int i=0;i<notas.length;i++) {
			
			suma+=notas[i];
		}
		
		return suma/notas.length;
	}
	
	//!!ESTE METODO NO DEBERIA DE IR EN LA CLASE ALUMNO
	
	public double[] rellenarNotas(int tam,int desde,int hasta) {
		
		double notas[]=new double [tam];
		Random rnd=new Random(System.nanoTime());
		for(int i=0;i<notas.length;i++) {
			
			notas[i]=rnd.nextInt(hasta-desde+1)-desde;
		}
		return notas;
	}
	
	
	
	
}
