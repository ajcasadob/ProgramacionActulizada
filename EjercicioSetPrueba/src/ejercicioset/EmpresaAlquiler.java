package ejercicioset;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EmpresaAlquiler {

	private Set<Vehiculo> lista;

	public EmpresaAlquiler(Set<Vehiculo> lista) {
		super();
		this.lista = lista;
	}

	public Set<Vehiculo> getLista() {
		return lista;
	}

	public void setLista(Set<Vehiculo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "EmpresaAlquiler [lista=" + lista + "]";
	}
	
	public void addCar (Vehiculo v) {
		
		 lista.add(v);
	}
	
	public Vehiculo findByMatri(String matricula) {
		
		for(Vehiculo v: lista) {
			if(v.getMatricula().equalsIgnoreCase(matricula)) {
				
				return v;
			}
		}
		return null;
	}
	
	public Set<Vehiculo> findByMoneyRent(double precio1, double precio2){
		
		Set<Vehiculo> newListSet = new HashSet<Vehiculo>();
			
			for(Vehiculo v: lista) {
				
				if(v.getPrecioDia()>=precio1 && v.getPrecioDia()<=precio2) {
					
					newListSet.add(v);
				}
				
			}
		return newListSet;
	}
	
	public Set<Vehiculo> findByPrice(double precio){
		Set<Vehiculo> setVehiculos = new HashSet<Vehiculo>();
		
		Vehiculo v;
		
		Iterator<Vehiculo> it= lista.iterator();
		
		while(it.hasNext()) {
			
			v=it.next();
			if(v.getPrecioDia()==precio) {
				setVehiculos.add(v);
			}
		}
		
		return setVehiculos;
	}
		
	public Set<Vehiculo> findByHighestValuatedCar (){
		
		
			double precioMax=0.0;
			for(Vehiculo v: lista) {
				
				if(v.getPrecioDia()>precioMax) {
					
					precioMax = v.getPrecioDia();
					
				}
			}
			return findByPrice(precioMax);
	}
	
	public void deleteCar(String matricula) {
		
		lista.remove(findByMatri(matricula));
	}
		
	
	public void editMatriCar(String matricula) {
		
		findByMatri(matricula).setMatricula(matricula);
		
		
	}
	
	public void showCarNotRent() {
		
		for(Vehiculo v: lista) {
			if(!v.isOcup()) {
				System.out.println(v);
			}
		}
	}
	
	public Set<Vehiculo> orderByFabri(){
		Set<Vehiculo> setVehiculos= new TreeSet<Vehiculo>(lista);
		
		return setVehiculos;
		
	}
	
	public Set<Vehiculo> orderByPrice(){
		Set<Vehiculo> setVehiculos = new TreeSet<Vehiculo>(new OrdenarPorPrecio());
		
		setVehiculos.addAll(lista);
		
		return setVehiculos;
			
			
		
	}
	
}
