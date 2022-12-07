package secao4_estrutura_controle.exercicio;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	/**
	 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
	 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
	 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
	 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
	 * o número armazenado.
	 */

	public static void main(String[] args) {

		int numeroAleatorio = new Random().nextInt(100 + 1);
		Scanner entrada = new Scanner(System.in);

		int tentativas = 0;
		int numeroEntrada;
		while (tentativas <= 10) {
			System.out.println("\nTentativas restantes: " + (10 - tentativas));
			System.out.print("Digite um número de 0 a 100: ");
			numeroEntrada = entrada.nextInt();

			if (numeroEntrada < numeroAleatorio)
				System.out.println("O número digitado é menor ao Número Aleatório gerado.");
			else if (numeroEntrada > numeroAleatorio)
				System.out.println("O número digitado é maior ao Número Aleatório gerado.");
			else {
				System.out.println("Você acertou o número aleatório.");
				break;
			}

			tentativas++;
		}

		entrada.close();

	}

}
