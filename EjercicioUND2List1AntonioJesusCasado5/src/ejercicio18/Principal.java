package ejercicio18;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double totalHoras = 0;
		int precioHora, opcion;
		int topeDeHoras = 40;
		double pago, horasExtras, gananciasExtras, gananciasNormales, gananciasTotales;
		int precioHoraExtra;
		
		do {
			System.out.println("""
					Elije la opcion deseada:
					1.Para continuar
					0.Para salir
					""");
			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:
				System.out.println("¿Me podría indicar cuánto cobra la hora normal?");
				precioHora = Leer.datoInt();
				System.out.println("¿Me podría indicar cuánto cobra la hora extra?");
				precioHoraExtra = Leer.datoInt();

				for (int i = 0; i <= 6; i++) {

					System.out.println("Indique cuantas horas a trabajado: día " + (i + 1));
					totalHoras += Leer.datoDouble();

				}

				if (totalHoras <= topeDeHoras) {
					pago = totalHoras * precioHora;
					System.out.println("El obrero ha cobrado en " + totalHoras + " horas " + pago + "€");

				} else { // +40
					// primero calculamos cuantas horas extra he trabajado
					// calculamos cuanto hemos ganado en esas horas
					// le sumamos esa ganancia de horas extra a la ganancia por horas normales

					// totalHoras y topeDeHoras
					horasExtras = totalHoras - topeDeHoras;
					gananciasExtras = horasExtras * precioHoraExtra;
					gananciasNormales = topeDeHoras * precioHora;
					gananciasTotales = gananciasNormales + gananciasExtras;
					System.out.println("El obrero ha realizado un total de " + totalHoras + " horas y ha cobrado "
							+ gananciasTotales + "€");
				}
				break;

			case 0:
				System.out.println("Saliendo..");
				break;
			default:
				System.out.println("opción no comprendida");
				break;

			}
		} while (opcion != 0);
	}
}
