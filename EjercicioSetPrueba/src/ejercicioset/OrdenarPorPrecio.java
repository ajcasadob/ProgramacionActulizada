package ejercicioset;

import java.util.Comparator;

public class OrdenarPorPrecio implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
			
			if(o1.getPrecioDia()<o2.getPrecioDia()) {
				return -1;
			}else {
				if(o1.getPrecioDia()>o2.getPrecioDia()) {
					return 1;
			}
				
		
	}
			return 0;	
	}
}
