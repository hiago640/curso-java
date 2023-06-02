package secao05_classes_metodos.exercicio;

import java.util.Scanner;

import secao05_classes_metodos.curso.Data;

public class Exercicio13 {

	/**
	 * 13. Crie uma classe Data com os seguintes atributos: Dia, Mês e Ano.
	 * Verifique antes da inicialização de um objeto Data se a data inserida é
	 * válida;
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o dia da data: ");
		int dia = scanner.nextInt();

		System.out.print("Digite o mes da data: ");
		int mes = scanner.nextInt();

		System.out.print("Digite o ano da data: ");
		int ano = scanner.nextInt();

		while((dia <= 0 || dia > 31) || (mes <= 0 || mes > 12)) {
			System.out.println("Data inválida, insira novamente:");
			
			System.out.print("Digite o dia da data: ");
			dia = scanner.nextInt();

			System.out.print("Digite o mes da data: ");
			mes = scanner.nextInt();

			System.out.print("Digite o ano da data: ");
			ano = scanner.nextInt();
		}
		
		Data data = new Data(dia, mes, ano);
		System.out.println(data.obterDataFormatada());
		
		scanner.close();

	}

}
