package secao05_classes_metodos.curso;

public class AreaCircunferenciaTeste {

	public static void main(String[] args) {
		
		AreaCircunferencia a1 = new AreaCircunferencia(10);
		//a1.pi = 10;
		System.out.println(AreaCircunferencia.pi);
		System.out.println(a1.area());
		
		AreaCircunferencia a2 = new AreaCircunferencia(5);
		//a2.pi = 5;
		System.out.println(AreaCircunferencia.pi);
		System.out.println(a2.area());
		
	}

}
