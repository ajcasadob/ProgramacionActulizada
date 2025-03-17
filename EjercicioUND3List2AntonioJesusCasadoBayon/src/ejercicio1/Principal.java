package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		
		//Sección 1 alimentacion, 4 electronica
		
		
		//Producto p1= new Producto (1,1.20,"Fanta",false,1);
		//Producto p3= new Producto (2,85.99,"Pantalla LG",true,4);
		
		//Producto lista[]= {p1,p3};
		//Tienda t;
		
		//t=new Tienda(lista);
		
		//t.listarTodos();
		
		//t.imprimirFragil(1, 2);
		
		int tam=100,numProductos=0;
		
		Producto p1= new Producto (1,1.20,"Fanta",false,1);
		Producto p3= new Producto (2,85.99,"Pantalla LG",true,4);
		Producto lista[]=new Producto[tam];
		Tienda t;
		t=new Tienda(lista);
		
		t.agregarProductos(p1, numProductos);
		numProductos++;
		t.agregarProductos(p3, numProductos);
		numProductos++;
		t.agregarProductos(p1, numProductos);
		numProductos++;
		
		t.listarTodos();
		
		
		
		
		
		
		

	}

}
