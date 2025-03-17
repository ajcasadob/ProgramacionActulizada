package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	
	private double costeRetiro;
	private double totalCobradoPorRetiros;
	
	
	public CuentaEmpresa(String titular, double saldo, double costeRetiro, double totalCobradoPorRetiros) {
		super(titular, saldo);
		this.costeRetiro = costeRetiro;
		this.totalCobradoPorRetiros = totalCobradoPorRetiros;
	}
	
	public void ingresar(double cantidad) {
		
		saldo+=cantidad;
	}
	
	public void retirar (double cantidad) {
		
		double total;
		total= cantidad +costeRetiro;
		if(saldo>=total) {
			saldo-= total;
			totalCobradoPorRetiros += costeRetiro;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	public double getCosteRetiro() {
		return costeRetiro;
	}

	public void setCosteRetiro(double costeRetiro) {
		this.costeRetiro = costeRetiro;
	}

	public double getTotalCobradoPorRetiros() {
		return totalCobradoPorRetiros;
	}

	public void setTotalCobradoPorRetiros(double totalCobradoPorRetiros) {
		this.totalCobradoPorRetiros = totalCobradoPorRetiros;
	}
	
}
