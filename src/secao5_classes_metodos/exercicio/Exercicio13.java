package secao5_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio13 {

	/**
	 * 13. Crie uma classe Data com os seguintes atributos: Dia, Mês e Ano. Verifique
	 * antes da inicialização de um objeto Data se a data inserida é válida;
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
