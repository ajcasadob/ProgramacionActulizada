package ejercicio03;

import java.util.List;

public class Alumno {
    
    private String nombre;
    private String apellido;
    private int id;
    private int edad;
    private String dni;
    private String email;
    private List<Double> notas;

    public Alumno(String nombre, String apellido, int id, int edad, String dni, String email, List<Double> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
        this.dni = dni;
        this.email = email;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", edad=" + edad + ", dni=" + dni
                + ", email=" + email + ", notas=" + notas + "]";
    }

    

}
