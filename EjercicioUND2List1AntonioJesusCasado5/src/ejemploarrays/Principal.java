package ejemploarrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Declarando arrays de las 3 formas posibles*/
		
		//Forma 1: Líneas distintas
		int tam;
		int edades[];
		
		
		System.out.println("Diga numero de alumnos");
		tam=Leer.datoInt();
		
		edades=new int [tam];
		
		
		//Forma 2: En la misma línea
		//Antes de esta línea tengo que conocer el tamaño
		
		int edades2[]=new int [tam];
		
		
		//Forma 3: Inicializando con valores
		
		int edades3[]= {23,43,33,56};
		
		//imprimir un valor
		//PARA ARRAYS SIEMPRE USAMOS FOR
		//SIEMPRE VAMOS A USAR .LENGTH PARA ACABAR
		
		//System.out.println("El valor es : "+edades3[2]);
		//edades3[1]=42;
		//System.out.println("El nuevo valor es: "+edades3[1]);
		
		for(int i=0; i<edades3.length;i++) {
			
		System.out.print(edades3[i]+"\t");
		
	}
		//PARA RELLENAR POR TECLADO
		for(int i=0; i<edades.length;i++) {
		  
			System.out.println("Dime la edad");
			edades[i]=Leer.datoInt();
			
		}
		
		
		//PARA IMPRIMIR
	    for(int i =0; i<edades.length; i++) {
			
			System.out.println(edades[i]);
			
		}
		
		
		
	
	}
}
