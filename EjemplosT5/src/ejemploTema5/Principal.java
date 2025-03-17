package ejemploTema5;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String []args) {
	
	Producto p1= new Producto("Patatas",2.50,false);
	Producto p3= new Producto("Helado oscuro",1.20,true);
	Producto p4= new Producto("peras",1.50,false);
	Producto p5= new Producto("Hielo",3.50,true);
	Producto p6= new Producto("sandia",4.50,true);
	
	List <Producto> listado = new ArrayList<Producto>(); 
	
	listado.add(p1);
	System.out.println(listado);
	
   //SABER TAMAÑO
	
		System.out.println("Tamaño actual= "+listado.size());
		
		listado.add(p3);
		listado.add(p4);
		listado.add(p5);
		System.out.println("Tamaño actual= "+listado.size());
		System.out.println(listado);
		
		listado.remove(0);
		listado.remove(p4);
		System.out.println(listado);
		listado.add(p6);
		System.out.println(listado);
		listado.add(1, p6);
		System.out.println(listado);
		
		System.out.println(listado.get(2).getNombre());

	
	}
}
