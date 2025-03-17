package ejemplosaarayaleatorio;

import utilidades.Leer;

import java.util.Random;
import java.util.random.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int tam,hasta,desde,buscado,aluTam,aCambiar,nuevaEdad;
		int edades[];
		int contador=0;
		int suma=0;
		double media=0;
		
		
		Random r=new Random(System.nanoTime());
		
		
		
		System.out.println("Diga tamaño");
		tam=Leer.datoInt();
		
		edades=new int [tam];
		
		//RELLENAR CON ALEATORIOS
		//NO PONER PARENTESIS
		
		System.out.println("Diga el menor generado");
		desde=Leer.datoInt();
		
		System.out.println("Diga el mayor generado");
		hasta=Leer.datoInt();
		
		for(int i=0; i<edades.length; i++) {
			
			
			edades[i]=r.nextInt(hasta-desde+1)+desde;
			
		}
		for(int valor:edades) {
			System.out.print(valor+"\t");
		}
		
		/*System.out.println("\n¿Qué numero quieres buscar?");
		buscado=Leer.datoInt();
		
		for(int i=0; i<edades.length;i++) {
			
			if(edades[i]==buscado) 
				
				contador++;
				
			
			
		}*/
		
		//PARA CALCULAR LA MEDIA
		
		for(int i=0; i<edades.length;i++) {
			
			suma+=edades[i];
			
		}
		media=suma/edades.length;
		
		//PARA HACER UNA TABLA
		
	for(int i=0; i<edades.length;i++) {
		System.out.print("alumno "+(i+1)+"\t");
		
	}
     System.out.println();
     for(int i=0; i<edades.length;i++) {
    	 System.out.print(" "+edades[i]+"\t\t");
    	 
     }
     
     //PARA CAMBIAR UN VALOR
     System.out.println("\n¿Qué elementos quiere cambiar?");
     aCambiar=Leer.datoInt();
     System.out.println("\nDia la nueva edad");
     nuevaEdad=Leer.datoInt();
     
     edades[aCambiar-1]=nuevaEdad;
	}

}
