package secao8_lambda;

import java.util.Arrays;
import java.util.List;

public class ForeachTeste {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Forma tradicional...");
		for(String nome : aprovados) 
			System.out.println(nome);
		
		System.out.println("\nForma Lambda #01");
		// o forEach é um metodo que recebe uma expressão lambda que será executada para
		// cada iteração!
		aprovados.forEach((nome) -> System.out.println(nome + "!!!"));
		// Quando é passado apenas um parâmetro pra função, pode-se tirar os parênteses
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference #01");
		// Recebe um parâmetro, percorrendo cada elemento e passando cada nome e
		// apresentando no println
		// Leia: para cada aprovado chame o método System.out::println
		aprovados.forEach(System.out::println);
		
		System.out.println("\nForma Lambda #02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02");
		aprovados.forEach(ForeachTeste::meuImprimir);
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}

}
