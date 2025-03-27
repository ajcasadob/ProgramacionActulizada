package ejercicioset2;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo> {
	
	private String matri;
	private String brand;
	private String model;
	private int year;
	private double priceDay;
	private boolean ocu;
	
	
	public Vehiculo(String matri, String brand, String model, int year, double priceDay, boolean ocu) {
		super();
		this.matri = matri;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.priceDay = priceDay;
		this.ocu = ocu;
	}


	public String getMatri() {
		return matri;
	}


	public void setMatri(String matri) {
		this.matri = matri;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPriceDay() {
		return priceDay;
	}


	public void setPriceDay(double priceDay) {
		this.priceDay = priceDay;
	}


	public boolean isOcu() {
		return ocu;
	}


	public void setOcu(boolean ocu) {
		this.ocu = ocu;
	}


	@Override
	public String toString() {
		return "Vehiculo [matri=" + matri + ", brand=" + brand + ", model=" + model + ", year=" + year + ", priceDay="
				+ priceDay + ", ocu=" + ocu + "]";
	}


	@Override
	public int compareTo(Vehiculo o) {
		
		return -Double.compare(o.getYear(), year);
	}


	@Override
	public int hashCode() {
		return Objects.hash(brand, matri, model, ocu, priceDay, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(matri, other.matri)
				&& Objects.equals(model, other.model) && ocu == other.ocu
				&& Double.doubleToLongBits(priceDay) == Double.doubleToLongBits(other.priceDay) && year == other.year;
	}
	
	
	

}
