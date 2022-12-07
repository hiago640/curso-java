package secao4_estrutura_controle.exercicio;

import java.util.Scanner;

public class Exercicio5 {

	/**
	 * 5. Refatorar o exercício 04, utilizando a estrutura switch.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		int divisores = 0;
		for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	        	divisores++;
	    }
		
		switch (divisores) {
		case 0:
			System.out.println("eh primo");
			break;
		default:
			System.out.println("nao eh primo");
		}
		
		entrada.close();

	}

}
