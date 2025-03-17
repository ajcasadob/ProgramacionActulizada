package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		 String nombre="";
		 String curso="";
		 
		 int numSuspensos=0,opcion,tam;
		 double notaMedia=0;
		
		double notas[];
		Alumno al=new Alumno(nombre,curso,numSuspensos,notaMedia);
		GestionNotas gn=new GestionNotas(al);
		
		
		System.out.println("Bienvenidos, con este programa podremos calcular las notas de los alumnos");
		do {
			
			System.out.println("""
			0.Salir
			1.Introducir nombre
			2.Introducir las notas
			3.Mostrar las notas del alumno
			4.Modificar una nota
			5.Calcular la media
			6.Numeros de suspensos		
					""");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 0:
				
					System.out.println("Saliendo...");
					break;
				
				case 1:
					
					System.out.println("¿Que curso esta cursando el alumno?");
					al.setCurso(Leer.dato());
					System.out.println("¿Me podría indicar el nombre del alumno?");
					al.setNombre(Leer.dato());
					
					break;
				case 2:
					System.out.println("¿Cuántas notas quieres introducir?");
					tam=Leer.datoInt();
					notas=new double[tam];
					for(int i=0;i<notas.length;i++){
						
						System.out.println("Introduce la nota "+(i+1));
						notas[i]=Leer.datoDouble();
					}
					al.setNotas(notas);
					break;
				case 3:
					
					al.mostrarNotas();
					
					break;
					
				case 4:
					
					System.out.println("¿Qué posición ");
					break;
					
				case 5:
					
					gn.calcularMedia();
					System.out.println(al.getNotaMedia());
					break;
					
				case 6:
					System.out.println("El alumno:"+al.getNombre());
					System.out.println("Qué esta en la clase:"+al.getCurso());
					System.out.println("Tiene un total de : "+gn.contarSuspensos());
					break;
					default:
						System.out.println("Elija una opción validad");
						break;
			}
			
			
		
		
		
		
		
		
		
		
		
		}while(opcion!=0);
		
		
		
		
	}

}
