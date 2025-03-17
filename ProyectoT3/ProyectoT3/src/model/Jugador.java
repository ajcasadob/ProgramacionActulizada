package model;
public class Jugador {
	
	private String nombre;
	private int numFallos;
	private int numAciertos;
	
	
	public Jugador(String nombre, Dinero saldo) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumFallos() {
		return numFallos;
	}
	public void setNumFallos(int numFallos) {
		this.numFallos = numFallos;
	}
	public int getNumAciertos() {
		return numAciertos;
	}
	public void setNumAciertos(int numAciertos) {
		this.numAciertos = numAciertos;
	}
	

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", numFallos=" + numFallos + ", numAciertos=" + numAciertos;
	}
	
	public int comparador (Jugador jg){
		if(this.nombre.equalsIgnoreCase(jg.getNombre())){
			return 0;
		}else{
			return 1;
		}

		
	}
	
}
