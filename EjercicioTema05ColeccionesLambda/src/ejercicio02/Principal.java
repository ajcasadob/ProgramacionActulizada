package ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> lista = new ArrayList<String>();
		List<String> listaBuscada = new ArrayList<String>();
		Cadena ca = new Cadena(lista);
		
		lista.add("Hola");
		lista.add("Antonio");
		lista.add("Ana");
		
		ca.imprimirListadoString(ca.OrdernarCadenaPorOrdenAlfabetico());
		
		
		listaBuscada = ca.buscarUnaCadenaPorTeclado("ana");
		if(listaBuscada.size()>0) {
			ca.imprimirListadoString(listaBuscada);
		}else {
			System.out.println("No hay nada");
		}
		
		
		
	}

}
