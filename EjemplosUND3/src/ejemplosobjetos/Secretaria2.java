package ejemplosobjetos;

public class Secretaria2 {

	
	
	private String nombreColegio;

	
	
	public Secretaria2(Alumno al, String nombreColegio) {
		super();
		
		this.nombreColegio = nombreColegio;
	}
	

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}
	

	@Override
	public String toString() {
		return "Secretaria2 [nombreColegio=" + nombreColegio + "]";
	}


	//Asío no
	public double calcularMediav3() {
		
		Alumno al=new Alumno("Antonio",4,7,"Casado Bayón");
		return al.calcularMedia();
		
	}
	//Así noo
	
	public double calcularMediav4(String nombre, String apellidos, double notaPro, double notaSis) {
		
		double dos=2.0;
		return notaPro+notaSis/dos;
		
	}
	
	//Uno que sí
	
	public double calcularMediav5(Alumno al) {
		
		return al.calcularMedia();
		
	}
	
	
	
	
}
