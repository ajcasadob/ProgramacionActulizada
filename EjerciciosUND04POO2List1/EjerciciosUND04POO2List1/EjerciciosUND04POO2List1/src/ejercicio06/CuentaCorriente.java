package ejercicio06;

public class CuentaCorriente extends Cuenta {

	

	private double costeMantenimiento;
	private int puntos;
	
	
	
	public CuentaCorriente(String titular, double saldo, double costeMantenimiento, int puntos) {
		super(titular, saldo);
		this.costeMantenimiento = costeMantenimiento;
		this.puntos = puntos;
	}



	public double getCosteMantenimiento() {
		return costeMantenimiento;
	}



	public void setCosteMantenimiento(double costeMantenimiento) {
		this.costeMantenimiento = costeMantenimiento;
	}



	public int getPuntos() {
		return puntos;
	}



	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	
	public void retirar(double cantidad) {
		if(saldo>=cantidad) {
			saldo-=cantidad;
			puntos+=1;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void cobrarMantenimiento() {
		
		saldo-=costeMantenimiento;
	}
	
	
}
