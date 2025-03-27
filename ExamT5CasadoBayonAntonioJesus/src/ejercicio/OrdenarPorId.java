package ejercicio;

import java.util.Comparator;

public class OrdenarPorId  implements Comparator<Mensaje>{

	@Override
	public int compare(Mensaje m1, Mensaje m2) {
		
		return Integer.compare(m1.getId(), m2.getId());
	}

}
