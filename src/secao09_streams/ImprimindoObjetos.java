package secao09_streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lu", "Luca");
		
		System.out.println("---- For Each ----");
		
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n---- For ----");
		
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
	
		System.out.println("\n---- ITERATOR ----");
		
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n---- Stream ----");
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}

}
