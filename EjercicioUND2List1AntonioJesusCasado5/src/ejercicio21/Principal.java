package ejercicio21;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String suma = "Sumar", resta = "Restar", multiplicacion = "Producto", dividi = "Dividir",
				resultadoNum = "Comprobar si es par o impar", salida = "Salir";
		int opcion, numeroComprobar;
		double numUno, numDos, numResultado;

		System.out.println("Bienvenidos, vamos a relizar una mini calculadora.");
		System.out.println("Elija la opción que quiéra realizar:");

		do {

			System.out.printf("Pulse 1. %s\nPulse 2. %s\nPulse 3. %s \nPulse 4. %s\nPulse 5. %s\nPulse 6. %s\n", suma,
					resta, multiplicacion, dividi, resultadoNum, salida);
			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:
				System.out.println("Indique el primer numero:");
				numUno = Leer.datoDouble();
				System.out.println("Indique el segundo numero:");
				numDos = Leer.datoDouble();
				numResultado = numUno + numDos;

				System.out.printf("La suma de ambos numero es %.2f\n", numResultado);
				break;
			case 2:
				System.out.println("Indique el primer numero:");
				numUno = Leer.datoDouble();
				System.out.println("Indique el segundo numero:");
				numDos = Leer.datoDouble();
				numResultado = numUno - numDos;
				System.out.printf("La resta de ambos numero es %.2f\n", numResultado);
				break;
			case 3:
				System.out.println("Indique el primer numero:");
				numUno = Leer.datoDouble();
				System.out.println("Indique el segundo numero:");
				numDos = Leer.datoDouble();
				numResultado = numUno * numDos;
				System.out.printf("La multiplicación de ambos numero es %.2f\n", numResultado);
				break;
			case 4:
				System.out.println("Indique el numerador:");
				numUno = Leer.datoDouble();
				System.out.println("Indique el denominador:");
				numDos = Leer.datoDouble();
				numResultado = numUno / numDos;

				if (numDos == 0) {
					System.out.println("Error, elija un denominador mayor que 0\n");

				} else
					numResultado = numUno / numDos;
				System.out.printf("El resultado de la división es %.2f\n", numResultado);

				break;

			case 5:
				System.out.println("Indique un numero entero para comprobar:");
				numeroComprobar = Leer.datoInt();
				if (numeroComprobar % 2 == 0) {

					System.out.printf("El numero %d es par\n", numeroComprobar);

				} else
					System.out.printf("El numero %d es impar\n", numeroComprobar);

				break;

			case 6:
				System.out.println("Saliendo..");
				break;
			default:
				System.out.println("La opción elegida no esta establecida");
				break;

			}

		} while (opcion != 6);

	}

}
