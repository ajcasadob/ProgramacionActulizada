package ejercicio02;

public class Espadalaser extends Producto {

	private String tipo;
    private boolean disponibilidad;

    public Espadalaser(double precioBase, int cantidadProducto, String nombre, String tipo, boolean disponibilidad) {
        super(precioBase, cantidadProducto, nombre);
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public double calcularPVP(double porcentaje) {
        double result=0.0;
        result=super.getPrecioBase()*porcentaje/100;
        if ("doble".equalsIgnoreCase(tipo)) {
            result += 50; 
        }
        result += super.getPrecioBase();

        return result;
    }
    
}
