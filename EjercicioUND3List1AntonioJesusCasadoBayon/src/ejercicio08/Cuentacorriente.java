package ejercicio08;

public class Cuentacorriente {

	private double saldo;
	private String nombre;
	
	public Cuentacorriente(double saldo, String nombre) {
		super();
		this.saldo = saldo;
		this.nombre = nombre;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double sumarCantidad(double cantidad ) {
		
		saldo+=cantidad;
		return saldo;
	}
	public double restarCantidad(double cantidad) {
		
		
		
		if(saldo>=cantidad) {
			saldo-=cantidad;
		}
		return saldo;
	}
	
	public double cambiarDolares() {
		
		double euro=0.95;
		double dolar=1;
		double cambio;
		
		cambio=saldo*dolar/euro;
		return cambio;
	
		
	}
	public void imprimirCambio(double cambio) {
		
		System.out.printf("El cambio de euros a dolares en tu saldo es de: %.2f dolares",cambio);
	}
	
	public void imprimirSaldo(String nombre) {
		
		System.out.println(nombre+" el saldo de su cuenta es de "+saldo+" euros");
	}
	
	
	
	
	
}
