package ejemplop002;

public class Empleado extends Trabajador{

	
	private double sueldo;
	private double impuestos;
	
	//Este constructor tiene que pasar los parametros de la madre
	
	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
		
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}

	
	
	public double calcularPaga() {
		
		
		return sueldo-impuestos;
	}
	
	
	
	
	
	
	
	
	
}
