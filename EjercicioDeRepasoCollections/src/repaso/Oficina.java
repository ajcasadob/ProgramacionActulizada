package repaso;

import java.util.ArrayList;
import java.util.Collections;
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
	
	public List<Trastero> findByPrice(double precio){
		List<Trastero> newList = new ArrayList<Trastero>();
		for(Trastero t: lista) {
			if(t.getPrecio()==precio) {
				 newList.add(t);
			}
			
		}
		return newList;
	}
	
	public Trastero findByNum(int numTras) {
		
		for ( Trastero t : lista) {
			
			if(t.getNumTras()==numTras) {
				return t;
			}
		}
		return null;
	}
	
	public List<Trastero> findByPriceMax(){
		double precioMax=0.0;
		
		for (Trastero t : lista) {
			
			if(t.getPrecio()<precioMax) {
				precioMax = t.getPrecio();
			}
		}
		
		return findByPrice(precioMax);
		
		
	}
	public boolean deleteTras(int tras) {
		
		return lista.remove(findByNum(tras));
	}
	
	public void editTrastero(int tras, double precio) {
		
		findByNum(tras).setPrecio(precio);
		
	}
	public List<Trastero> OrderByNature(){
		List<Trastero> newList = new ArrayList<Trastero>(lista);
		
		Collections.sort(newList);
		return newList;
	}
	
	public List<Trastero> OrderByNoNature(){
		List<Trastero> newList= new ArrayList<Trastero>(lista);
		
		Collections.sort(newList, new OrdenarPorPrecio());
		return newList;
	}
	
	public void listarTrasteros() {
		
		for(Trastero t: lista) {
			if(!t.isOcup()) {
				System.out.println(t);
			}
		}
	}
	
}
