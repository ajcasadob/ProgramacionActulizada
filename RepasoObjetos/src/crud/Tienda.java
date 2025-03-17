package crud;

import java.util.Arrays;

import model.Producto;

public class Tienda {

	private Producto[] lista;
	private int contadorProducto;

	public Tienda(Producto[] lista, int contadorProducto) {
		super();
		this.lista = lista;
		this.contadorProducto = contadorProducto;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void agregarProducto(Producto p) {
		
		lista[contadorProducto]=p;
		contadorProducto++;
		
	}
	
	public void listaProductosStandart (Producto[] lista) {
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null)
			System.out.println(lista[i]);
		}
		
	}
	
	public Producto buscarProducto(String nombreProductoBuscado) {
		
		int i=0;
		boolean encontrado=false;
		Producto pEncontrado = null;
		while(i<contadorProducto && !encontrado ) {
			if(lista[i].getNombre().equalsIgnoreCase(nombreProductoBuscado)) {
			
			pEncontrado=lista[i];
			encontrado=true;
			
			}
			i++;
		}
		
		return pEncontrado;
		
	}
	
	public Producto cambiarNombre(String nombreProductoBuscado,String nombreNuevo) {
		
		Producto pEncontrado=null;
		
		
		pEncontrado= buscarProducto(nombreProductoBuscado);
		
		if(pEncontrado!=null) {
		pEncontrado.setNombre(nombreNuevo);
		}
		return pEncontrado;
	}
	
	public Producto [] listarPorCategoria(String nombreCategoria) {
		
		/*
		 * Bucle while - Mejor para buscar 1 sola entidad porque lo podemos parar cuando quieras
		 * Bucle do While - para lo menús , porque siempre se ejecuta almenos 1 vez
		 * Bucle for - Para cuando quieras recorrer una lista al completo
		 * */
		
		/*
		 * 1 Identificar el problema - Hecho
		 * 2 Pensar en la solución - Hecho
		 * 		2.1 ¿Qué devolvemos? -> Una lista con los productos que coincidan con la categoría buscada - Hecho
		 * 		2.2 Recopilar datos necesarios -> La categoría , la lista completa - Hecho
		 * 		2.3 Pensar la lógica de la búsqueda - In progress
		 * 			2.3.1 Crear un listado nuevo (nuevaListaBuscada[contadorProd]) - Hecho
		 * 			2.3.2 Recorremos la lista completa buscando los productos por categorías - 
		 * 				  Es la categoría: lo agregamos a la nueva lista (vendría bien un contador nuevo!)
		 * 				  No es la categoría: no agregamos && seguimos recorriendo
		 * 				  Se ha terminado la lista: no agregamos más productos , devolvemos la lista
		 * */
		
		int contadorListaBuscada = 0;
	
		Producto[] nuevaLista = new Producto[contadorProducto];
		
		for (int i = 0; i < this.contadorProducto; i++) {
			
			if(lista[i].getCategoria().equalsIgnoreCase(nombreCategoria)) {
				
				nuevaLista[contadorListaBuscada] = lista[i];
				contadorListaBuscada++;
				
			}
			
		}
		
		return nuevaLista;
		
	}
	
	// quiero hacer inventario -> quiero saber cuando valen todos los productos de mi tienda
	// quiero saber cuando valen solo mis productos de una categoria en concreto
	
	public double sumarTodosLosProductos(Producto[]lista) {
		double result=0;
		for(int i=0;i<contadorProducto;i++) {
			
			result+=lista[i].getPrecio();
		}
		return result;
	}
	
	public double sumarTodosLosProductoDeUnaCategoria(String nombreCategoria) {
		
		
		double total=0;
		Producto[]productosFiltrados=listarPorCategoria(nombreCategoria);
		
		for(int i=0;i<productosFiltrados.length;i++) {
			
			if(productosFiltrados[i]!=null) {
				
				total+=productosFiltrados[i].getPrecio();
			}
		}
		return total;
	}
	
	
}
