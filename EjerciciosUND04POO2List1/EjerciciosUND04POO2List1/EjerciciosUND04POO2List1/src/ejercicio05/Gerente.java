package ejercicio05;

public class Gerente extends Empleado {

	
	private double sueldoB;

	public Gerente(String nombre, String apellidos, double sueldoBase, int numeroID, double sueldoB) {
		super(nombre, apellidos, sueldoBase, numeroID);
		this.sueldoB = sueldoB;
	}

	public double getSueldoB() {
		return sueldoB;
	}

	public void setSueldoB(double sueldoB) {
		this.sueldoB = sueldoB;
	}

	@Override
	public String toString() {
		return "Gerente [sueldoB=" + sueldoB + "]";
	}
	
	public double calcularSueldoBase(double ventas) {
		
		
		return super.getSueldoBase()-super.getSueldoBase()*sueldoB/100;
		
		
	}
}
