package crud;

import java.util.*;
import model.Libro;

public class LibroCrud {

	private List<Libro> listaLibros = new ArrayList<>();

	public void agregarLibro(Libro libro) {
		listaLibros.add(libro);
	}

	public void eliminarLibro(String titulo) {
		listaLibros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
	}

	public void listarLibros() {
		if (listaLibros.isEmpty()) {
			System.out.println("No hay libros.");
		} else {
			listaLibros.forEach(System.out::println);
		}
	}

	public void ordenarLibrosPorTitulo() {
		Collections.sort(listaLibros);
	}

	public void invertirOrden() {
		Collections.reverse(listaLibros);
	}

	public void buscarLibro(String titulo) {
		ordenarLibrosPorTitulo();
		int index = Collections.binarySearch(listaLibros, new Libro(titulo, "", 0));
		if (index >= 0) {
			System.out.println("Encontrado: " + listaLibros.get(index));
		} else {
			System.out.println("No se encontró el libro.");
		}
	}

	public void mostrarLibroMasAntiguo() {
		Libro masAntiguo = Collections.min(listaLibros, Comparator.comparingInt(Libro::getAnioPublicacion));
		System.out.println("Libro más antiguo: " + masAntiguo);
	}

	public List<Libro> obtenerListaSincronizada() {
		return Collections.synchronizedList(listaLibros);
	}

	public List<Libro> obtenerListaInmutable() {
		return Collections.unmodifiableList(new ArrayList<>(listaLibros));
	}
}
