package ejemplosobjetos;

public class Secretaria {

	
	private String nombreColegio;
	
	//La primera vez que tengo atributo no básico
	//el tipo es de la clase Alumno
	
	private Alumno al;

	public Secretaria(String nombreColegio, Alumno al) {
		super();
		this.nombreColegio = nombreColegio;
		this.al = al;
	}

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	public Alumno getAl() {
		return al;
	}

	public void setAl(Alumno al) {
		this.al = al;
	}

	@Override
	public String toString() {
		return "Secretaria [nombreColegio=" + nombreColegio + ", al=" + al + "]";
	}
	
	/*public double calcularMediav2 () {
		
		double dos=2.0;
		
		return (al.getNotaPro()+al.getNotaSis())/dos;
		
	}*/
	
	public double calcularMediav2 () {
		
		
		return al.calcularMedia();
		
	}
	
	
	
	
	
	
}
