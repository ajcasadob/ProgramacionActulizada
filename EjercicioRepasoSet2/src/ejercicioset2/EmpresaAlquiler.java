package ejercicioset2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmpresaAlquiler {

	
	 private Set<Vehiculo> carSet;

	public EmpresaAlquiler(Set<Vehiculo> carSet) {
		super();
		this.carSet = carSet;
	}

	public Set<Vehiculo> getCarSet() {
		return carSet;
	}

	public void setCarSet(Set<Vehiculo> carSet) {
		this.carSet = carSet;
	}

	@Override
	public String toString() {
		return "EmpresaAlquiler [carSet=" + carSet + "]";
	} 
	 
	 public void addCar(Vehiculo v) {
		 
		 carSet.add(v);
		 
	 }
	 
	 public Vehiculo findByMatri(String matricula) {
		 
		 for(Vehiculo v: carSet) {
			 
			 if(v.getMatri().equalsIgnoreCase(matricula)) {
				 
				 return v;
			 }
		 }
		 return null;
	 }
	 
	 public Set<Vehiculo> findByRangePriceSet (double price1, double price2){
		 Iterator<Vehiculo> it = carSet.iterator();
		 Set<Vehiculo> setCarNew = new HashSet<Vehiculo>();
		 double minPrice = Math.min(price1, price2);
		 double maxPrice = Math.max(price1, price2);
		 Vehiculo v;
		 
		 while(it.hasNext()) {
			 v= it.next();
			 if(v.getPriceDay()>=minPrice && v.getPriceDay()<=maxPrice) {
				 setCarNew.add(v);
			 }
		 }
		 
		 return setCarNew;
	 }
	 
	 public Set<Vehiculo> findByPriceCar(double price){
		 
		 Set<Vehiculo> carSetSearchSet =  new HashSet<Vehiculo>();
		 
		 	for(Vehiculo v: carSet) {
		 		if(v.getPriceDay()==price) {
		 			carSetSearchSet.add(v);
		 		}
		 	}
		 	
		 	return carSetSearchSet;
	 }
	 
	 public Set<Vehiculo> findByPriceCarHight(){
		 double priceMax =0.0;
		 for(Vehiculo v: carSet) {
			 if(v.getPriceDay()>priceMax) {
				 
				  priceMax =v.getPriceDay();
			 }
		 }
		 return findByPriceCar(priceMax);
	 }
	 
	 public void deletedByMatri(String matricula) {
		 
		 carSet.remove(findByMatri(matricula));
	 }
	 
	 public void editCarPrice(String matricula, double price) {
		 
		findByMatri(matricula).setPriceDay(price);
	 }
	 
	 public void showAllCarNotRent() {
		 
		 for(Vehiculo v: carSet) {
			 if(!v.isOcu()) {
				 System.out.println(v);
			 }
		 }
	 }
	 
	 public Set<Vehiculo> orderByYear(){
		 
		Set<Vehiculo> carSet2 = new TreeSet<Vehiculo>(carSet);
		return carSet2;
	 }
	 
	 public List<Vehiculo> orderByPrice(){
		 
		 List<Vehiculo> list = new ArrayList<Vehiculo>(carSet);
		 
		
		 Collections.sort(list, new OrdenarPrecio());
		 return list;
	 }
}
