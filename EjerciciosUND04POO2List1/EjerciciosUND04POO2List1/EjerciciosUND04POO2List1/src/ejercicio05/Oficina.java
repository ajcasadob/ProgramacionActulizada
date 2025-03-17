package ejercicio05;

import java.util.Arrays;

public class Oficina  {

	private Empleado [] lista;

	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularSueldoOficina(Empleado e, double ventas) {
	return	e.calcularSueldoBase(ventas);
	}
	
	public double calcularGastos(double ventas) {
		double result=0;
		for(Empleado e:lista) {
			result+=calcularSueldoOficina(e,ventas);
		}
		return result;
	}
	public void felicitarALosMejores(double ventas) {
		for(Empleado e:lista) {
			if(e instanceof Vendedor) {
				((Vendedor) e).comprobarVentas(ventas);
			}
		}
		
	}
	
}
