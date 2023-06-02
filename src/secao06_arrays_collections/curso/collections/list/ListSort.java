package secao06_arrays_collections.curso.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		
		List<String> mangas = new ArrayList<>();
		
		mangas.add("Pokemon");
		mangas.add("Hellsing Ultimate");
		mangas.add("Attack on titan");
		mangas.add("Bersek");
		mangas.add("Dragon ball Z");

		for (String manga : mangas) {
			System.out.println(manga);
		}
		
		Collections.sort(mangas);
		
		System.out.println("------------");
		
		for (String manga : mangas) {
			System.out.println(manga);
		}
		
		System.out.println("------------");
		System.out.println("------------");

		List<Double> dinheiros= new ArrayList<>();
		dinheiros.add(100.21);
		dinheiros.add(23.98);
		dinheiros.add(21.21);
		dinheiros.add(98.10);
		
		for (double dinheiro: dinheiros) {
			System.out.println(dinheiro);
		}
		
		Collections.sort(dinheiros);
		
		System.out.println("------------");
		
		for (double dinheiro : dinheiros) {
			System.out.println(dinheiro);
		}
		
	}
	
}
