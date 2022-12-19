package secao5_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio10 {

	/**
	 * 10. Crie uma classe ComparaNumero que contenha um método que receba dois
	 * números e indique se são iguais ou se são diferentes. Mostre o maior número e
	 * o menor número ( nesta sequência ).
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
