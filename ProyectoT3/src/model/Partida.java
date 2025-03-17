package model;

import java.util.Random;

import datos.DatosPreguntas;
import vista.Imprimir;

public class Partida {
	
	private double dinero;
	private int [] paquetes;
	private double dineroPorPaquete;
	private Pregunta [] preguntas;
	DatosPreguntas dt=new DatosPreguntas();
	Imprimir i;
	private int numAle;
	private int tope;
	private int numPaquetesTotales;
	private boolean acabado;
							
	
	
	//Constructor
	public Partida() {
	}
	
	public Partida(double dinero, int[] paquetes, double dineroPorPaquete, Imprimir i) {
		super();
		this.dinero = dinero;
		this.paquetes = paquetes;
		this.dineroPorPaquete = dineroPorPaquete;
		this.preguntas=dt.getPreguntas();
		this.i = i;
		this.tope=4;
		this.acabado=false;
	}

	//Getter and setter

	

	public double getDinero() {
		return dinero;
	}

	public void setAcabado(boolean acabado) {
		this.acabado = acabado;
	}

	public boolean isAcabado() {
		return acabado;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public int[] getPaquetes() {
		return paquetes;
	}


	public void setPaquetes(int[] paquetes) {
		this.paquetes = paquetes;
	}


	public double getDineroPorPaquete() {
		return dineroPorPaquete;
	}


	public void setDineroPorPaquete(double dineroPorPaquete) {
		this.dineroPorPaquete = dineroPorPaquete;
	}
	
	public Pregunta[] getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Pregunta[] preguntas) {
		this.preguntas = preguntas;
	}
	
	public int getNumAle() {
		return numAle;
	}


	public void setNumAle(int numAle) {
		this.numAle = numAle;
	}

	
	
	//Metodos
	public void iniciarPartida(int contador) {
		
		int hasta;
		int desde;
		
		Random rnd= new Random(System.nanoTime());
		
		this.numPaquetesTotales = (int) (dinero/dineroPorPaquete);
		
		if (contador<4) {
			hasta=10;
			desde=1;
			numAle=rnd.nextInt(hasta-desde-1)+desde;
			i.imprimirPreguntas(paquetes, numAle, acabado);
			System.out.println("Tienes "+numPaquetesTotales+" fajos");
			
		}else if(contador>= 4 && contador<6) {
			hasta=20;
			desde=11;
			numAle=rnd.nextInt(hasta-desde-1)+desde;
			i.imprimirPreguntas(paquetes, numAle, acabado);
			System.out.println("Tienes "+numPaquetesTotales+" paquetes");
			
		}else if(contador>=6) {
			hasta=30;
			desde=21;
			numAle=rnd.nextInt(hasta-desde-1)+desde;
			i.imprimirPreguntas(paquetes, numAle, acabado);
			System.out.println("Tienes "+numPaquetesTotales+" paquetes");
			if(contador>=10){
				comprobarAcabado(contador, tope);
			}
		}
	}		
		
		


	public void comprobarRespuesta(int opcionRespuesta, int numAle, int numPaquetes) {
		String respuestaJugador = null;
		
		respuestaJugador=preguntas[numAle].getRespuesta()[opcionRespuesta-1];

		if(!respuestaJugador.equals(dt.getPreguntas()[numAle].getRespuestaCorrecta())) {
			
			dinero=dinero-(numPaquetes*dineroPorPaquete);

			if(this.dinero<=0){
				this.acabado=true;
			}

		}

		
			
	}
	
	public void comprobarAcabado(int contador, int tope) {
		boolean acabadoPreguntas=false;
		boolean acabadoDinero=false;
		if (contador==10) {
			acabadoPreguntas=true;
		}
		if (getDinero()<=0) {
			acabadoDinero=true;
			
		}
		imprimirAcabado(acabadoDinero, acabadoPreguntas);
	}
	
	public void imprimirAcabado(boolean acabadoDinero, boolean acabadoPreguntas) {
		if (acabadoPreguntas && !acabadoDinero) {
			i.imprimirVictoria();
		}
		if(acabadoDinero) {
			i.imprimirDerrota();
		}
	}
	
	public void continuarPartida(int contador) {
		iniciarPartida(contador);
	}
	
	
}