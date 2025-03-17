package ejercicio01;

import java.util.Arrays;

public class Tienda {

	
	private Producto lista[];
	

	public Tienda(Producto[] lista) {
		super();
		this.lista = lista;
	}

	
	

	public Tienda() {
		super();
		
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

	public void agregarProductos(Producto p, int numProductos) {
		
		lista[numProductos]=p;
		
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
		
		for(int i=0;i<numProductos && !encontrado;i++) {
			
			if(lista[i].getId()==id) {
				fragil=lista[i].isFragil();
				encontrado=true;
			}
			
		}
		return fragil;
	
	}
	
	public Producto buscarPorNombre(String nombre, int numProductos) {
		
		boolean encontrado=false;
		Producto pEncontrado=null;
		
		for(int i=0; i<numProductos && !encontrado; i++) {
			
			if(lista[i].getNombre().equalsIgnoreCase(nombre)) {
				encontrado=true;
				pEncontrado=lista[i];
			}
			
		}
		return pEncontrado;
	}
	
	public double calcularPVP(Producto p , double porcentaje) {
		
		double pvp = 0 , cien = 100;
		double pvpFinal=0;
		
		pvp = p.getPrecioFab()*porcentaje/cien;
		pvpFinal=pvp+p.getPrecioFab();
		return pvpFinal;
	}
	
	public String buscarPorId (int id, int numProductos) {
		
		boolean encontrado=false;
		String nombre="";
		for(int i=0;i<numProductos && !encontrado;i++) {
			
			if(lista[i].getId()==id) {
				encontrado=true;
				nombre=lista[i].getNombre();
			}
		}
		
		return nombre;
	}
	
	public void imprimirFragil(int id, int numProducto) {
		
		if(comprobarFragil(id,numProducto)) {
			
			System.out.println("Es fragil");
			
		}else {
			
			System.out.println("No es fragil");
		}
}
	
	public double calcularCantidadInvertida(int numProducto) {
		double total=0;
		for(int i=0; i<numProducto;i++) {
			
			total+=lista[i].getPrecioFab();
		}
		return total;
	}
	
	public double calcularGanancias(Producto p, double porcentaje,int numProducto) {
		double calcularpvp=0;
		double cantidadInvertida=0;
		double total=0;
		 calcularpvp=calcularPVP(p, porcentaje);
		 cantidadInvertida=calcularCantidadInvertida(numProducto);
		total=cantidadInvertida-calcularpvp;
		
		return total;
	}
	public void findById() {
		
	}
	
}
