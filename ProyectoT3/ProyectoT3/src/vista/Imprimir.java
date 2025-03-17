package vista;

import java.util.Random;

import datos.DatosPreguntas;

public class Imprimir {
	
	DatosPreguntas dt=new DatosPreguntas();
	
	//Constructor
	public Imprimir() {
		super();
	}

	//Metodos
	public void mostrarDinero(int numPaquetes) {
		double euroPaquete=5000;
		System.out.println(numPaquetes*euroPaquete);
	}
	
	public void imprimirBienvenida() {
		System.out.println("""
				=======================================================================
				|  W           W EEEEEEEE L      CCCCCCCC OOOOOOO  M      M  EEEEEEE  |
				|   W         W  E        L      C        O     O  M M  M M  E        |
				|    W	 W   W   EEEE     L      C        O     O  M  MM  M  EEEE     |
				|     W W W W    E        L      C        O     O  M      M  E        |
				|      W   W     EEEEEEEE LLLLLL CCCCCCCC OOOOOOO  M      M  EEEEEEE  |
				=======================================================================	   
				""");
	}
	
	
	public void imprimirMenuPrincipal() {
		System.out.println("""
				0. Salir
				1. Entrar al juego
				2. Meter jugadores
				3. Modificar jugadores
				4. Eliminar jugador
				5. Buscar un jugador
				6. Listar jugadores
				""");
	}
	
	
	public void imprimirMenuAtrapa(){
		System.out.println("""
				==============================================
				0.Salir
				1.Jugar
				==============================================
				""");
	}
	
	public void imprimirMenuYPortadaAtrapa() {
		System.out.println("""
		      +----------------------------------------------------------+
        |                                                          |
        |     AA    TTTTTTT  RRRRR     AA     PPPPP     AA         |
        |    A  A      T     R   R    A  A    P   P    A  A        |
        |   AAAAAA     T     R  R    AAAAAA   PPPPP   AAAAAA       |
        |  A      A    T     R    R A      A  P      A      A      |
        |                                                          |
        |                   U   U N    N                           |
        |                   U   U N N  N                           |
        |                   U   U N  N N                           |
        |                   UUUUU N   NN                           |
        |                                                          |
        |                                  //                      |
        |       MM  MM  IIIII L    L    OOOOOO N    N              |
        |       M MM M    I   L    L    O    O N N  N              |
        |       M    M    I   L    L    O    O N  N N              |
        |       M    M  IIIII LLLL LLLL OOOOOO N   NN              |
	       +----------------------------------------------------------+
			""");
		System.out.println("""
				==============================================
				0.Salir
				1.Jugar
				==============================================
				""");

	}
	
	
	public void imprimirPreguntas() {
		Random rnd= new Random(System.nanoTime());
		int hasta, desde;
		int numAle;
		int numRespuestas=4;
		int tope;
		int contador=0;
		boolean acertada=false;
		do {
			tope=3;
			hasta=10;
			desde=1;
			numAle=rnd.nextInt(hasta-desde-1)+desde;
			System.out.println(dt.getPreguntas()[numAle].getEnunciado());
			for(int i=0; i<numRespuestas;i++) {
				System.out.printf((i+1)+". "+dt.getPreguntas()[numAle].getRespuesta()[i]+"\t\t");
			}
		} while (contador<tope && acertada!=false);
		
		
		
				
				
	}

}
