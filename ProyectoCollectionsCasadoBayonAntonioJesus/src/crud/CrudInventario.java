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


	//Metodo para agregar nuevos productos
	public void agregarProducto(Producto p) {
        productos.add(p);
    }
	//Metodo para buscar un producto por ID
    public Producto buscarProductoPorId(int id) {
    	
    	for(Producto p : productos) {
    		
    		if(p.getId()==id) {
    			return p;
    		}
    	}
    	return null;
    }
    //Metodo para eliminar un producto
    public void eliminarUnProducto(int id) {
    	
    	productos.remove(buscarProductoPorId(id));
    }
    //Listamos la lista de productos
    public void listarProductos() {
    	for (Producto p : productos) {
    		
    		System.out.println(p);
			
		}
    }
    //Metodo para ordenar por nombre, nos devuelve una nueva lista ordenada por orden alfabetico
    public List<Producto> ordenarPorNombre(){
    	List<Producto> newList = new ArrayList<Producto>(productos);
    	
    	
    	Collections.sort(newList);
    	return newList;
    }
    //Metodo para ordenar por precio, nos devuelve una lista de productos ordenadas de menor a mayor
    public List<Producto> ordenarPorPrecioList (){
    	
    	List<Producto> newList = new ArrayList<Producto>(productos);
    	
    	Collections.sort(newList, new ComparadorPrecio());
    	
    	return newList;
    }
    //Nos devuelve una lista mezclada de productos
    public List<Producto> mezclarProductos(){
    	List<Producto> newList = new ArrayList<Producto>(productos);
    	
    	Collections.shuffle(newList);
    	return newList;
    }
    
    //Buscamos producto por precio
    public List<Producto> buscarProductosPorPrecio(double precio){
    	List<Producto> newList = new ArrayList<>();
    	
    			for(Producto p : productos) {
    				if(p.getPrecio()==precio) {
    					newList.add(p);
    				}
    				
    			}
    			return newList;
    }
  //Obtenemos el producto mas caro
    public List<Producto> obtenerProductosMasCaro(){
    	
    	
    	double precioMax=productos.getFirst().getPrecio();
    	
    		for(Producto p : productos) {
    			if(p.getPrecio()>precioMax) {
    				
    				precioMax = p.getPrecio();
    			}
    		}
    		return buscarProductosPorPrecio(precioMax);
    
    }
    
    
    
    //Obtenemos los productos mas baratos
    public List<Producto> obtenerProductosBaratos (){
    	double precioMin =productos.getFirst().getPrecio();
    	
    		for(Producto p : productos) {
    			if(p.getPrecio()<=precioMin) {
    				precioMin = p.getPrecio();
    			}
    		}
    	return buscarProductosPorPrecio(precioMin);
    }
    //Invertimos y devolvemos una nueva lista
    public List<Producto> invertirListaProductos (){
    	
    	List<Producto> listaInvertidaList = new ArrayList<Producto>(productos);
    	
    	Collections.reverse(listaInvertidaList);
    	return listaInvertidaList;
    	
    	
    	
    }

}
