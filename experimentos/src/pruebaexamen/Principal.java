package pruebaexamen;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		int desde, hasta,valor[],tam=8,opcion,sumaVotos=0,menor=1000,contador=0,votantesAndaluces=2500000,cambiar,nuevoValor,mayor,indiceProvincia=0;
		double porcentaje=100.0,resultado=0,media=0;
		Random aleatorios=new Random(System.nanoTime());
		
		
		System.out.println("Bienvenidos, hemos creado un partido político, llamado Print en Andalucía y vamos a realizar un recuento de votos");
		System.out.println("Elija la opción que desee:");
	
		String provincias[]= {"Sevilla","Huelva","Cádiz","Granada","Almería","Jaén","Córdoba","Málaga"};
		valor=new int [tam];
		
		do {
			System.out.println("""
					0.Salir 
					1.Asignar votos a cada provincia. 
					2.Mostrar total de votos.
					3.Mostrar provincias con menos de 1000 votos.
					4.Porcentaje total de votos.
					5.Sumar votos a una provincia. 
					6.Calcular media de votos.
					7.Provincia con mas votos.
					""");
			opcion=Leer.datoInt();
		
			switch(opcion) {
				
				case 1:
					System.out.println("Indícame desde donde empezamos a contar");
					desde=Leer.datoInt();
					System.out.println("Y hasta donde debemos contar");
					hasta=Leer.datoInt();
					
					for(int i=0;i<valor.length;i++) {
						
						valor[i]=aleatorios.nextInt(hasta-desde+1)+desde;
					}
					
					for(int i=0;i<provincias.length;i++) {
						
						System.out.print(provincias[i]+"\t\t");
					}
					System.out.println("\n");
					for(int i=0; i<valor.length;i++) {
						
						System.out.print(valor[i]+"\t\t");
						
					}
					
					break;
					
				case 2:
					sumaVotos=0;
					for(int i=0;i<valor.length;i++) {
						
						sumaVotos+=valor[i];
						
						
						
					}
					System.out.println(sumaVotos);
					
					break;
			
				case 3:
					
					
					for(int i=0;i<valor.length;i++) {
						
						if(valor[i]<menor) {
							contador++;
						}
					}
					System.out.println("El numero de provincia con menos de 1000 votos es "+contador);
					contador=0;
					break;
					
				case 4:
					
					for(int i=0;i<valor.length;i++) {
						
						resultado=sumaVotos*porcentaje/(double)votantesAndaluces;
						
					}
					System.out.printf("La cantidad de votos contados han sido %.2f %%",resultado);
					break;
					
				case 5:
					
					System.out.println("¿Qué provincia quieres sumar votos, elige del 1 al 8");
					cambiar=Leer.datoInt();
					System.out.println("¿Qué cantidad de votos quieres añadir?");
					nuevoValor=Leer.datoInt();
					
					valor[cambiar-1]+=nuevoValor;
					
					System.out.println("La provincia cambiada es: " + provincias[cambiar-1] + " con un total de votos de: " + valor[cambiar-1]);
					
					for(int i=0;i<provincias.length;i++) {
						
						System.out.print(provincias[i]+"\t\t");
					}
					System.out.println("\n");
					for(int i=0; i<valor.length;i++) {
						
						System.out.print(valor[i]+"\t\t");
						
					}
					
					break;
					
						case 6:
							sumaVotos=0;
							for(int i=0;i<valor.length;i++) {
								
								sumaVotos+=valor[i];
								
								
								
							}
								
								media=sumaVotos/valor.length;
								
							
							System.out.printf("La media de votos es de %.2f",media);
							break;
							
						case 7:
							mayor=valor[0];
							
							for(int i=0;i<valor.length;i++) {
								
								if(mayor<valor[i]) {
									
								mayor=valor[i];
								indiceProvincia=i;
								}
							}
							System.out.println("La provincia con mayor numero de votos es "+provincias[indiceProvincia]+" con un total de "+mayor+ " votos");
							
							break;
							
							default:
								System.out.println("Opción incorrecta, pulse una opción válida");
								break;
					
					
				
					
			
			}
			
			
			
			
		}while(opcion!=0);
		
		
		
		
		
		
		
		

	}

}
