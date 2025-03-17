package ejemploarraydeobjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam,nVs=0,seguir;
		Vehiculo lista[];
		String modelo;
		double potencia;
		
			System.out.println("Diga número de vehiculos");
			tam=Leer.datoInt();
			lista=new Vehiculo[tam];
			
		do {
			
			
			System.out.print("Introduce el modelo del vehículo: ");
			modelo = Leer.dato();
			System.out.print("Introduce la potencia: ");
			potencia=Leer.datoDouble();
			
			lista[nVs]=new Vehiculo (modelo, potencia);
			
			nVs++;//Aumentamos en uno el número de vehículos
			
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			seguir=Leer.datoInt();
			
			} while(seguir !=0 && nVs<lista.length);
		
		//VARIAS POSIBILIDADES
		
		lista[0]=new Vehiculo(modelo,potencia);
		
		//System.out.println(lista[0]);
		//Solo para un modelo
		//System.out.println(lista[0].getModelo());
		//En lista para todos los modelos
		for(int i=0;i<nVs;i++) {
			
			System.out.println(lista[i]);
		}
		
	}

}
