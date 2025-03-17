package ejemplocontructor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		
		int id;
		String nombre;
		double precioBase;
		double porcentaje;
		
		//Insertado los datos directamente, no es buena idea.
	//	Producto p=new Producto(1,"Fanta",1.30);
		
		//Con dos parametros
		Producto p4=new Producto(1, "Nestle");
		Producto p3;
		//Producto p1=new Producto();
		//Leyendo por teclado
		
		System.out.println("Diga el id");
		id=Leer.datoInt();
		System.out.println("Diga nombre");
		nombre=Leer.dato();
		System.out.println("Diga precio");
		precioBase=Leer.datoDouble();
		
		p3=new Producto(id,nombre, precioBase);
		
		//System.out.println(p3);
		//INTRODUCIDO MANUAL
		//System.out.println(p3.getNombre());
		//p3.setId(8);
		//System.out.println(p3.getId());
		
		System.out.println("Diga que porcentaje de ganancia quiere aplicar");
		porcentaje=Leer.datoDouble();
		
		
		p3.calcularPVP(porcentaje);
		System.out.println(p3.calcularPVP(porcentaje));
		
		
		

	}

}
