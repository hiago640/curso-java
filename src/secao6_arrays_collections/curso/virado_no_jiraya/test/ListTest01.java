package secao6_arrays_collections.curso.virado_no_jiraya.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		List<String> nomes2 = new ArrayList<>();
		
		nomes.add("Hiago");
		nomes.add("Leandro");
		nomes.add("Zézin");
		
		for (String nome: nomes) {
			System.out.println(nome);
		}
		
		// Se encontrar, retorna o registro removido	
		System.out.println(nomes.remove(0));
		
		// retorna True/False se o registro foi removido
		System.out.println(nomes.remove("Leandro"));
		
		nomes.add("Suane");
		
		System.out.println("----------");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
	}
	
}
