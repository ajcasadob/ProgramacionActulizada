package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double altura;
		double radio;
		double volumen;
		
		
		
		System.out.println("¿Cuál es la altura del cilindro?");
		altura=Leer.datoDouble();
		System.out.println("¿Cuál es el radio del cilindro?");
		radio=Leer.datoDouble();
		
		Cilindro a1=new Cilindro(radio,altura);
		
		volumen=a1.calcularVolumen();
		
		System.out.printf("El volumen del cilindro es %.2f metros ",volumen);
		
		
		

	}

}
