package ejercicio;

public class Trastero {

	private double meterCuad;
	private String dir;
	private int numTras;
	private double price;
	private boolean ocup;
	
	public Trastero(double meterCuad, String dir, int numTras, double price, boolean ocup) {
		super();
		this.meterCuad = meterCuad;
		this.dir = dir;
		this.numTras = numTras;
		this.price = price;
		this.ocup = ocup;
	}

	public double getMeterCuad() {
		return meterCuad;
	}

	public void setMeterCuad(double meterCuad) {
		this.meterCuad = meterCuad;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isOcup() {
		return ocup;
	}

	public void setOcup(boolean ocup) {
		this.ocup = ocup;
	}

	@Override
	public String toString() {
		return "Trastero [meterCuad=" + meterCuad + ", dir=" + dir + ", numTras=" + numTras + ", price=" + price
				+ ", ocup=" + ocup + "]";
	}
	
	
	
	
	
	
}
