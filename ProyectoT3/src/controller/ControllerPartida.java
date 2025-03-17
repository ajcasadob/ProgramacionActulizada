package controller;

import model.Partida;

public class ControllerPartida {

	Partida p=new Partida();
	
	public void restarDinero(double dinero) {
		double dineroActual;
		dineroActual=dinero;
		p.setDinero(dineroActual);
	}
	
}
