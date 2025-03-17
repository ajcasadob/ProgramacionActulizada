package crud;

import model.Partida;

public class CrudPartida {
	
	private Partida p;
	
	
	
	public CrudPartida(Partida p) {
		super();
		this.p = p;
	}



	public void modificarPaquetes(int opcionRespuesta, int numPaquetes) {
		p.getPaquetes()[0]=4;
	}

}
