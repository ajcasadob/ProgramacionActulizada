package ejercicio02;

import java.util.List;

public class Club {

	
	private List<Socios> socios;

	public Club(List<Socios> socios) {
		super();
		this.socios = socios;
	}

	public List<Socios> getSocios() {
		return socios;
	}

	public void setSocios(List<Socios> socios) {
		this.socios = socios;
	}

	@Override
	public String toString() {
		return "Club [socios=" + socios + "]";
	}
	
	
}
