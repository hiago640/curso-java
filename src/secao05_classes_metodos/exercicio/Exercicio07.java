package secao05_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio07 {

	/**
	 * 7. Crie uma classe NumeroDecrescente que contenha um método que receba um
	 * número inteiro e imprima, em ordem decrescente, o valor do número até 0.
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();

		NumeroDecrescente decrescente = new NumeroDecrescente();
		decrescente.imprimirEmOrdemDecrescente(numero);

		entrada.close();
	}

}
