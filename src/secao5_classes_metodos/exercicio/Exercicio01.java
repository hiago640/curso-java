package secao5_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio01 {
	
	/**
	 * 1. Crie uma função que recebe dois números e imprima a soma desses dois
	 * números.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double a = scanner.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double b = scanner.nextDouble();
		
		double soma = somatoria(a, b);
		
		System.out.println("A somatória eh: " + soma);
		
		scanner.close();
	}
	
	static double somatoria(double a, double b) {
		
		return a + b;
	}
}