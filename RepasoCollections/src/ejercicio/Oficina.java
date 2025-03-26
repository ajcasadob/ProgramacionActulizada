package ejercicio;

import java.util.ArrayList;
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
	
	public boolean addTrastero(Trastero t) {
		return lista.add(t);
	}
	
	public List<Trastero> findByPrice(double price){
		List<Trastero> newList= new ArrayList<>();
		for(Trastero t : lista) {
			
			if(t.getPrice()==price) {
				newList.add(t);
			}
		}
		return newList;
	}
	
	public Trastero findByNum(int numTras) {
		
		for(Trastero t : lista) {
			
			if(t.getNumTras()==numTras) {
				
				return t;
			}
		}
		return null;
	}
	
	public List<Trastero> findByMaxMoney(){
		
		
		double precioMax=0.0;
		for(Trastero t : lista) {
			
			if(precioMax<t.getPrice()) {
				
				precioMax=t.getPrice();
				
			}
		}
		return findByPrice(precioMax);
		
	}
	
	public boolean deleteObjet (int numTras) {
		
		return lista.remove(findByNum(numTras));
		
	}

}
