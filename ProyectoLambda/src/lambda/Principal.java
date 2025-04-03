package lambda;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operacion suma = (int num1, int num2)-> num1+num2;
		
		System.out.println(suma.calcular(5, 2));
		
		
		Operacion multi = (int m1 , int m2 )-> m1*m2;
		
		System.out.println(multi.calcular(5, 5));
	}

}
