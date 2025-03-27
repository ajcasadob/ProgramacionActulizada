package ejercicio;

import java.util.Objects;

public class Mensaje implements Comparable<Mensaje>{

	//Clase POJO
	private int id;
	private String nameContc;
	private String texMen;
	
	public Mensaje(int id, String nameContc, String texMen) {
		super();
		this.id = id;
		this.nameContc = nameContc;
		this.texMen = texMen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameContc() {
		return nameContc;
	}

	public void setNameContc(String nameContc) {
		this.nameContc = nameContc;
	}

	public String getTexMen() {
		return texMen;
	}

	public void setTexMen(String texMen) {
		this.texMen = texMen;
	}

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", nameContc=" + nameContc + ", texMen=" + texMen + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nameContc, texMen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return id == other.id && Objects.equals(nameContc, other.nameContc) && Objects.equals(texMen, other.texMen);
	}

	@Override
	public int compareTo(Mensaje m) {
		// TODO Auto-generated method stub
		return this.nameContc.compareTo(m.getNameContc());
		
	}
	
	
	
	
}
