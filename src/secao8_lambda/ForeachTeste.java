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
		// o forEach � um metodo que recebe uma express�o lambda que ser� executada para
		// cada itera��o!
		aprovados.forEach((nome) -> System.out.println(nome + "!!!"));
		// Quando � passado apenas um par�metro pra fun��o, pode-se tirar os par�nteses
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference #01");
		// Recebe um par�metro, percorrendo cada elemento e passando cada nome e
		// apresentando no println
		// Leia: para cada aprovado chame o m�todo System.out::println
		aprovados.forEach(System.out::println);
		
		System.out.println("\nForma Lambda #02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02");
		aprovados.forEach(ForeachTeste::meuImprimir);
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome � " + nome);
	}

}
