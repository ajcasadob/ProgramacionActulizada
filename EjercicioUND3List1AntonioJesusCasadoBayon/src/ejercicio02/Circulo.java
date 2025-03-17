package ejercicio02;

public class Circulo {
	
	private double radio;
	
	
	
	public Circulo(double radio) {
		this.radio=radio;
		
	}
	
	public double calculoArea () {
		
		double result;
		result= Math.PI*radio;
		return result;
		
	}
	public double calculoArea2() {
		
		double result;
		double division;
		result= Math.PI*radio;
		division=result/10000;
		return division;
		
	}
	

}
