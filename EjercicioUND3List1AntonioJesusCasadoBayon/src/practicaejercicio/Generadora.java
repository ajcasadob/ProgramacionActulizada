package practicaejercicio;

import java.util.Random;

public class Generadora {

	public void menu() {

		System.out.println("0.Salir\n1.Resultado quinela\n2.Jugar pares o nones\n3.Jugar a "
				+ "los chinos\n4.Sorteo de la primitiva\n");

	}

	public int generadorQuinela() {
		int numero, hasta = 2, desde = 0;
		Random rnd = new Random();
		numero = rnd.nextInt(hasta - desde + 1) + desde;
		return numero;

	}

	public void imprimirQuinela(int numero) {

		System.out.println("El numero ganador de la quinela es " + numero);

	}
	
	public boolean generadorPoSne() {
		int desde= 0, hasta=10, numero;
		boolean pn;
		Random rnd=new Random();
		numero=rnd.nextInt(hasta-desde+1)+desde;
		
		if(numero%2==0) {
			
			pn=true;
			
		}else {
			pn=false;
		}
		return pn;
	}
		public void imprimirPosne(boolean pn) {
			
			if(pn) {
				System.out.println("El resultado es PAR");
				
			}else {
				System.out.println("El resultado es IMPAR");
			
		}
		
		}
		public int generarChino() {
			int numero, hasta=2, desde=0;
			Random rnd=new Random();
			numero=rnd.nextInt(hasta-desde+1)+desde;
			return numero;
		}
		public void imprimirChino(int numero) {
			
			System.out.println("El número ganador es "+numero+ " enhorabuena.");
		}
		
		public int generadorPrimitiva() {
			
			int numero, hasta=49,desde=1;
			Random rnd=new Random ();
			numero=rnd.nextInt(hasta-desde+1)+desde;
			return numero;
			
			
		}
		public void imprimirPrimitiva(int a) {
			
			System.out.print(a+"\t");
		}
}
