package ejerciciotipoexamen;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Trastero> {

	// No natural.
	
	@Override
	public int compare(Trastero o1, Trastero o2) {
		
		if(o1.getPrecio()<o2.getPrecio()) {
			return -1;
		}else {
			if(o1.getPrecio()==o2.getPrecio()) {
				return 1;
			}
			return 0;
		}
		
	}

}
