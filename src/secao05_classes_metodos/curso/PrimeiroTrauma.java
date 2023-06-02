package secao05_classes_metodos.curso;

public class PrimeiroTrauma {

	int a = 3; //n pode mexer aqui!
	static int b = 3;
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		
		// pode mexer aqui
		System.out.println(p.a);
		
		// pode mexer aqui
		System.out.println(b);
	}
}
