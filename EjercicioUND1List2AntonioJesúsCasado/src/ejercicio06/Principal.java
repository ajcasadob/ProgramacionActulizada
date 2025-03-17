package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double horasNTrabajada;
		double precioHNormalTrabajada;
		double horasExTrabajada;
		double precioHextraTrabajada;
		double salarioHNormal;
		double salarioHExtra;
		double totalSalario;
		
		System.out.println("Bienvenido, este programa sirve para calcular el sueldo de un trabajador");
		
		System.out.println("¿Me podría indicar cuantas horas normales has trabajado?");
		horasNTrabajada=Leer.datoDouble();
		System.out.println("Indica aqui a cuanto cobra la hora normal");
		precioHNormalTrabajada=Leer.datoDouble();
		
		System.out.println("¿Me podría indicar cuantas horas extras has realizado?");
		horasExTrabajada=Leer.datoDouble();
		
		System.out.println("Indica aqui a cuanto cobra la hora extra");
		precioHextraTrabajada=Leer.datoDouble();
		
		salarioHNormal=horasNTrabajada*precioHNormalTrabajada;
		salarioHExtra=horasExTrabajada*precioHextraTrabajada;
		totalSalario=salarioHNormal+salarioHExtra;
		
		System.out.printf("Usted ha realizado un total de %.2f horas normales y ha "
				+ "cobrado un total de %.2f € también ha "
				+ "realizado %.2f horas extras que hace un total de %.2f € "
				+ "si sumamos todo, ha cobrado "
				+ "un total de %.2f € de salario total",horasNTrabajada,salarioHNormal,horasExTrabajada,salarioHExtra,totalSalario);

	}

}
