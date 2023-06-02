package secao04_estrutura_controle.exercicio;

public class Exercicio2 {

	/**
	 * 2. Criar um programa informa se o ano atual é um ano bissexto;
	 */

	public static void main(String[] args) {

		int ano = 2022;

		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
			System.out.println("O Ano " + ano + " é bissexto.");
		else
			System.out.println("O Ano " + ano + " não é bissexto.");
	}

}
