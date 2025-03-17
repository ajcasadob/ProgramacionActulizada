package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio;
		double area;
		double area2;
		
		
		
		
		
		System.out.println("¿Me podría indicar el radio del circulo?");
		radio=Leer.datoDouble();
		Circulo c1= new Circulo(radio);
		
		area=c1.calculoArea();
		area2=c1.calculoArea2();
		
		System.out.printf("El area del circulo es de %.2f centimetros y %.2f metros ",area,area2);
		
		
	}

}
