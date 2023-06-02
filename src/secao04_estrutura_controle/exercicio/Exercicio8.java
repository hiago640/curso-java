package secao04_estrutura_controle.exercicio;

import java.util.Scanner;

public class Exercicio8 {

	/**
	 * 8. Criar um programa que receba uma palavra e imprime no console letra por
	 * letra.
	 * 
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira uma palavra: ");
		String palavra = entrada.nextLine();
		
		for(char c : palavra.toCharArray())
			System.out.println(c);

		entrada.close();
	}

}
