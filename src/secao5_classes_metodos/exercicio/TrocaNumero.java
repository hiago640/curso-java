package secao5_classes_metodos.exercicio;

public class TrocaNumero {

	public void inverter(int numA, int numB) {
		System.out.println("Valores antes da inversão: ");
		System.out.println("NumA = " + numA);
		System.out.println("NumB = " + numB);
	
		int reserva = numA;
		
		numA = numB;
		numB = reserva;
		
		System.out.println("Valores após da inversão: ");
		System.out.println("NumA = " + numA);
		System.out.println("NumB = " + numB);
	}

}
