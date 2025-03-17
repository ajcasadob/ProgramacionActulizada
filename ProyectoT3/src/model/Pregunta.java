package model;
import java.util.Arrays;
public class Pregunta {
	
	private String Enunciado;
	private String [] Respuesta;
	private String respuestaCorrecta;
	private int dificultad;
	private int paquetes;
	


	//Constructor
	public Pregunta(String enunciado, String[] respuesta, String respuestaCorrecta, int dificultad) {
		super();
		Enunciado = enunciado;
		Respuesta = respuesta;
		this.setRespuestaCorrecta(respuestaCorrecta);
		this.dificultad = dificultad;
	}


	//Getter and setter
	public String getEnunciado() {
		return Enunciado;
	}
	public void setEnunciado(String enunciado) {
		Enunciado = enunciado;
	}
	public String[] getRespuesta() {
		return Respuesta;
	}
	public void setRespuesta(String[] respuesta) {
		Respuesta = respuesta;
	}
	
	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}


	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	
	public int getPaquetes() {
		return paquetes;
	}


	public void setPaquetes(int paquetes) {
		this.paquetes = paquetes;
	}
	
	
	//To string
	@Override
	public String toString() {
		return "Pregunta [Enunciado=" + Enunciado + ", Respuesta=" + Arrays.toString(Respuesta) + "]";
	}


	

	
}
