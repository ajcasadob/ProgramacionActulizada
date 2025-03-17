package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String planetaUno = "Mercurio";
		String planetaDos = "Venus";
		String planetaTres = "Tierra";
		String planetaCuatro = "Marte";
		String planetaCinco = "Júpiter";
		String planetaSeis = "Saturno";
		String planetaSiete = "Urano";
		String planetaOcho = "Neptuno";
		double pesoCliente=0;
		int opcion;
		double planetaPesoUno = 0.38;
		double planetaPesoDos = 0.91;
		double planetaPesoTres = 1.00;
		double planetaPesoCuatro = 0.38;
		double planetaPesoCinco = 2.53;
		double planetaPesoSeis = 1.06;
		double planetaPesoSiete = 0.92;
		double planetaPesoOcho = 1.2;
		double totalPesoUno=0,totalPesoDos=0,totalPesoTres=0,totalPesoCuatro=0,totalPesoCinco=0,totalPesoSeis=0,totalPesoSiete=0,totalPesoOcho=0;
		

		System.out.println(
				"Bienvenidos, aquí tienes un programa para calcular la equivalencia de tu peso en otros planetas");
		System.out.println("A continuación elige el planeta que desee para calcular su peso:");

		do {

			System.out.printf("\nPulse 1.Planeta %s \nPulse 2.Planeta %s \nPulse 3.Planeta %s \nPulse 4.Planeta %s"
					+ "\nPulse 5.Planeta %s \nPulse 6.Planeta %s \nPulse 7.Planeta %s \nPulse 8.Planeta %s \nPulse 0.Para salir\n"
					+ " ", planetaUno, planetaDos, planetaTres, planetaCuatro, planetaCinco, planetaSeis, planetaSiete,
					planetaOcho);
			opcion = Leer.datoInt();
			
			if(opcion<=8 && opcion>0) {
				System.out.println("¿Por favor podría indicarme su peso?");
				pesoCliente = Leer.datoDouble();
				totalPesoUno=pesoCliente*planetaPesoUno;
				totalPesoDos=pesoCliente*planetaPesoDos;
				totalPesoTres=pesoCliente*planetaPesoTres;
				totalPesoCuatro=pesoCliente*planetaPesoCuatro;
				totalPesoCinco=pesoCliente*planetaPesoCinco;
				totalPesoSeis=pesoCliente*planetaPesoSeis;
				totalPesoSiete=pesoCliente*planetaPesoSiete;
				totalPesoOcho=pesoCliente*planetaPesoOcho;
				
				
			}

			switch (opcion) {

			case 0:
				System.out.println("Gracias por usar este programa");
				break;
				

			case 1:
				System.out.println("El planeta elegido es:" + planetaUno + " \nSu peso en este planeta es: "+totalPesoUno+" kgs");

				break;

			case 2:
				System.out.println("El Planeta elegido es " + planetaDos+" \nSu peso en este planeta es:"+totalPesoDos+" kgs");
				
				break;
			case 3:
				System.out.println("El Planeta elegido es " + planetaTres+" \nSu peso en este planeta es: "+totalPesoTres+" kgs");
				break;
			case 4:
				System.out.println("El Planeta elegido es " + planetaCuatro+" \nSu peso en este planeta es: "+totalPesoCuatro+" kgs");
				break;
			case 5:
				System.out.println("El Planeta elegido es " + planetaCinco+" \nSu peso en este planeta es: "+totalPesoCinco+" kgs");
				break;
			case 6:
				System.out.println("El planeta elegido es " + planetaSeis+" \nSu peso en este planeta es: "+totalPesoSeis+" kgs");
				break;
			case 7:
				System.out.println("El planeta elegido es" + planetaSiete+" \nSu peso en este planeta es: "+totalPesoSiete+" kgs");
				break;
			case 8:
				System.out.println("El planeta elegido es" + planetaOcho+" \nSu peso en este planeta es: "+totalPesoOcho+" kgs");
				break;
			default:
				System.out.println("La opción elegida no esta establecida");
				break;
			}
		} while (opcion != 0);
	
	}

}
