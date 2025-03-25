package ejerciciotipoexamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Oficina {

	private List<Trastero> lista;

	public Oficina(List<Trastero> lista) {
		super();
		this.lista = lista;
	}

	public List<Trastero> getLista() {
		return lista;
	}

	public void setLista(List<Trastero> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}
	//Agregar
	public void addTrastero(Trastero tras) {
		
		lista.add(tras);
	}
	//Buscar por iterator por precio
	public List<Trastero> BuscarPorPrecio(double precio){
		List<Trastero> newList = new ArrayList<Trastero>();
		Iterator<Trastero> it = lista.iterator();
		Trastero t;
		while(it.hasNext()) {
			t=it.next();
			if(t.getPrecio()==precio) {
				
				newList.add(t);
			}
		}
		return newList;
	}
	//Buscar con bucle por for
	public List<Trastero> BuscarPorPrecioFor(double precio){
		
		List<Trastero> newList = new ArrayList<Trastero>();
		
		for(Trastero t: lista) {
			
			if(t.getPrecio()==precio) {
				
				newList.add(t);
			}
		}
		return newList;
	}
	//Buscar por numero
	public Trastero buscarPorNumero(int nTrastero) {
		
		for(Trastero trastero : lista) {
			if(trastero.getNumTrastero()==nTrastero) {
				return trastero;
			}
		}
		return null;
	}
	
	//Buscar trastero mas caro
	
	public List<Trastero> buscarMayorPrecio(){
		
		double precioMayor=0.0;
		
		for(Trastero t: lista) {
			if(precioMayor<t.getPrecio()) {
				precioMayor = t.getPrecio();
			}
			
		}
		return BuscarPorPrecioFor(precioMayor);
	}
	
	//Eliminar trastero
	
	public void eliminarTrastero(int nTras) {
		
		lista.remove(buscarPorNumero(nTras));
		
	}
	//Modificar un trastero
	public void modificarTrastero(int nTras, double precio) {
		
		buscarPorNumero(nTras).setPrecio(precio);
	}
	
	//Orden natural
	
	public List<Trastero> ordenarNatural(){
		List<Trastero> newList= new ArrayList<Trastero>(lista);
		
		Collections.sort(newList);
		return newList;
		
	}
	
	//Orden no natural
	
	public List<Trastero> ordenarNoNatural(){
		List<Trastero> newList= new ArrayList<Trastero>(lista);
		
		Collections.sort(newList, new OrdenarPorPrecio());
		return newList;
		
	}
	//Mostrar trasteros no ocupados
	public void listarTrasteros() {
	
		for(Trastero t: lista) {
			if(!t.isOcupacion()) {
				System.out.println(t);
			}
		}
		
	}
	
}
