package ejerciciotipoexamen;

import java.util.Objects;

public class Trastero implements Comparable <Trastero>{

	private double capacidadMetros;
	private String direccion;
	private int numTrastero;
	private double precio;
	private boolean ocupacion;
	
	public Trastero(double capacidadMetros, String direccion, int numTrastero, double precio, boolean ocupacion) {
		super();
		this.capacidadMetros = capacidadMetros;
		this.direccion = direccion;
		this.numTrastero = numTrastero;
		this.precio = precio;
		this.ocupacion = ocupacion;
	}

	public double getCapacidadMetros() {
		return capacidadMetros;
	}

	public void setCapacidadMetros(double capacidadMetros) {
		this.capacidadMetros = capacidadMetros;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumTrastero() {
		return numTrastero;
	}

	public void setNumTrastero(int numTrastero) {
		this.numTrastero = numTrastero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(boolean ocupacion) {
		this.ocupacion = ocupacion;
	}

	@Override
	public String toString() {
		return "Trastero [capacidadMetros=" + capacidadMetros + ", direccion=" + direccion + ", numTrastero="
				+ numTrastero + ", precio=" + precio + ", ocupacion=" + ocupacion + "]";
	}

	

	@Override
	public int compareTo(Trastero o) {
		
		if(numTrastero>o.getNumTrastero()) {
			return - 1;
			
			
		}else {
			if(numTrastero<o.getNumTrastero()) {
				
				return 1;
			}
			
		}
			
		
		return 0;
		
	}
	
	
	
	

}
