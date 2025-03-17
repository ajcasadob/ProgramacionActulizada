package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Una silla es un objeto con un respaldar y 4 patas en la que te puedes sentar
		//Los objetos tienen una funcionalidad que se le llama (metodos), y tienen atributos.
		//Todos los atributos van en clase PRIVATE
		//a todo lo demas se pone en la clase PUBLIC
		//Getter y setter son los metodos de acceso para llamar a las clases.
		//Un metodo es un trozo de codigo que hace algo
		// tipo(devolucion) nombre ( parametros o argumentos){}nombre=minuscula, infinito.
		//El nombre de los metodos tienen que ser verbos en infinitivo
		//Los metodos son los que dan el comportamiento por eso van en infinitivo.
		//La (devolucion) es solo un tipo(int,double)
		//Los parametros son aquellos datos que hay que darle al metodo para que haga lo que tiene que hacer.
		// si hay mas de uno van separados por coma, y no es necesario que sean del mismo tipo
		
		
		
		
	
		
		
		Alumno a=new Alumno();
		
		System.out.println(a.getEdad());
		
		a.setEdad(18);
		
		System.out.println(a.getEdad());
		

	}

}
