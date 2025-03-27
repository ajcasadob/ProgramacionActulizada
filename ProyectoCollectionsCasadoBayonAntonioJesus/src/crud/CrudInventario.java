package crud;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Objects;

import comparator.ComparadorPrecio;

import model.Producto;

public class CrudInventario {
	
	private List<Producto> productos;

    

    public CrudInventario(List<Producto> productos) {
		super();
		this.productos = productos;
	}
    

	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(productos);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrudInventario other = (CrudInventario) obj;
		return Objects.equals(productos, other.productos);
	}


	public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public Producto buscarProductoPorId(int id) {
    	
    	for(Producto p : productos) {
    		
    		if(p.getId()==id) {
    			return p;
    		}
    	}
    	return null;
    }
    public void eliminarUnProducto(int id) {
    	
    	productos.remove(buscarProductoPorId(id));
    }
    
    public void listarProductos() {
    	for (Producto p : productos) {
    		
    		System.out.println(p);
			
		}
    }
    public List<Producto> ordenarPorNombre(){
    	List<Producto> newList = new ArrayList<Producto>(productos);
    	
    	
    	Collections.sort(newList);
    	return newList;
    }
    
    public List<Producto> ordenarPorPrecioList (){
    	
    	List<Producto> newList = new ArrayList<Producto>(productos);
    	
    	Collections.sort(newList, new ComparadorPrecio());
    	
    	return newList;
    }
    public List<Producto> mezclarProductos(){
    	List<Producto> newList = new ArrayList<Producto>(productos);
    	
    	Collections.shuffle(newList);
    	return newList;
    }
    
    public List<Producto> obtenerProductosMasCaro(){
    	
    	List<Producto> productosCarosList = new ArrayList<Producto>();
    	double precioMax=0.0;
    	for(Producto p : productos) {
    		if(p.getPrecio()>precioMax) {
    			
    			precioMax = p.getPrecio();
    		}
    		
    	}
    	for(Producto p : productos) {
    		
    		if(p.getPrecio()==precioMax) {
    			productosCarosList.add(p);
    		}
    	}
    	return productosCarosList;
    }
    
    public List<Producto> obtenerProductosBaratos (){
    	
    	List<Producto> productoBaratosList = new ArrayList<Producto>();
    	
    	double precioMin=0;
    	
    	for(Producto p : productos) {
    		if(p.getPrecio()<precioMin) {
    			precioMin = p.getPrecio();
    		}
    	}
    	for(Producto p : productos) {
    		if(p.getPrecio()==precioMin) {
    			productoBaratosList.add(p);
    		}
    	}
    	return productoBaratosList;
    }
    public List<Producto> invertirListaProductos (){
    	
    	List<Producto> listaInvertidaList = new ArrayList<Producto>(productos);
    	
    	Collections.reverse(listaInvertidaList);
    	return listaInvertidaList;
    	
    	
    	
    }

}
