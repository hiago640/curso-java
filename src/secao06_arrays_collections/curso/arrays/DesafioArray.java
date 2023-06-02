package secao06_arrays_collections.curso.arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo ao sistema de gerenciamento de Notas.");

		System.out.print("Quantas notas deseja cadastrar?: ");
		int qtdNotas = Integer.parseInt(entrada.nextLine());

		double[] notas = new double[qtdNotas];
		
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Insira a " + (i + 1) + "º nota: ");
			notas[i] = Double.parseDouble(entrada.nextLine());
		}

		System.out.println("\nCalculando média...\n");

		double total = 0;
		for (double nota : notas)
			total += nota;

		System.out.printf("Média calculada: %s", total / notas.length);

		entrada.close();
	}
}
