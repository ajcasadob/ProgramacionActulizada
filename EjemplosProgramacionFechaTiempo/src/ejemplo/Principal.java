package ejemplo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FECHAS
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaEspecifica = LocalDate.of(2024, 3, 23);
		LocalDate fechaDesdeCadena = LocalDate.parse("2024-03-30");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaFormateada = fechaActual.format(formato);
		
		
		System.out.println(fechaActual);
		System.out.println(fechaEspecifica);
		System.out.println(fechaDesdeCadena);
		
		System.out.println(fechaFormateada);
		
		System.out.println(fechaActual.getDayOfMonth());
		//Siguiente domingo		
		LocalDate sigDomingo = fechaActual.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println(sigDomingo);
		
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime fixedTime = LocalTime.of(14, 30);
		System.out.println(fixedTime);
		
		
		 int hora = now.getHour();
		System.out.println(hora);
		 int minutos =now.getMinute();
		System.out.println(minutos);
		int sec = now.getSecond();
		System.out.println(sec);
	}

}
