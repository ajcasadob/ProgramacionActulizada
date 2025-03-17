package ejercicio04;

public class Electronica extends Producto {

	
	private boolean impuestoEspecial;

	public Electronica(double precioUnitario, String nombre, int id, boolean impuestoEspecial) {
		super(precioUnitario, nombre, id);
		this.impuestoEspecial = impuestoEspecial;
	}

	public boolean isImpuestoEspecial() {
		return impuestoEspecial;
	}

	public void setImpuestoEspecial(boolean impuestoEspecial) {
		this.impuestoEspecial = impuestoEspecial;
	}

	@Override
	public String toString() {
		return "Electronica [impuestoEspecial=" + impuestoEspecial + "]";
	}
	
	public double calcularPVP(double iva,double descuento,double impuestoLujo) {
		
		double precio;
		precio=super.calcularPVP(iva, descuento, impuestoLujo);
		if(impuestoEspecial) {
			precio=precio+(precio*impuestoLujo/100);
		}
		
		return	precio;
			
		}
}
