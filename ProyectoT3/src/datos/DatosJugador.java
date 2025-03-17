package datos;

import java.util.Arrays;

import model.Jugador;

public class DatosJugador {
	
	private Jugador lista[];
	
	
	//Constructor
	public DatosJugador() {
		
	}


	//Getter and setter
	public Jugador[] getLista() {
		return lista;
	}


	public void setLista(Jugador[] lista) {
		this.lista = lista;
	}

	
	//To String
	@Override
	public String toString() {
		return "DatosJugador [lista=" + Arrays.toString(lista) + "]";
	}
	
	

}
