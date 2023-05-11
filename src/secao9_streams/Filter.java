package secao9_streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(numeros);

		System.out.println("Mostrar somente numeros pares");
		numeros.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
	}
}
