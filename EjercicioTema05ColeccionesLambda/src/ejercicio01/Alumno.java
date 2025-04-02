package ejercicio01;

public class Alumno {

	private String name;
	private String apellido;
	private String nameCur;
	private double notaMe;
	private int edad;
	
	public Alumno(String name, String apellido, String nameCur, double notaMe, int edad) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.nameCur = nameCur;
		this.notaMe = notaMe;
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNameCur() {
		return nameCur;
	}

	public void setNameCur(String nameCur) {
		this.nameCur = nameCur;
	}

	public double getNotaMe() {
		return notaMe;
	}

	public void setNotaMe(double notaMe) {
		this.notaMe = notaMe;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [name=" + name + ", apellido=" + apellido + ", nameCur=" + nameCur + ", notaMe=" + notaMe
				+ ", edad=" + edad + "]";
	}
	
	
	
	
}
