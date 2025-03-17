package ejercicio04;

public class Cilindro {
	
	
	private double altura;
	private double radio;
	
	public Cilindro(double radio, double altura) {
		
		this.radio=radio;
		this.altura=altura;
		
	}
	
	

	public double calcularVolumen() {
		
		double result;
		result= Math.PI*Math.pow(radio, 2)*altura;
		return result;
	}
	
	


}
