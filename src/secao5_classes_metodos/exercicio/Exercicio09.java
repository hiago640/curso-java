package secao5_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio09 {

	/**
	 * 9. Crie uma classe TrocaNumero que contenha um método que receba dois
	 * números, NumA e NumB ( nessa ordem ), e imprima na ordem inversa, isto é, se
	 * NumA = 5 e NumB = 10, por exemplo, devem ser impressos na ordem NumA = 10 e
	 * NumB = 5.
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
