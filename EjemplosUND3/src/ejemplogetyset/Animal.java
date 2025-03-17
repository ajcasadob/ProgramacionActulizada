package ejemplogetyset;

public class Animal {

	private String nombre;
	private int edad;
	private int numPatas;
	private double peso;
	private boolean mamifero;

	public Animal(String nombre, int edad, int numPatas, double peso, boolean mamifero) {

		this.nombre = nombre;
		this.edad = edad;
		this.numPatas = numPatas;
		this.peso = peso;
		this.mamifero = mamifero;
	}

	public Animal() {

		
	}

	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + ", numPatas=" + numPatas + ", peso=" + peso
				+ ", mamifero=" + mamifero + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	//Cuanto el atributo es booleano se pone is en vez de get.
	public boolean isMamifero() {
		return mamifero;
	}

	public void setMamifero(boolean mamifero) {
		this.mamifero = mamifero;
	}
	//Ante la duda devolvemos de las dos formas asi y con un void.
	
	public void cambiaEdad(int cantidad) {
		edad+=cantidad;
		
	}
	
	
	public int cambiarEdad(int cantidad) {
		edad+=cantidad;
		return edad; 
	}
	
	public int cambiarEdad() {
	
		return edad;
	}

}
