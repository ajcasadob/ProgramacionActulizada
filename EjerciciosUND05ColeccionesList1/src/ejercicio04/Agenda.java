package ejercicio04;

import java.util.HashMap;
import java.util.Iterator;

public class Agenda {
	
	private HashMap<Contacto,String> lista;

	public Agenda(HashMap<Contacto, String> lista) {
		super();
		this.lista = lista;
	}
	
	public void addTlf(Contacto c, String tlf) {
		lista.put(c, tlf);
	}

	

	
	public void showTlf() {
		for(Contacto c : lista.keySet()) {
			System.out.println(c);
		}
	}
	
	public String buscarPorNombre(String nombre) {
		for(Contacto c : lista.keySet()) {
			if(c.getNombre().equals(nombre)) {
				return c.getTelefono();
			}
		}
		return null;
	}
	
	//Hay que usar iterator para eliminar elementos de un hashmap mientras se recorre
	public void deleteTlf(String nombre) {
		Iterator<Contacto> it = lista.keySet().iterator();
		while(it.hasNext()) {
			Contacto c = it.next();
			if(c.getNombre().equals(nombre)) {
				it.remove();
			}
		}
	}
	
		
	
	
	
	

}
