package ejercicio06;

public class CuentaJoven extends Cuenta{

	public CuentaJoven(String titular, double saldo) {
		super(titular, saldo);
	}

	@Override
	public void ingresar(double cantidad) {
		
		saldo+=cantidad+1;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

	
	
}
