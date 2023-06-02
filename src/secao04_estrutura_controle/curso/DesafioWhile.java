package secao04_estrutura_controle.curso;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota: ");
			nota = entrada.nextDouble();
			
			qtdNotas++;
			total += nota;
		}

		double media = total / qtdNotas;
		
		System.out.println("Média: " + media);
		
		entrada.close();
	}
}
