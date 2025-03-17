package ejercicio02;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorios = new Random();

		int valor[] = new int[10];
		int desde, hasta, numMulti,elementoCambio,nuevoElemento,opcion;

		System.out.println("Bienvenidos, vamos a realizar un programa de arrays");
		System.out.println("Desde que numero quieres empezar");
		desde = Leer.datoInt();
		System.out.println("Hasta que numero quieres llegar");
		hasta = Leer.datoInt();
		

		do {
		
		for (int i = 0; i < valor.length; i++) {

			valor[i] = aleatorios.nextInt(hasta - desde + 1) + desde;
		}

		for (int i = 0; i < valor.length; i++) {

			System.out.println(valor[i]);

		}
		System.out.println("Elige la opcion deseada\n0.Salir\n1.Volver a multiplicar\n2.Cambiar otro valor\n");
		opcion=Leer.datoInt();
		
		switch(opcion) {
		case 0:
			System.out.println("Saliendo..");
		
		case 1:
		System.out.println("¿Que numero quieres multiplicar por 2?");
		numMulti = Leer.datoInt();

		
		for (int i = 0; i < valor.length; i++) {

			valor[i] = numMulti * 2;

		}
		for (int i = 0; i < valor.length; i++) {

			System.out.println(valor[i]);

		}
		break;
		case 2:
		System.out.println("¿Qué elemento de la lista quieres cambiar?");
		elementoCambio=Leer.datoInt();
		System.out.println("Digame el nuevo elemento que quieres introducir");
		nuevoElemento=Leer.datoInt();
		
		valor[elementoCambio-1]=nuevoElemento;
		
		for(int i=0;i<valor.length;i++) {
			
			System.out.println(valor[i]);
			
		}
		break;
		default:
			System.out.println("Opcion incorrecta");
			break;
		}
		}while(opcion!=0);
		
		
		

	}

}
