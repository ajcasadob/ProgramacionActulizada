package datos;

import utilidades.Leer;

public class DatosComodin {

	private int[] votos;

	public DatosComodin() {
		super();
		this.votos =new int[4];
	}
	
	public void solicitarVotos() {
		
		
		for(int i=0;i<votos.length;i++) {
			
			System.out.println("Votos para la opción"+(char)('A'+i)+":");
			votos[i]=Leer.datoInt();
		}
		
	}
	
	public void mostarPorcentajes() {
		int totalVotos=0;
		double porcentaje;
		for(int voto:votos) {
			totalVotos+=voto;
		}
		
		System.out.println("\nResultados del público");
		for(int i=0;i<votos.length;i++) {
		porcentaje=(totalVotos>0)?(votos[i]*100.0/totalVotos):0;
		System.out.printf("Opción %c: %.2f%%\n",(char)('A'+i),porcentaje);
		}
	}
	
}
