package secao4_estrutura_controle.curso;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// Domingo -> 1
		// Quarta -> 4
		// terça -> 2

		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o dia da semana: ");
		String diaDaSemana = entrada.nextLine();

		int dia = 0;
		if ("domingo".equalsIgnoreCase(diaDaSemana))
			dia = 1;
		else if ("segunda".equalsIgnoreCase(diaDaSemana))
			dia = 2;
		else if ("terça".equalsIgnoreCase(diaDaSemana))
			dia = 3;
		else if ("quarta".equalsIgnoreCase(diaDaSemana))
			dia = 4;
		else if ("quinta".equalsIgnoreCase(diaDaSemana))
			dia = 5;
		else if ("sexta".equalsIgnoreCase(diaDaSemana))
			dia = 6;
		else if ("sábado".equalsIgnoreCase(diaDaSemana))
			dia = 7;
		else 
			System.out.println("Dia inválido.");

		System.out.println("O dia da semana escolhido foi: " + dia);;
	}

}
