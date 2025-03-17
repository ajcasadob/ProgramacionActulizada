package ejemplosobjetos;

public class Alumno {

	
	private String nombre;
	private double notaPro;
	private double notaSis;
	private String apellidos;
	
	
	
	public Alumno(String nombre, double notaPro, double notaSis, String apellidos) {
		super();
		this.nombre = nombre;
		this.notaPro = notaPro;
		this.notaSis = notaSis;
		this.apellidos = apellidos;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNotaPro() {
		return notaPro;
	}
	public void setNotaPro(double notaPro) {
		this.notaPro = notaPro;
	}
	public double getNotaSis() {
		return notaSis;
	}
	public void setNotaSis(double notaSis) {
		this.notaSis = notaSis;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaPro=" + notaPro + ", notaSis=" + notaSis + ", apellidos=" + apellidos
				+ "]";
	}
	
	public double calcularMedia() {
		double dos=2.0;
		return (notaPro+notaSis)/dos;
		
	}
	
	
	
	
}
