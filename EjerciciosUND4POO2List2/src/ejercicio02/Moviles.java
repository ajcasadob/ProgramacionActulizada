package ejercicio02;

public class Moviles extends Producto {

	 private String marca;

	    public Moviles(double precioBase, int cantidadProducto, String nombre, String marca) {
	        super(precioBase, cantidadProducto, nombre);
	        this.marca = marca;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    @Override
	    public double calcularPVP(double porcentaje) {
	        double result=0.0;
	        result=super.getPrecioBase()*porcentaje/100;

	        return result+porcentaje;
	    }


	
}
