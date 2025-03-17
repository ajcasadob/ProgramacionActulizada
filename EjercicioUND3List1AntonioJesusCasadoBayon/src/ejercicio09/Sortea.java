package ejercicio09;

import java.util.Random;

public class Sortea {
	
	private int numeroGanador;
	

	public int getNumeroGanador() {
		return numeroGanador;
	}

	public void setNumeroGanador(int numeroGanador) {
		this.numeroGanador = numeroGanador;
	}
	
	public int generaradorDecimo() {
		int numero;
		int desde=00001, hasta=99999;
		
		Random rnd=new Random();
		
		numero=rnd.nextInt(hasta-desde+1)+desde;
		return numero;
			
	}
	public void imprimirDecimo(int numero) {
		
		System.out.println("El número asignado por la máquina es "+numero);
		
	}
	
	public int generadorSorteo() {
		
		int numero,desde=00001,hasta=99999;
		
		Random rnd=new Random();
		numero=rnd.nextInt(hasta-desde+1)+desde;
		return numero;
		
	}
	
	public boolean comprobarGanador(int numeroElegido)/*parámetros / argumentos*/ {
		
		boolean pos;
		
		if(this.numeroGanador==numeroElegido) {
			
			pos=true;
		}else {
			
			pos=false;
		}
		return pos;
	}
	
	public void imprimirGanador(boolean esGanador) {
		
		if(esGanador) {
			
			System.out.println("Enhorabuena has ganado la lotería");
			
		}else {
			
			System.out.println("Lo siento, sigue intentándolo");
		}	
		
	}
	
	
	
	
	
	
	

}
