package secao9_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
	
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Consumer<Integer> print = System.out::print;
		
		/**
		 * 1. Numero para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para numero inteiro => "011" => 3
		 */
		
		Function<Integer, String> conversaoInteiroToBinario = (Integer::toBinaryString);
		UnaryOperator<String> reverseString = (n -> {
			StringBuilder sb = new StringBuilder(n);
			return sb.reverse().toString();
		});
		
		Function<String, Integer> conversaoBinarioToInteiro = (binario -> Integer.parseInt(binario, 2)); 

		System.out.println("Valores originais");
		nums.stream().forEach(print);
		
		System.out.println("\n\nValores após alteração");
		
		nums.stream()
			.map(conversaoInteiroToBinario.andThen(reverseString.andThen(conversaoBinarioToInteiro)))
			.forEach(print);
		
	}
	
}
