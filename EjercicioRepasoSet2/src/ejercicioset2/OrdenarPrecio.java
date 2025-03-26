package ejercicioset2;

import java.util.Comparator;

public class OrdenarPrecio implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		
		return Double.compare(v1.getPriceDay(), v2.getPriceDay());
	}

}
