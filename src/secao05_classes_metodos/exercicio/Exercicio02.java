package secao05_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio02 {
	
	/**
	 * 2. Crie uma função que múltiplos números inteiros, e retorne o maior
	 * número.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int a = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int b = scanner.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int c = scanner.nextInt();
		
		int maiorNumero = maiorNumero(a, b, c);
		
		System.out.println("O maior numero eh: " + maiorNumero);
		
		scanner.close();
		
	}
	
	static int maiorNumero(int a, int b, int c) {
		int maiorNumero = a;
		
		if(maiorNumero < b) {
			maiorNumero = b;
			if(maiorNumero < c) {
				maiorNumero = c;
			}
		}
		
		return maiorNumero;
	}

}
