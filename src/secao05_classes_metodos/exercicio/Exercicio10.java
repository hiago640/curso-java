package secao05_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio10 {

	/**
	 * 10. Crie uma classe ComparaNumero que contenha um método que receba dois
	 * números e indique se são iguais ou se são diferentes. Mostre o maior número e
	 * o menor número ( nesta sequência ).
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int numA = entrada.nextInt();

		System.out.println("Digite o segundo numero: ");
		int numB = entrada.nextInt();

		ComparaNumero.comparar(numA, numB);

		entrada.close();
	}

}
