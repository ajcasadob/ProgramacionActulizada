package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado e1=new Empleado("Antonio","Casado",1200.0,1);
		Empleado e2= new Vendedor("German","Pastoer",1250.0,2,27000.0,20.0);
		Empleado e3=new Gerente("Juan","Casado",2000.0,3,950);
		Empleado e4=new Vendedor("Ruben","Pastor",1500.0,4,24000.0,25.0);
		Empleado [ ] lista= {e1,e2,e3,e4};
		
		
		Oficina o=new Oficina(lista);
		
		System.out.println("Bienvenido a la oficina");
		
		for(int i=0; i<o.getLista().length;i++) {
			
			System.out.println("EMPLEADO nº"+lista[i].getNumeroID());
			System.out.println(o.calcularSueldoOficina(lista[i], 500.0)+"€");
		}
		
		
		o.felicitarALosMejores(500.0);
	}

}
