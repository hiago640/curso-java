package secao4_estrutura_controle.exercicio;

import java.util.Scanner;

public class Exercicio7 {

	/**
	 * 7. Criar um programa que enquanto estiver recebendo números positivos,
	 * imprime no console a soma dos números inseridos, caso receba um número
	 * negativo, encerre o programa. Tente utilizar a estrutura do while.
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int somatoria = 0;
		do {
			System.out.print("Digite um número.\nPara sair, insira um número negativo: ");
			numero = entrada.nextInt();
			
			somatoria += numero;
			
			System.out.println("A somatória dos números positivos inseridos é: " + somatoria);
			
		} while (numero >= 0);
			
		System.out.println("\nFinalizando...");

		entrada.close();
	}

}
