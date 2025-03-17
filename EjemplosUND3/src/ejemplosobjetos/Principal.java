package ejemplosobjetos;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double res=0.0;
		double res2=0.0;
		//double notas[]= {2,2,3,7};
		int tam;
		Alumno al=new Alumno("Antonio",4,8,"Casado Bayón");
		Secretaria s;
		Secretaria2 s2;
		Alumno2 al2;
		Alumno3 al3=new Alumno3(1,"Antonio");
		double []notas;
		int desde=1,hasta=10;
		Random rnd=new Random(System.nanoTime());
		double media=0;
		
		
		//PEDIMOS EL TAMAÑO
		
		System.out.println("Diga el tamaño");
		tam=Leer.datoInt();
		notas=new double[tam];
		
		//Rellenamos aleatorio
		//Rellenamos aleatorio,¿Deberia estar en el metodo?
	/*	for(int i=0;i<notas.length;i++) {
			
			notas[i]=rnd.nextDouble(hasta-desde+1)-desde;
		}*/
		
		media=al3.calcularMedia(notas);
		System.out.printf("La media es: %.2f",media);
		
		//al3.rellenarNotas(tam, desde, hasta);
		//System.out.println(al3.rellenarNotas(tam, desde, hasta));
		notas=al3.rellenarNotas(tam, desde, hasta);
		
		for(int i=0;i<notas.length;i++) {
			
			System.out.println(notas[i]);
		}
		
		
		
		
		
		//Guardando en una variable
		
		/*res=al.calcularMedia();
		System.out.printf("La media es %.2f",res);
		
		//Imprimiendo directamente
		
		System.out.printf("\nLa media es %.2f",al.calcularMedia());
		
		
		//Usando otra clase, instanciamos un objeto	
		//tipo secretaria
			
		s=new Secretaria("San Pedro",al);
		s2=new Secretaria2(al, "San Pedro");
		
		res2=s2.calcularMediav5(al);
		System.out.printf("\nLa media es %.2f",res2);
		
		
		//Probamos la clase Alumno2, con un array de notas
		//Esto no va aquí, solo para verlos juntos
		
		
		al2=new Alumno2("Antonio",notas);
		System.out.println("\n"+al2.calcularNotaMedia());*/
		
		
	}

}
