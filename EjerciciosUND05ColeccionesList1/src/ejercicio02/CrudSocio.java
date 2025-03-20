package ejercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class CrudSocio {

	List<Socios> lista;
	
	
	
	public CrudSocio(List<Socios> lista) {
		super();
		this.lista = lista;
	}

	
	
	
	public void agregarSocios(Socios socio) {
		
		lista.add(socio);
	}
	
	public Socios buscarPorId(int id) {
		
		for(Socios s: lista ) {
			
			if(s.getId()==id) {
				
				return s;
			}
			
		}
		return null;
	}
	
	public void eliminarSocio(int id) {
		
		Socios s = buscarPorId(id);
		
		if(s!=null) {
			
			lista.remove(s);
		}
	}
	
	public void actualizarSocio(int id,String nombre, String apellido,String dni, int edad){
        Socios s = buscarPorId(id);
        if(s!=null){
            s.setNombre(nombre);
            s.setApellido(apellido);
            s.setDni(dni);
            s.setEdad(edad);

        }
    }
	
	public Socios buscarUnSocio(int id) {
		
		Socios s = buscarPorId(id);
		if(s!=null) {
			return s;
		}
			
		return null;
		
	}


	
	public List<Socios> sortList(){
		List<Socios> newList = new ArrayList<Socios>();
		Collections.sort(newList);
		return newList;
		
	}



	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder("Listado de socios:\n");
	    sb.append("-----------------------------------------------------\n");

	    for (Socios socio : lista) {
	        sb.append(socio.toString()).append("\n");
	    }

	    return sb.toString();
	}

	
	

}
