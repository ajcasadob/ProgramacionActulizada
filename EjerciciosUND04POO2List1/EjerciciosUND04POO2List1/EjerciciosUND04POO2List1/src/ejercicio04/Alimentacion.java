package ejercicio04;

public class Alimentacion extends Producto {

	private int fechaCaducidad;

	public Alimentacion(double precioUnitario, String nombre, int id, int fechaCaducidad) {
		super(precioUnitario, nombre, id);
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(int fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Alimentacion [fechaCaducidad=" + fechaCaducidad + "]";
	}
	
	public double calcularPVP(double iva,double descuento,double impuestoLujo) {
		
		double precio;
		precio=super.calcularPVP(iva,descuento,impuestoLujo);
		if(fechaCaducidad<2) {
			precio=precio-(precio*descuento/100);
		}
			
		
		return	precio;
			
		}
	
	public void mostrarCaducidad() {
		
		System.out.println("Su producto está a punto de caducar");
	}
}
