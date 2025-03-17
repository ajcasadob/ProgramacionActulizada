package crud;


import datos.DatosJugador;
import model.Jugador;
public class CrudJugador {
   
	private int numJugadores;
	DatosJugador dt=new DatosJugador();
	
  
  
	//Constructor
	public CrudJugador() {
	}
		
	   
	 //Getter and setter
	public int getNumJugadores() {
		return numJugadores;
	}
	
	
	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}
		
	
	 //Metodos
	 public void agregarJugadores (Jugador jg){	
		dt.getLista()[numJugadores]=jg;
		numJugadores++;
	 }
	
	public void listarTodosLosJugadores() {
		for(int i=0;i<dt.getLista().length;i++) {
			if(dt.getLista()[i]!=null) {
				System.out.println(dt.getLista()[i]);
			}
		}
	}
			
			 
	public void buscarJugador(String nombre) {
		for(int i=0;i<dt.getLista().length;i++) {
			if(dt.getLista()[i]!=null && dt.getLista()[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(dt.getLista()[i]); 
			}else {
				System.out.println("No se ha encontrado");
			}
		}
	}
		
		
			
	public void modificarJugador(String nombre, int numJugador) {
		dt.getLista()[numJugador-1].setNombre(nombre);
	}
			
			
}
