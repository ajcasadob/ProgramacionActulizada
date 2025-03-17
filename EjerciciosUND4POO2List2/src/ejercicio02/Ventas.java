package ejercicio02;

public class Ventas {

private Producto[] productos;
    
    public Ventas(Producto[] productos) {
        this.productos = productos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getCantidadTotalProductos() {
        int cantidadTotal = 0;
        for (Producto producto : productos) {
            cantidadTotal += producto.getCantidadProducto();
        }
        return cantidadTotal;
    }

    public double calcularCantidadTotal(){

        double totalRecaudado = 0.0;
        for (Producto producto : productos) {
            totalRecaudado += producto.getCantidadProducto() * producto.getPrecioBase();
        }
        return totalRecaudado;

    }

    public double devolverCambio(double aPagar, double dineroEntregado) {
        if (dineroEntregado < aPagar) {
            return -1; 
        }
        return dineroEntregado - aPagar;
    }

   

    public void mostrarListadoProductosConAviso() {
    for (Producto producto : productos) {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + producto.getCantidadProducto());
        System.out.println("Precio: " + producto.getPrecioBase());
    
        if (producto.getNombre().equalsIgnoreCase("espada laser")) {
            System.out.println("Aviso: Cuidadin al sacarla de la bolsa, que hace pupa.");
        }
        System.out.println("-------------------------");
    }
}
}
