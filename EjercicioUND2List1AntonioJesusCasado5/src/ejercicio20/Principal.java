package ejercicio20;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String saldo = "Ver Saldo", retirar = "Retirar Dinero", comprar = "Comprar Entradas",
				ingresar = "Ingresar Dinero", acabar = "Salir";
		double saldoInicial = 80000, retirarDinero, entrada = 50.0, precioEntrada = 0, ingresoDinero;
		int opcion, cantidad;

		do {
			System.out.println("Bienvenidos, vamos a realizar un cajero automatico:");
			System.out.printf("\nElija la opcion deseada:\n0. %s \n1. %s \n2. %s \n3. %s \n4. %s\n", acabar, saldo,
					retirar, comprar, ingresar);
			opcion = Leer.datoInt();

			switch (opcion) {

			case 0:
				System.out.println("Gracias por su visita");
				break;
			case 1:
				System.out.printf("Su saldo es de %.2f €", saldoInicial);
				break;
			case 2:
				System.out.println("¿Cuanto dinero desea retirar?");
				retirarDinero = Leer.datoDouble();
				if (retirarDinero > saldoInicial) {
					System.out.println("Saldo insuficiente");

				} else {
					saldoInicial -= retirarDinero;
					System.out.printf("Su saldo actual ahora es de %.2f €", saldoInicial);
				}
				break;
			case 3:
				System.out.printf("El precio de cada entrada es de %.2f €\n", entrada);
				System.out.println("¿Cuántas unidades desea?");
				cantidad = Leer.datoInt();
				if (precioEntrada > saldoInicial) {
					precioEntrada = cantidad * entrada;
					saldoInicial -= precioEntrada;
					System.out.println("Saldo insuficiente");
				} else {
					System.out.printf("Su saldo actual es de %.2f €\n", saldoInicial);
				}

				break;
			case 4:
				System.out.println("¿Cuánto dinero desea ingresar?");
				ingresoDinero = Leer.datoDouble();
				saldoInicial += ingresoDinero;
				System.out.printf("Su saldo actual es de %.2f €\n", saldoInicial);
				break;
			default:
				System.out.println("La opción elegida no esta establecida");
				break;

			}
		} while (opcion != 0);

	}

}
