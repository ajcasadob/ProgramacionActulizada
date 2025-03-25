package model;

public class Libro implements Comparable<Libro> {

	private String titulo;
	private String autor;
	private int anioPublicacion;

	public Libro(String titulo, String autor, int anioPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	@Override
	public String toString() {
		return titulo + " - " + autor + " (" + anioPublicacion + ")";
	}

	@Override
	public int compareTo(Libro otro) {
		return this.titulo.compareToIgnoreCase(otro.titulo);
	}

}
