package ejercicio06;

import java.util.Random;

public class Generadora {

	public void Menu() {
		System.out.println("0.Salir\n1.Generar una quinela\n"
				+ "2.Generar Par o Impar\n3.Jugar a los chinos\n4.Sorteo de primitiva\n");
		
	}
	
	public String generadorQuinela(String quinela[]) {
		int desde=0;
		int hasta=2;
		int numero;
		Random rnd=new Random();
		numero=rnd.nextInt(hasta-desde+1)+desde;
		return quinela[numero];
						
	}
	
	public void imprimirQuinela (String dato) {
		
		System.out.println("El resultado de la quinela es "+dato);
	}
	
	public boolean generadorParoImpar() {
		
		int desde=1;
		int hasta=10;
		boolean tipo;
		int numero;
		Random rnd=new Random();
		numero=rnd.nextInt(hasta-desde+1)+desde;
		
		if(numero%2==0) {
			
			tipo=true;
			
		}else {
			tipo=false;
			
		}
		return tipo;
			
	}
	
	public void imprimirParoImpar(boolean tipo) {
		if(tipo) {
		System.out.println("El resultado es par");
		}else {
			System.out.println("El resultado es impar");
		}
	}
	public String generadorChino(String chino[] ){
		
		int desde=0;
		int hasta=2;
		int numero;
		Random rnd=new Random();
		numero=rnd.nextInt(hasta-desde+1)+desde;
		return chino[numero];
		
	}
	public void  imprimirChino(String dato) {
		
		System.out.println("El numero ganador es el "+dato);
		
	}
	public int generarPrimitiva() {
		
		int desde=0;
		int hasta=49;
		int numero;
		Random rnd=new Random();
		numero=rnd.nextInt(hasta-desde+1)+desde;
		return numero;
			
		
	}
	
	public void imprimirPrimitiva(int dato) {
		
		System.out.println("El boleto ganador es "+dato);
	}
}
