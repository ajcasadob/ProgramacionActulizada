package model;

import java.util.Objects;

public class Producto implements Comparable<Producto> {

	 	private int id;
	    private String nombre;
	    private double precio;
	    private String categoria;
	    private int stock;
	    
		public Producto(int id, String nombre, double precio, String categoria, int stock) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.categoria = categoria;
			this.stock = stock;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

		@Override
		public String toString() {
			return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria
					+ ", stock=" + stock + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(categoria, id, nombre, precio, stock);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Producto other = (Producto) obj;
			return Objects.equals(categoria, other.categoria) && id == other.id && Objects.equals(nombre, other.nombre)
					&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio) && stock == other.stock;
		}

		@Override
		public int compareTo(Producto o) {
			
			return nombre.compareTo(getNombre());
		}
	    
	    



	
}
