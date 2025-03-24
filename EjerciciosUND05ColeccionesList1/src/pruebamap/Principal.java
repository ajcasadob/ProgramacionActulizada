package pruebamap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int opcion;
		Map<Integer, Contacto> lista = new HashMap<>();
		
		Contacto c1 = new Contacto(4,"Juan","45464t45");
		Contacto c2 = new Contacto(2,"Pepe","4849494t");
		Contacto c3 = new Contacto(3,"Pedro","45454g4");
		
		Agenda a = new Agenda(lista);
		
		lista.put(2, c1);
		lista.put(20, c2);
		lista.put(4, c3);
		
		
		System.out.println(a);
		System.out.println(a.getLista().keySet());
		
		System.out.println(a.buscarPorNombre("Juan"));
		
		System.out.println(a.buscarPorId(20));
		
		System.out.println(a.ordenarPorKey());
		
		System.out.println("Ordenado por Nombre:");
        Map<Integer, Contacto> ordenado = a.ordenarPorNombre(lista);
        ordenado.forEach((k, v) -> System.out.println(k + " => " + v));
		
	}

}
