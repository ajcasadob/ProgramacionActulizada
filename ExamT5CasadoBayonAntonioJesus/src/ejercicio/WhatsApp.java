package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class WhatsApp {

	
	private List<Mensaje> list;

	public WhatsApp(List<Mensaje> list) {
		super();
		this.list = list;
	}

	public List<Mensaje> getList() {
		return list;
	}

	public void setList(List<Mensaje> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "WhatsApp [list=" + list + "]";
	}
	
	//Agregar un nuevo mensaje
	public void addMensaje(Mensaje m) {
		
		list.add(m);
		
		
	}
	//Buscar toda la lista de mensajes
	public List<Mensaje> buscarCuerpoMensaje(String mensaje){
		
		List<Mensaje> newList = new ArrayList<>();
		
		for(Mensaje m :list) {
			
			if(m.getTexMen().equalsIgnoreCase(mensaje)) {
				newList.add(m);
			}
		}
		return newList;
	}
	
	//Buscar por id
	public Mensaje buscarPorId(int id) {
		
		for(Mensaje m : list) {
			
			if(m.getId()==id) {
				return m;
			}
		}
		return null;
	}
	
	//Imprimir toda la lista con un iterator
	public void imprimirTodaLaLista() {
		
		Iterator<Mensaje> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
	
	//Calcular cantidad de dinero por mensaje
	public double calcularDinero(int id, double precio) {
		
		double dinero = 0;
		
		 dinero =buscarPorId(id).getTexMen().length()*precio;
		
		return dinero;
	}
	
	
	
	//Imprimir por pantalla un mensaje con la disponibilidad de espacio
	public void imprimirPorPantallaMensaje(int tope) {
			
		
		if(list.size()>tope) {
			System.out.println("La lista esta llena");
		}
		else {
			System.out.println("La lista no esta llena");
		
		}
	}
	
	//Eliminar un mensaje introducido por id
	public void eliminarMensaje (int id) {
		
	 list.remove(buscarPorId(id))	;
		
	}
	
	//Modificar un mensaje introduciendo asteriscos.
	public void modificarUnMensaje(int id) {
		
		buscarPorId(id).setTexMen("***");
		
	}
	//Ordenar por nombre en orden alfabetico
	public List<Mensaje> ordenarNatural (){
		
		List<Mensaje> newList = new ArrayList<>(list);
	
		
		Collections.sort(newList);
		return newList;
	}
	//Ordenar por id de mayor a menor
	public List<Mensaje> ordenarNoNatural(){
		
		List<Mensaje> newList = new ArrayList<>(list);
		
		Collections.sort(newList, new OrdenarPorId());
		return newList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WhatsApp other = (WhatsApp) obj;
		return Objects.equals(list, other.list);
	}
	
	
}
