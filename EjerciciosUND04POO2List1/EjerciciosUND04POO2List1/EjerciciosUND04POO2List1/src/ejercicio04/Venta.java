package ejercicio04;

import java.util.Arrays;

public class Venta {

	private LineaVenta [] LV;

	public Venta(LineaVenta[] lV) {
		super();
		LV = lV;
	}

	public LineaVenta[] getLV() {
		return LV;
	}

	public void setLV(LineaVenta[] lV) {
		LV = lV;
	}

	@Override
	public String toString() {
		return "Venta [LV=" + Arrays.toString(LV) + "]";
	}
	
	public double calcularTotal(double iva, double descuento, double impuestoLujo) {
		double result=0.0;
		for(int i=0;i<LV.length;i++) {
			
			result+=LV[i].calcularImporte(iva, descuento, impuestoLujo);
		}
		return result;
	}

	public void agregarLineaVenta(int contador,LineaVenta l) {
		
		LV[contador]=l;
		
	}
	
	
}
