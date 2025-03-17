package ejercicio01;

public class Habitacion {

	private double precioBase;
	private boolean ocupacion;
	private String nombre;
	private int numeroDiasOcupado;
	private int numeroOcupantes;
	
	public Habitacion(double precioBase, boolean ocupacion, String nombre, int numeroDiasOcupado, int numeroOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupacion = ocupacion;
		this.nombre = nombre;
		this.numeroDiasOcupado = numeroDiasOcupado;
		this.numeroOcupantes = numeroOcupantes;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(boolean ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDiasOcupado() {
		return numeroDiasOcupado;
	}

	public void setNumeroDiasOcupado(int numeroDiasOcupado) {
		this.numeroDiasOcupado = numeroDiasOcupado;
	}

	public int getNumeroOcupantes() {
		return numeroOcupantes;
	}

	public void setNumeroOcupantes(int numeroOcupantes) {
		this.numeroOcupantes = numeroOcupantes;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupacion=" + ocupacion + ", nombre=" + nombre
				+ ", numeroDiasOcupado=" + numeroDiasOcupado + ", numeroOcupantes=" + numeroOcupantes + "]";
	}
	
	public String mostrarInfo() {
        return "Habitación [Precio base: " + precioBase +" €" +", Ocupada: " + ocupacion +
               ", Cliente: " + nombre + ", Días: " + numeroDiasOcupado +
               ", Ocupantes: " + numeroOcupantes + "]";
    }
	
	public double calcularPrecioHabitacion() {
		
		return precioBase*numeroDiasOcupado;
	}
	
}
