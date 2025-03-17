package crud;
import model.Jugador;
public class CrudJugador {
   private int numJugadores;
   private Jugador lista[];
  
  
  
   public CrudJugador(int capacidad) {
		
		this.lista=new Jugador[capacidad];
		this.numJugadores=0;
		
		
	}
	
   public void agregarJugadores (Jugador jg){	
		lista[numJugadores]=jg;
	    numJugadores++;
	}
		
	public void listarTodosLosJugadores() {
			for(int i=0;i<lista.length;i++) {
				if(lista[i]!=null) {
					System.out.println(lista[i]);
				}
			}
	}
		
		 
	public int buscarJugador(String nombre) {
		for(int i=0;i<lista.length;i++) {
			if(lista[i]!=null && lista[i].getNombre().equalsIgnoreCase(nombre)) {
				return i;
			}
		}
		return -1;
	}
	
	public void eliminarJugador(String nombre){
		int index=buscarJugador(nombre);
		if(index>=0){
		    lista[index]=null;
		    System.out.println("Jugador eliminado correctamente.");
		    numJugadores--;
		}else {
			System.out.println("Jugador no encontrado");
		}
		
	}
		
	public void modificarJugador(String nombre, int numJugador) {
		lista[numJugador-1].setNombre(nombre);
	}
		
		
}
