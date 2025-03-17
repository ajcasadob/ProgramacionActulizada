package ejemplosobjetos;

import java.util.Arrays;

public class Alumno2 {

	
	private String nombre;
	private double notas[]; //De momento, no instanciamos aqui el array, es decir, no ponemos el new
	
	
	
	
	
	public Alumno2(String nombre, double[] notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "Alumno2 [nombre=" + nombre + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	public double calcularNotaMedia() {
		double suma=0.0;
		for(int i=0;i<notas.length;i++) {
			
			suma+=notas[i];
		}
		return suma/notas.length;
	}
	
	
}
