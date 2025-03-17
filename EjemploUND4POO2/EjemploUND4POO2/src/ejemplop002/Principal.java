package ejemplop002;

public class Principal {

	public static void main(String[] args) {
		

		Trabajador t= new Trabajador("Antonio","Alumno");
		Empleado e= new Empleado("Miguel","Profesor",1000.0,15.0);
		Consultor c=new Consultor("Luismi","Tutor",26,50);
		
		System.out.println(t);
		System.out.println(e);
		System.out.println(c);
		
		//Llamadas a metodos
		
		
		System.out.println(t.calcularPaga());
		System.out.println(e.calcularPaga());
		System.out.println(c.calcularPaga());
	}

}
