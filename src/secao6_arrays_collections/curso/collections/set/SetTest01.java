package secao6_arrays_collections.curso.collections.set;

import java.util.HashSet;
import java.util.Set;

import secao6_arrays_collections.curso.collections.list.Manga;

public class SetTest01 {
	
	public static void main(String[] args) {
		
		//Vantagem de se utilizar o Set, é que ele não permite elementos duplicados em uma coleção
		//são ordenados de acordo com o hash do objeto
		
		Set<Manga> mangas = new HashSet<>();
		
		mangas.add(new Manga(5L, "Pokemon", 19.9, 0));
		mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
		mangas.add(new Manga(4L, "Attack on titan", 3.2, 0));
		mangas.add(new Manga(3L, "Bersek", 11.7, 2));
		mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 2));

		//o set não é indexado.
		//mangas.get();
		
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
		
		mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 2));
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}
}
