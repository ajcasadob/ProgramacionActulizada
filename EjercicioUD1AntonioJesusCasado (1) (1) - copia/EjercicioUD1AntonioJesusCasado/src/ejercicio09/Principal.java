package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int puebloCant;
	int teatroCant;
	int conciertoU2Cant;
	int campNouCant;
	String nombreLugar;
	double campNouPuebloCant, teatroPuebloCant, conciertoPuebloCant;
	
	System.out.println("Bienvenido, este programa va a calcular "
			+ "la capacidad de personas que admite un lugar ");
	
    System.out.println("¿Podrías indicarme el nombre de tu pueblo?");
    nombreLugar=Leer.dato();
    
    System.out.println("¿Cúantos habitantes tiene tu pueblo?");
    puebloCant=Leer.datoInt();
    
    System.out.println("¿Cúantas personas caben en el Camp Nou?");
    campNouCant=Leer.datoInt();
    campNouPuebloCant= (double)campNouCant/puebloCant;
    
    
    System.out.println("¿Cuantas personas caben en el teatro?");
    teatroCant=Leer.datoInt();
    teatroPuebloCant = (double)teatroCant/puebloCant;
    
    System.out.println("¿Cúantas personas fueron al concierto de U2?");
    conciertoU2Cant=Leer.datoInt();
    conciertoPuebloCant=(double)conciertoU2Cant/puebloCant;
    
    System.out.printf("\nEl Camp Nou tiene una capacidad de %.1f %s ",campNouPuebloCant,nombreLugar);
    System.out.printf("\nEl teatro tiene una capacidad de %.1f %s ",teatroPuebloCant,nombreLugar);
    System.out.printf("\nEl tuvo una capacidad de %.1f %s ",conciertoPuebloCant,nombreLugar);
	}

}
