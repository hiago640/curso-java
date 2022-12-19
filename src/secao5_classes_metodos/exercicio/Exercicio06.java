package secao5_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio06 {

	/**
	 * 6. Crie uma função que receba o nome e a idade de 3 pessoas e diga qual o
	 * nome da pessoa mais velha e o nome da pessoa mais nova.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o nome da 1º pessoa: ");
		String nome1 = entrada.nextLine();
		
		System.out.print("Insira a idade da 1º pessoa: ");
		int idade1 = Integer.parseInt(entrada.nextLine());

		System.out.print("Insira o nome da 2º pessoa: ");
		String nome2 = entrada.nextLine();
		
		System.out.print("Insira a idade da 2º pessoa: ");
		int idade2 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Insira o nome da 3º pessoa: ");
		String nome3 = entrada.nextLine();
		
		System.out.print("Insira a idade da 3º pessoa: ");
		int idade3 = Integer.parseInt(entrada.nextLine());
		
		maisVelhaEMaisNova(nome1, idade1, nome2, idade2, nome3, idade3);
		
		entrada.close();
	}
	
	static void maisVelhaEMaisNova(String nome1, int idade1, String nome2, int idade2, String nome3, int idade3) {
		
		if (idade1 > idade2 && idade1 > idade3) {
			System.out.printf("\nA pessoa mais velha é: %s ", nome1);
		} else if (idade2 > idade1 && idade2 > idade3) {
			System.out.printf("\nA pessoa mais velha é: %s ", nome2);
		} else {
			System.out.printf("\nA pessoa mais velha é: %s ", nome3);
		}

		if (idade1 < idade2 && idade1 < idade3) {
			System.out.printf("\nA pessoa mais nova é: %s ", nome1);
		} else if (idade2 < idade1 && idade2 < idade3) {
			System.out.printf("\nA pessoa mais nova é: %s ", nome2);
		} else {
			System.out.printf("\nA pessoa mais nova é: %s ", nome3);
		}
		
	}

}
