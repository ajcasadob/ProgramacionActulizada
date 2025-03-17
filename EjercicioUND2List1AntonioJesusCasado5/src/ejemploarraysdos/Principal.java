package ejemploarraysdos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int tam,op,buscar;
		int edades[];
		
		
		System.out.println("Diga numero de alumnos");
		tam=Leer.datoInt();
		edades=new int [tam];
		
		//PARA RELLENAR POR TECLADO
				for(int i=0; i<edades.length;i++) {
				  
					System.out.println("Dime la edad");
					edades[i]=Leer.datoInt();
					
				}
				
				
				//PARA IMPRIMIR
			    for(int e =0; e<edades.length; e++) {
					
					System.out.println(edades[e]+"\t");
					
				}
			    
			  //  for(int aux:edades) {
			    //	System.out.print(aux+"\t");
			    	
			    //}
			    //PARA BUSCAR
			    //POR INDICE(REGULINCHIS)
			    
			    System.out.println("\nDiga el elemento que quiere buscar");
			    op=Leer.datoInt();
			    //HAY VARIAS POSIBILIDADES
			    System.out.println(edades[op-1]);
			    
			    System.out.println("Diga usted la edad que quiere buscar");
			    buscar=Leer.datoInt();
			    
			    //CUANTOS MENORES DE EDAD HAY EN LA CLASE
			    
			  
			    
		
		
		

	}

}
