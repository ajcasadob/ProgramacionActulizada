package model;

public class Dinero {
	
	private double saldo=1000000;


	//Getter and setter
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	//To String
	@Override
	public String toString() {
		return "Dinero [saldo=" + saldo + "]";
	}
	

}
