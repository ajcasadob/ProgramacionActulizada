package proyecto;

import crud.CrudJugador;
import datos.DatosComodin;
import model.Partida;
import utilidades.Leer;
import vista.Imprimir;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		int opcion=0;
		int respuesta;
		double dineroPuesto=0;
		int opcionRespuesta;
		int numJugadores=0;
		int numRespuestas=4;
		int opcionComodin;
		
		
	
		double dineroInicial=1000000;
		//Preparación partida
		double dinero=1000000;
		double dineroPorPaquete= 25000;
		int [] paquetes= new int[numRespuestas];
		
		//Preparación metodo iniciarPartida
		int contador=0;
		int numPaquetes;
		boolean acabado = false;
		
		
		
		Imprimir i=new Imprimir();
		Partida p=new Partida(dinero, paquetes, dineroPorPaquete, i);
		i.setP(p);
		CrudJugador crd=new CrudJugador();
		DatosComodin dC= new DatosComodin();
		
		//Jugadores
		String nombre1;
		String nombre2;
		

		
		
		i.imprimirBienvenida();
		do {
			i.imprimirMenuPrincipal();
			p.setAcabado(false);
			p.setDinero(dineroInicial);
			acabado = false;
			opcion=Leer.datoInt();
			while(opcion<0 || opcion>6) {
				System.out.println("Opción incorrecta!!\n");
				i.imprimirMenuAtrapa();
				opcion=Leer.datoInt();
			}
			
			switch(opcion) {
				case 1:
					i.imprimirMenuYPortadaAtrapa() ;
					opcion=Leer.datoInt();
					while(opcion<0 || opcion>1) {
						System.out.println("Opción incorrecta!!\n");
						i.imprimirMenuAtrapa();
						opcion=Leer.datoInt();
					}
					if(opcion==1) {
						do {
							p.iniciarPartida(contador);
							System.out.println("Pulsa \n1.Usar comodín \n2.Seguir sin comodín");
							opcionRespuesta=Leer.datoInt();
							
							
							opcionComodin=Leer.datoInt();
							if(opcionComodin==1) {
							
							dC.solicitarVotos();
							}
							System.out.println("¿Cuántos paquetes quieres poner?");
							numPaquetes = Leer.datoInt();
							p.comprobarRespuesta(opcionRespuesta, p.getNumAle(), numPaquetes);
							contador++;

							if(p.isAcabado()){
								i.imprimirDerrota();
								acabado=true;
								contador=0;
							}
							
						} while (acabado!=true);
						break;
						
					}else {
						break;
					}
					
				case 2:
					System.out.println("Dime el nombre del primer jugador");
					nombre1=Leer.dato();
					
					System.out.println("Dime el nombre del segundo jugador");
					break;
					
				case 0:
					
				
				
			}
		} while (opcion!=0);
		
		

		

	}

}