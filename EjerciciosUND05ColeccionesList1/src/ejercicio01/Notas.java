package ejercicio01;


import java.util.List;

public class Notas {

		private List<Nota> listnotas;
		
		public Notas(List<Nota> listnotas) {
		    this.listnotas=listnotas;
		    
		}
		
		public void agregarNota(Nota nota) {
		    listnotas.add(nota);
		}
		
		public void eliminarNota(Nota nota) {
		    listnotas.remove(nota);
		}
		
		public void mostrarNotas() {
		    for (Nota nota : listnotas) {
		        System.out.println(nota);
		    }
		}
}


