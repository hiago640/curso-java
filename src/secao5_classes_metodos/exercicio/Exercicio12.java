package secao5_classes_metodos.exercicio;

import java.util.Scanner;

public class Exercicio12 {

	/**
	 * 12. Modele uma classe Carro com os seguintes atributos: Nome do fabricante,
	 * Modelo do carro, Ano do Carro. Crie o construtor para a classe Carro. Altere
	 * os atributos para serem privados e crie os métodos get e set para cada
	 * atributo. Crie um método apresentar(), a qual imprimirá no console as
	 * informações do Carro.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira uma palavra: ");
		String palavra = entrada.nextLine();
		
		for(char c : palavra.toCharArray())
			System.out.println(c);

		entrada.close();
	}

}
