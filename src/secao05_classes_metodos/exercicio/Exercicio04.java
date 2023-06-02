package secao05_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio04 {

	/**
	 * 4. Crie uma função que recebe um número como argumento e retorna os
	 * números "Primos" até ele.
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		for (int i = 2; i <= numero; i++) {
			if (ehPrimo(i))
				System.out.println(i + " é primo.");
		}
		
		entrada.close();
	}
	
	static boolean ehPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}

}
