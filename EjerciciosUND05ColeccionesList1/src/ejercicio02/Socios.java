package ejercicio02;

public class Socios implements Comparable<Socios> {
	
	private String nombre;
	private String apellido;
	private int id;
	private String dni;
	private int edad;
	
	
	public Socios(String nombre, String apellido, int id, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.dni = dni;
		this.edad = edad;
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


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Socios [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", dni=" + dni + ", edad=" + edad
				+ "]";
	}


	
	@Override
	public int compareTo(Socios o) {
	    if (this.id > o.id) {
	        return 1;
	    } else if (this.id < o.id) {
	        return -1;
	    } else {
	        return 0;
	    }
	}

	
	
	
}


