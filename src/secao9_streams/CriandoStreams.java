package secao9_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Lua", "Java Script\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs, 1 , 4).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
	
		//seed -> semente inicial
		// f -> funcao q será executada para alcancar o novo valor
//		Stream.iterate(0, n -> n + 1).forEach(System.out::print);
		
	}
	
}
