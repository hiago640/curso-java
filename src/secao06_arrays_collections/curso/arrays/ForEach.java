package secao06_arrays_collections.curso.arrays;

public class ForEach {
	
	public static void main(String[] args) {
		
		double[] notas = new double[3];
		
		notas[0] = 7.9;
		notas[1] = 8;
		notas[2] = 6.7;
		
		for(double nota : notas)
			System.out.println(nota);
		
	}
}
