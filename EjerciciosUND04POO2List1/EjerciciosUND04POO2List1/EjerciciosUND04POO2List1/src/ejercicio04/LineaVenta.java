package ejercicio04;

public class LineaVenta {

	private Producto p;
	private int cantidad;
	
	public LineaVenta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}
	public Producto getP() {
		return p;
	}
	public void setP(Producto p) {
		this.p = p;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "LineaVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}
	
	
	public double calcularImporte (double iva, double descuento, double impuestoLujo) {
		
		
		return p.calcularPVP(iva, descuento, impuestoLujo)*cantidad ;
	}
	
}
