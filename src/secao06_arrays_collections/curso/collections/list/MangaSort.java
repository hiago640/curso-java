package secao06_arrays_collections.curso.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByPrecoComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga manga, Manga outroManga) {
		return Double.compare(manga.getPreco(), outroManga.getPreco());
	}
	
}

public class MangaSort {

	public static void main(String[] args) {

		List<Manga> mangas = new ArrayList<>();

		mangas.add(new Manga(5L, "Pokemon", 19.9));
		mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5));
		mangas.add(new Manga(4L, "Attack on titan", 3.2));
		mangas.add(new Manga(3L, "Bersek", 11.7));
		mangas.add(new Manga(2L, "Dragon ball Z", 2.99));

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

		Collections.sort(mangas, new MangaByPrecoComparator());
		
		System.out.println("------------");

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

		Collections.sort(mangas);
		System.out.println("------------");

		for (Manga manga : mangas) {
			System.out.println(manga);
		}

	}
}
