package secao05_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio05 {

	/**
	 * 5. Valor Perfeito: Um número é considerado perfeito quando a soma dos seus
	 * divisores – exceto ele – resulta o seu valor. Ex: 6 = 1 + 2 + 3 Crie uma
	 * função que recebe como parâmetro um número e identifique se o número é
	 * perfeito ou não.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira um numero: ");
		int numero = entrada.nextInt();
		
		int soma = 0;
		for (int i = 1; i < numero; i++) {
	        	
			if (numero % i == 0) {
	        	soma += i;
	        	System.out.println(i);
	        }
	    }
		
		if(soma == numero)
			System.out.println("\nO Nro. " + numero + " eh um valor perfeito.");
		else
			System.out.println("\nO Nro. " + numero + " nao eh um valor perfeito.");
		
		
		entrada.close();

	}

}
