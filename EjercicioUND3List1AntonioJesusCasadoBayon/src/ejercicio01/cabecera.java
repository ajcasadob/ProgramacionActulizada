package ejercicio01;

public class cabecera {

	private String fecha;
	private String nombreAsig;
	private String aulaRealiza;

	public cabecera(String fecha, String nombreAsig, String aulaRealiza) {

		this.fecha = fecha;
		this.nombreAsig = nombreAsig;
		this.aulaRealiza = aulaRealiza;
	}
	public String toString() {
		return "Lista[fecha="+ fecha + ",nombreAsig="+ nombreAsig+",aulaRealiza="+aulaRealiza+"]";
	}


	

}
