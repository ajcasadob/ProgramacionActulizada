package controller;

import model.Dinero;

public class ControllerDinero {

	Dinero d=new Dinero();
	
	//Metodos
	public void restarDinero(int numPaquetes) {
		double euroPaquete=5000;
		double saldoFinal;
		saldoFinal=(d.getSaldo()-numPaquetes*euroPaquete);
		d.setSaldo(saldoFinal);
		
	}
	
}
