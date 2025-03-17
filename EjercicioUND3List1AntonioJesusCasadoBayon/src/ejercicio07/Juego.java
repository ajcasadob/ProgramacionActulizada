package ejercicio07;

import java.util.Random;

public class Juego {
	
	
	public void Menu() {
		
		System.out.println("""
				0.Salir
				1.Lanzar moneda y comprobar si has ganado
				""");
	}
	
	public int generarMoneda() {
		
		int numero,hasta=2,desde=1;
		Random rnd=new Random();
		numero=rnd.nextInt(hasta-desde+1)+desde;
		return numero;
	}
	
	public void imprimirMonedaLanzada(int generador) {
		if(generador==1) {
			
			System.out.println("El número ganador es el 1");
			
		}else {
			System.out.println("El número ganador es el 2");
		}
		
	}
	
	public boolean generarGanador(int eleccion) {
		
		int generador;
		boolean res;
		generador=generarMoneda();
		
		if(eleccion==generador) {
			res=true;
			
		}else {
			res=false;
		}
		return res;
		
	}
	public void imprimirGanador(boolean res) {
	
		if(res) {
			System.out.println("Enhorabuena has GANADOO");
			
		}else {
			System.out.println("Siga jugando");
		}
	}

}
