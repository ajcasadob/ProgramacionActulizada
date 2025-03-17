package ejercicio10;

public class Maquina {

	private double saldoTotal;
	private String contra;
	private Billete bl;
	
	public Maquina(double saldoTotal, String contra, Billete bl) {
		super();
		this.saldoTotal = saldoTotal;
		this.contra = contra;
		this.bl = bl;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public Billete getBl() {
		return bl;
	}

	public void setBl(Billete bl) {
		this.bl = bl;
	}
	
	public double calcularPrecio(double aPagar,int cantidad) {
		
		saldoTotal+=aPagar-bl.calcularVenta(cantidad);
		return saldoTotal;
	}
	public void imprimirTicket(double Apagar, int cantidad,double saldoTotal) {
		
		System.out.printf("A pagar: "+bl.calcularVenta(cantidad)+" €");
		System.out.println("\nEntregado por el cliente: "+Apagar+" €");
		System.out.println("Cantidad de billetes:"+cantidad+" unds");
		System.out.println("A devolver: "+saldoTotal+" € ");
	}
	
	public boolean comprobarPass(String pass1) {
		boolean pn;
		if(contra.equals(pass1)) {
			pn=true;
		}
		else{
			pn=false;
		}
		return pn;
	}
	public double recaudacionTotal(int cantidad) {
		saldoTotal=0;
		saldoTotal+=bl.calcularVenta(cantidad);
		return saldoTotal;
	}
	public void imprimirRecaudacion(double saldoTotal) {
		
		System.out.println("Recaudación:"+saldoTotal);
	}
	
}
