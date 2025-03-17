package ejercicio06;

public abstract class Cuenta {

	
	protected String titular;
	protected double saldo;
	
	
	public Cuenta(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void ingresar(double cantidad);
	
	public abstract void retirar(double cantidad);
}
