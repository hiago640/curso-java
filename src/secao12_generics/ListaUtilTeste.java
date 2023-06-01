package secao12_generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimoElemento(langs);
		System.out.println(ultimaLinguagem);
		
		int ultimoNumero = (Integer) ListaUtil.getUltimoElemento(nums);
		System.out.println(ultimoNumero);
		
		ultimaLinguagem = ListaUtil.getUltimoElementoGenerics(langs);
		System.out.println(ultimaLinguagem);
		
		ultimoNumero = ListaUtil.getUltimoElementoGenerics(nums);
		System.out.println(ultimoNumero);
	}
	
}
