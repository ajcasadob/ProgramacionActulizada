package ejercicio02;

import java.util.Arrays;

public class Hotel {

	private Habitacion lista[];

	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Hotel [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void agregarHabitacion(Habitacion hb,int numHab) {
		
		lista[numHab]=hb;
	}
	
	
	
	
	
	
	
}
