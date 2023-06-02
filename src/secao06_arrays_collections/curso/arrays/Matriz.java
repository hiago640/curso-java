package secao06_arrays_collections.curso.arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo ao sistema de gerenciamento de Notas.");

		System.out.print("Quantos alunos: ");
		int qtdAlunos = Integer.parseInt(entrada.nextLine());

		System.out.print("Quantas notas deseja cadastrar?: ");
		int qtdNotas = Integer.parseInt(entrada.nextLine());

		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

		System.out.println();
		double total = 0;
		
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Insira a %d º nota do aluno %d: ", (i + 1), (j + 1));
				notasDaTurma[i][j] += entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
			System.out.println();
		}

		System.out.println("\nCalculando média...\n");
		System.out.printf("Média da turma eh: %s", total / (qtdAlunos * qtdNotas));

		entrada.close();
	}

}
