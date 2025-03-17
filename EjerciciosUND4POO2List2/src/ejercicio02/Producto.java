package ejercicio02;

public abstract class Producto {

	 private double precioBase;
	    private int cantidadProducto;
	    private String nombre;

	    public Producto(double precioBase, int cantidadProducto, String nombre) {
	        this.precioBase = precioBase;
	        this.cantidadProducto = cantidadProducto;
	        this.nombre = nombre;
	    }

	    public double getPrecioBase() {
	        return precioBase;
	    }

	    public void setPrecioBase(double precioBase) {
	        this.precioBase = precioBase;
	    }

	    public int getCantidadProducto() {
	        return cantidadProducto;
	    }

	    public void setCantidadProducto(int cantidadProducto) {
	        this.cantidadProducto = cantidadProducto;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public abstract double calcularPVP(double porcentaje);
	
}
