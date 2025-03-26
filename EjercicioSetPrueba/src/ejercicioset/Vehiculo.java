package ejercicioset;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo> {

	private String matricula;
	private String marca;
	private int anio;
	private double precioDia;
	private boolean ocup;
	
	
	public Vehiculo(String matricula, String marca, int anio, double precioDia, boolean ocup) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.anio = anio;
		this.precioDia = precioDia;
		this.ocup = ocup;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public double getPrecioDia() {
		return precioDia;
	}


	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}


	public boolean isOcup() {
		return ocup;
	}


	public void setOcup(boolean ocup) {
		this.ocup = ocup;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", anio=" + anio + ", precioDia=" + precioDia
				+ ", ocup=" + ocup + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(anio, marca, matricula, ocup, precioDia);
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
		return anio == other.anio && Objects.equals(marca, other.marca) && Objects.equals(matricula, other.matricula)
				&& ocup == other.ocup && Double.doubleToLongBits(precioDia) == Double.doubleToLongBits(other.precioDia);
	}


	@Override
	public int compareTo(Vehiculo o) {
		if(o.getAnio()<anio) {
			return 1;
		}if(o.getAnio()>anio) {
			return -1;
		}
		
		return 0;
	}


	


	


	
	
	
	
	
	
}
