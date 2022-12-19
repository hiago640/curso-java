package secao5_classes_metodos.exercicio;

public class ComparaNumero {

	public static void comparar(int numA, int numB) {

		if (numA == numB) {
			System.out.println("Os valores recebidos, são iguais!");
		} else {
			System.out.println("Os valores recebidos, são diferentes!");

			if (numA > numB) {
				System.out.println("O maior valor é: " + numA);
				System.out.println("O menor valor é: " + numB);
			} else {
				System.out.println("O maior valor é: " + numB);
				System.out.println("O menor valor é: " + numA);
			}

		}

	}

}
