package ejercicio02;



import java.util.List;

import java.util.stream.Collectors;

public class Cadena {

	private List<String> list;

	public Cadena(List<String> list) {
		super();
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	//Ordenar las cadenas por orden alfabetico
	public List<String> OrdernarCadenaPorOrdenAlfabetico() {
		
		return list.stream().sorted().toList();
	}
	
	//Imprimir cualquier listado string
	
	public void imprimirListadoString(List<String> lista) {
		
		lista.stream().forEach(System.out::println);
	}
	
	//Buscar una cadena dada por teclado
	
	public List<String> buscarUnaCadenaPorTeclado(String texto){
		
		return list.stream().filter(a -> a.equalsIgnoreCase(texto)).toList();
		
	}
	
	//Crear un nuevo String formado por la primera letra de cada palabra que contiene la lista
	
	public String crearUnNuevoStringPorLaPrimeraLetra(List<String> listaPalabras) {
		
		return listaPalabras.stream().filter(palabra -> !palabra.isEmpty())	
				.map(palabra -> String.valueOf(palabra.charAt(0)))
				.collect(Collectors.joining());
		
	}
	
	//Borrar las palabras que tengan longitud impar de letras
	
		public List<String> borrarPalabrasConLongitudImpar (List<String> listaPalbras) {
			
			return listaPalbras.stream()
			.filter(palabra -> palabra.length()%2==0)
			.collect(Collectors.toList());					
			
		}
	
	//Pasar todas las palabras a mayusculas
	
	public  List<String> pasarTodasLasPalabrasMayuscula(List<String> newList){
		
		return newList.stream()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
	}	
	
}
