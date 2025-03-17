package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dineroDepositado,porcentajeMantenimiento,porcentajeInteres,diasAbierta;
		double anual=365;
		double mantenimientoDiario,totalMantenimiento,interesDiario,totalInteres,ganancia;
		
	System.out.println("Bienvenido, con este programa vamos a calcular sus intereses bancarios");
	
    System.out.println("Indique cuánto dinero ha depositado en el banco");
    dineroDepositado=Leer.datoDouble();
    
    System.out.println("¿Qué porcentaje de mantenimiento tiene?");
    porcentajeMantenimiento=Leer.datoDouble();
    
    System.out.println("¿De cuánto es su interés?");
    porcentajeInteres=Leer.datoDouble();
    
    System.out.println("¿ Cuántos dias lleva abierta su cuenta?");
    diasAbierta=Leer.datoDouble();
    
    mantenimientoDiario=dineroDepositado*porcentajeMantenimiento/anual;
    totalMantenimiento=mantenimientoDiario*diasAbierta;
    interesDiario=dineroDepositado*porcentajeInteres/anual;
    totalInteres=interesDiario*diasAbierta;
    ganancia=totalInteres-totalMantenimiento;
    
    System.out.printf("Para una cuenta con un saldo de %.1f € abierta desde hace %.0f dias, tendrá un mantenimiento de %.1f € y un interes"
    		+ "de %.1f € anual.",dineroDepositado,diasAbierta,totalMantenimiento,totalInteres);
    System.out.printf("\nEsto tendrá una ganacia de %.1f €",ganancia);
    
    
	}

}
