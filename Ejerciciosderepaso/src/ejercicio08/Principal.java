package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreUsuario="JULIO";
		String contraseñaUsuario="PEPE";
		String nombre,contraseña;
		
		System.out.println("Introduzca el nombre de usuario");
		nombre=Leer.dato();
		System.out.println("Introduzca la contraseña");
		contraseña=Leer.dato();
		
		if(nombreUsuario.equals(nombre)&&contraseñaUsuario.equals(contraseña)) {
			
			System.out.println("Enhorabuena, tienes acceso");
			
		}else {
			System.out.println("Lo siento, vuelva a intentarlo");
		}

	}

}
