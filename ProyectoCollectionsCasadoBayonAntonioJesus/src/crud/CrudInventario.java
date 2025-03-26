package crud;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import comparator.ComparadorPrecio;
import model.Producto;

public class CrudInventario {
	
	private List<Producto> productos;

    public CrudInventario(List<Producto> productos) {
    	
        this.productos = productos;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(int id) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    public Producto buscarProducto(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public void ordenarPorPrecio() {
        Collections.sort(productos, new ComparadorPrecio());
    }

    public void mezclarProductos() {
        Collections.shuffle(productos);
    }

    public Producto obtenerMasCaro() {
        return Collections.max(productos, new ComparadorPrecio());
    }

    public Producto obtenerMasBarato() {
        return Collections.min(productos, new ComparadorPrecio());
    }

    public void invertirLista() {
        Collections.reverse(productos);
    }

}
