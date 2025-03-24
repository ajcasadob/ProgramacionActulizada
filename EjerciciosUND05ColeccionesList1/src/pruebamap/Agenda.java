package pruebamap;


import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Agenda {
	
	private Map<Integer, Contacto> lista;

	public Agenda(Map<Integer, Contacto> lista) {
		super();
		this.lista = lista;
	}

	public Map<Integer, Contacto> getLista() {
		return lista;
	}

	public void setLista(Map<Integer, Contacto> lista) {
		this.lista = lista;
	}

	
	

	@Override
	public String toString() {
		return "Agenda [lista=" + lista + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return lista.hashCode();
	}
	
	
	
	
	

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Agenda other = (Agenda) obj;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		return true;
	}

	public void AgregarContacto (Integer id, Contacto c) {
		lista.put(id, c);
	}



	public Map<Integer, Contacto> ordenarPorKey(){
		
		Map<Integer, Contacto> listaOrdenada = new TreeMap<Integer,Contacto>(lista);
		
		return listaOrdenada;
		
		
	}
	
	public Contacto buscarPorNombre(String nombre) {
	    for (Contacto contacto : lista.values()) {
	        if (contacto.getNombre().equalsIgnoreCase(nombre)) {
	            return contacto;
	        }
	    }
	    return null; // Si no se encuentra
	}

	public Contacto buscarPorId(int id) {
	    return lista.get(id); // Retorna null si el ID no existe
	}

	
	
	
	public  Map<Integer, Contacto> ordenarPorNombre(Map<Integer, Contacto> mapa) {
        return mapa.entrySet().stream()
                .sorted(Comparator.comparing(entry -> entry.getValue().getNombre()))
                .collect(LinkedHashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), Map::putAll);
    }
	
	

	
	
	
	


	
}
