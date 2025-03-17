package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usuarioUno;
		String contraseña;
		String usuarioReal="Antonio";
		String contraseñaReal="pepe";
		
		System.out.println("Bienvenidos, vamos a comprobar los datos para poder iniciar sesión");
		System.out.println("¿Me podrías indicar el nombre de usuario?");
		usuarioUno=Leer.dato();
		System.out.println("¿Me podría indicar una contraseña?");
		contraseña=Leer.dato();
		
		if(usuarioReal.equalsIgnoreCase(usuarioUno) && contraseñaReal.equalsIgnoreCase(contraseña)) {
			System.out.println("Enhorabuena, puedes acceder a tu cuenta");
			
		}
		else {
			System.out.println("Lo siento, intentalo de nuevo.");
		}
		
		

	}

}
