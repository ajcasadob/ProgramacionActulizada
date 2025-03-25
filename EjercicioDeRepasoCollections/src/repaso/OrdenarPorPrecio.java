package repaso;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Trastero> {

	@Override
	public int compare(Trastero o1, Trastero o2) {
		if(o1.getPrecio()<o2.getPrecio()) {
			return -1;
		}else {
			if(o1.getPrecio()>o2.getPrecio()) {
				return -Double.compare(o1.getPrecio(), o2.getPrecio());
			}
		}
		return 1;
	}

}
