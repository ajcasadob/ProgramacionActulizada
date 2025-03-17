package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double largo= 50.0, ancho= 21.0, profundidad= 2.50, metroCubico= 1.80, circuProfu= 1.80, radio=12.0;
	double volumen1=0.0;
	double precioTotal=0.0;
	double voluCircu=0.0;
	double precioLlenado2=0.0;
	voluCircu=circuProfu*Math.PI*Math.pow(radio, 2);
	volumen1= largo* ancho* profundidad;
	precioTotal= volumen1*metroCubico;
	voluCircu=Math.round(voluCircu);
	precioLlenado2= voluCircu*metroCubico;
    System.out.println("Este es el volumen de la piscina "+volumen1+ " m3");
    System.out.println("Pues llenar la piscina cuesta "+precioTotal+" €");
    System.out.println("El volumen de la pisicina es "+voluCircu);
    System.out.println("Pues costara llenarla "+precioLlenado2);
    System.out.printf(" Aqui esta el precio de llenar la piscina con dos decimales, %.2f",precioLlenado2);
    
	}

}
