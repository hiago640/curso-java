package secao4_estrutura_controle.exercicio;

import java.util.Scanner;

public class Exercicio4 {

	/**
	 * 4. Criar um programa que receba um número e diga se ele é um número primo.
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		int divisores = 0;
		for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	        	divisores++;
	    }
		
		if(divisores == 0)
			System.out.println("eh primo");
		else
			System.out.println("nao eh primo");

		
		entrada.close();
	}

}
