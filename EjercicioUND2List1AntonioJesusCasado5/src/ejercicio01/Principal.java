package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroUno;
		int numeroDos;
		
		System.out.println("Bienvenidos, vamos a determinar cuál de los numero es mayor de ellos");
		System.out.println("Indicame un numero sin decimales");
		numeroUno=Leer.datoInt();
		System.out.println("Indicame un segundo numero");
		numeroDos=Leer.datoInt();
		if (numeroUno>numeroDos) {
			System.out.printf("El numero mayor es %d",numeroUno);
			
			
		}else if(numeroDos>numeroUno){
			System.out.printf("El numero mayor es %d",numeroDos);
		}else {
			
			System.out.println("Ambos numeros son iguales");
		}
		System.out.println("Gracias por usar mi programa");

	}

}
