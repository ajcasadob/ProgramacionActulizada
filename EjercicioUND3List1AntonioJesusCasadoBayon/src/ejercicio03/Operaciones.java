package ejercicio03;

public class Operaciones {
	
	public String comprobadorPositivoNegativo(int numero) {
		
		if(numero>0) {
			
			return "Positivo";
				
		}else {
			return "Negativo";
		}
		
	}
	
	public String comprobadorParImpar(int numero) {
		
		if(numero%2==0) {
			
			return "Par";
			
		}else {
			return "Impar";
		}
		
		
	}
}
