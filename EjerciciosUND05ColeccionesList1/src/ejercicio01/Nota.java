package ejercicio01;

public class Nota {

private String titulos;
private String contenido;
private String fecha;

public Nota(String titulos, String contenido, String fecha) {
    this.titulos = titulos;
    this.contenido = contenido;
    this.fecha = fecha;
}

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Nota{" + "titulos=" + titulos + ", contenido=" + contenido + ", fecha=" + fecha + '}';
    }


}
