package repaso;

public class Trastero implements Comparable<Trastero> {

	private double capMetros;
	private String dir;
	private int numTras;
	private double precio;
	private boolean ocup;
	
	
	public Trastero(double capMetros, String dir, int numTras, double precio, boolean ocup) {
		super();
		this.capMetros = capMetros;
		this.dir = dir;
		this.numTras = numTras;
		this.precio = precio;
		this.ocup = ocup;
	}


	public double getCapMetros() {
		return capMetros;
	}


	public void setCapMetros(double capMetros) {
		this.capMetros = capMetros;
	}


	public String getDir() {
		return dir;
	}


	public void setDir(String dir) {
		this.dir = dir;
	}


	public int getNumTras() {
		return numTras;
	}


	public void setNumTras(int numTras) {
		this.numTras = numTras;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean isOcup() {
		return ocup;
	}


	public void setOcup(boolean ocup) {
		this.ocup = ocup;
	}


	@Override
	public String toString() {
		return "Trastero [capMetros=" + capMetros + ", dir=" + dir + ", numTras=" + numTras + ", precio=" + precio
				+ ", ocup=" + ocup + "]";
	}


	@Override
	public int compareTo(Trastero o) {
		
		if(o.getNumTras()>numTras) {
			return -1;
		}else {
			if(o.getNumTras()>numTras) {
				return -Double.compare(numTras, o.getNumTras());
			}
		}
		return 1;
	}
	
	
	
	
	
}
