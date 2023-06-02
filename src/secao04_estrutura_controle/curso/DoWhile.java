package secao04_estrutura_controle.curso;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas...");

			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		} while (!"por favor".equalsIgnoreCase(texto));

		System.out.println("Saiu!!!");
		entrada.close();
	}

}
