package secao5_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio09 {

	/**
	 * 9. Crie uma classe TrocaNumero que contenha um método que receba dois
	 * números, NumA e NumB ( nessa ordem ),imprima na e  ordem inversa, isto é, se
	 * NumA = 5 e NumB = 10, por exemplo, devem ser impressos na ordem NumA = 10 e
	 * NumB = 5.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int numA = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numB = scanner.nextInt();

		TrocaNumero trocaNumero = new TrocaNumero();
		trocaNumero.inverter(numA, numB);
		
		scanner.close();

	}

}
