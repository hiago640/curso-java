package secao5_classes_metodos.exercicio;

import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {

	/**
	 * 11. Modele uma classe Pessoa, com os seguintes atributos: Nome, Idade,
	 * Altura, CPF, Data de nascimento.
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
