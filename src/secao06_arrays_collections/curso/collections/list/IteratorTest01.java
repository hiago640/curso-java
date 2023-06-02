package secao06_arrays_collections.curso.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorTest01 {

	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>();

		mangas.add(new Manga(5L, "Pokemon", 19.9, 0));
		mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5, 5));
		mangas.add(new Manga(4L, "Attack on titan", 3.2, 0));
		mangas.add(new Manga(3L, "Bersek", 11.7, 2));
		mangas.add(new Manga(2L, "Dragon ball Z", 2.99, 2));

//		Iterator<Manga> mangaIterator = mangas.iterator();
//		
//		while (mangaIterator.hasNext()) {
//			if(mangaIterator.next().getQuantidade() == 0)
//				mangaIterator.remove();
//		}
		
		//Lambda e programação funcional
		mangas.removeIf(e -> e.getQuantidade() == 0);
		System.out.println(mangas);
		
	}
	
}
