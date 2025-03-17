package ejercicio1;

import java.util.Arrays;

public class Tienda {

	private Producto lista[];//No se instancia aquí

	public Tienda(Producto[] lista) {
		super();
		this.lista = lista;
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
	
	
	public void listarTodos() {
		
		for(int i=0;i<lista.length;i++) {
			if(lista[i]!=null) {
			System.out.println(lista[i]);
			}
		}
	}
	
	public boolean comprobarFragil(int id, int numProductos) {
		
		boolean fragil=false,encontrado=false;
		
		for(int i=0;i<numProductos&& !encontrado;i++) {
			
			if(lista[i].getId()==id) {
				fragil=lista[i].isFragil();
				encontrado=true;
			}
			
		}
		return fragil;
	}
	
	public void imprimirFragil(int id, int numProducto) {
		
		if(comprobarFragil(id,numProducto)) {
			
			System.out.println("Es fragil");
			
		}else {
			
			System.out.println("No es fragil");
		}
			
		
	}
	
	public void agregarProductos(Producto p, int numProductos) {
		
		lista[numProductos]=p;
		
	}
	
	
	
}
