package secao5_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio14 {

	/**
	 * 14. Modele uma classe Produto com os seguintes atributos: Nome do produto,
	 * Preço do produto, Id do produto e Desconto a ser aplicado no produto. Crie
	 * um método que calcule o preço do produto com desconto. Realize um reajuste
	 * no atributo Desconto de forma que altere o desconto em todos os outros
	 * produtos.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um numero: ");
			int valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();

	}

}
