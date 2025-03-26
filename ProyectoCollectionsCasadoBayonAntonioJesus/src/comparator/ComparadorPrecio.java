package comparator;

import java.util.Comparator;

import model.Producto;

public class ComparadorPrecio implements Comparator<Producto> {

	@Override
	public int compare(Producto p1, Producto p2) {
        return Double.compare(p1.getPrecio(), p2.getPrecio());
    }
}
