package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Socios so = new Socios("Antonio","Casado",0,"4343563",24);
		Socios so1 = new Socios("Pepe","Oliva",1,"3435353",25);
		Socios so2 = new Socios("Jesus","Santos",2,"4545646",26);
		Socios so3 = new Socios("Lucas","Ortiz",3,"4546474",27);
		Socios so4 = new Socios("Jose","Pastor",4,"3435363",28);
		
		
		
		
		List<Socios> lista = new ArrayList<Socios>();
		CrudSocio crdSo = new CrudSocio(lista);
		
		lista.add(so);
		lista.add(so1);
		lista.add(so2);
		lista.add(so3);
		lista.add(so4);
		
		lista.remove(0);
		
		System.out.println(	crdSo.buscarPorId(1));
;
		
		
		
		
		
		
		
		sc.close();
	}

}
