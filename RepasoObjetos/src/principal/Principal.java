package principal;

import crud.Tienda;
import model.Producto;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tam=100;
		String nombre="";
		String nombreNuevo = "";
		
		
		Producto p=new Producto(0,"Fanta","Bebida para beber","bebida",2.5);
		Producto p1=new Producto(1,"Pepsi","Bebida para morir","bebida",2.3);
		Producto p2=new Producto(2,"Nestle","Chocolate","comida",1.5);
		Producto p3=new Producto(3,"pipas","para jartarte","comida",1.2);
		Producto p4=new Producto(4,"pizza","horno de la nona","a",1);
		Producto p5=new Producto(5,"agua","para depurar","a",1);
		
		Producto lista[]=new Producto[tam];
		
		Tienda t= new Tienda(lista,0);
		Producto pEncontrado;
		
		t.agregarProducto(p);
		t.agregarProducto(p1);
		t.agregarProducto(p2);
		t.agregarProducto(p3);
		t.agregarProducto(p4);
		t.agregarProducto(p5);
		t.listaProductosStandart(t.getLista());
		
		/*System.out.println("¿Qué producto desea buscar?");
		nombre=Leer.dato();
		
		pEncontrado = t.buscarProducto(nombre);
		
		if(pEncontrado==null) {
			
			System.out.println("Producto no encontrado");
			
		}else {
			
			System.out.println(pEncontrado);
			
		}*/
		
		/*System.out.println("¿Qué producto desea buscar?");
		nombre=Leer.dato();
		System.out.println("Diga el nuevo nombre");
		nombreNuevo = Leer.dato();
		
		pEncontrado = t.cambiarNombre(nombre ,nombreNuevo);
		
		System.out.println(pEncontrado); */
		
		System.out.println("Diga categoría");
		nombre=Leer.dato();
		
		t.listaProductosStandart(t.listarPorCategoria(nombre));
		
		System.out.println(t.sumarTodosLosProductos(lista));
		System.out.println(t.sumarTodosLosProductoDeUnaCategoria(nombre));
		
	}

}
