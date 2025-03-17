package ejerciciodeprueba;

import java.util.Arrays;



public class Tienda {

	private Producto lista[];

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
	
	public void agregarProductos (Producto p,int numProductos) {
		lista[numProductos]=p;
		
	}
	
	public void listarProductos() {
		for(int i=0;i<lista.length;i++) {
			
			if(lista[i]!=null) {
				
				System.out.println(lista[i]);
			}
		}
	}
	
	public boolean comprobarFragilidad(int id,int numProductos) {
		boolean encontrado=false,fragil=false;
		
		for(int i=0;i<numProductos && !encontrado;i++) {
			
			if(lista[i].getId()==id) {
				
				fragil=lista[i].isFragil();
				encontrado=true;
			}
			
		}
		return fragil;
	}
	
	public void ImprimirFragilidad(int id, int numProductos) {
		
		if(comprobarFragilidad(id,numProductos)) {
			
			System.out.println("Este producto es frágil");
		}else {
			
			System.out.println("Este producto no es frágil");
		}
		
	}
	
	public double calcularPrecioFab(int numProductos) {
		double suma=0;
		for(int i=0;i<numProductos;i++) {
			
			suma+=lista[i].getPrecioFab();
			
		}
	return suma;	
	}
	
	public double calcularPvp(int numProductos,double porcentaje,double transporte,Producto p) {
		
		double cien=100;
		double result;
		double precioCoste= p.calcularPrecioCoste(transporte);
		double pvp;
		pvp=precioCoste+(precioCoste*porcentaje)/cien;
		return pvp;
		
		
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
	
	
	
}
