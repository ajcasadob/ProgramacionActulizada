package ejercicio02;

public class Habitacion {

	
	private double precio;
	private String servicioExtra;
	private String nombreCliente;
	private int numDiasContratados;
	private boolean servicioLimpieza;
	private int numHabitacion;
	
	public Habitacion(double precio, String servicioExtra, String nombreCliente, int numDiasContratados,
			boolean servicioLimpieza, int numHabitacion) {
		super();
		this.precio = precio;
		this.servicioExtra = servicioExtra;
		this.nombreCliente = nombreCliente;
		this.numDiasContratados = numDiasContratados;
		this.servicioLimpieza = servicioLimpieza;
		this.numHabitacion = numHabitacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getServicioExtra() {
		return servicioExtra;
	}

	public void setServicioExtra(String servicioExtra) {
		this.servicioExtra = servicioExtra;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDiasContratados() {
		return numDiasContratados;
	}

	public void setNumDiasContratados(int numDiasContratados) {
		this.numDiasContratados = numDiasContratados;
	}

	public boolean isServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(boolean servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [precio=" + precio + ", servicioExtra=" + servicioExtra + ", nombreCliente=" + nombreCliente
				+ ", numDiasContratados=" + numDiasContratados + ", servicioLimpieza=" + servicioLimpieza
				+ ", numHabitacion=" + numHabitacion + "]";
	}
	
	
	
	
	
}
