package secao6_arrays_collections.curso.collections.list;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneList {

	public static void main(String[] args) {

		Smartphone s1 = new Smartphone("1ABC1", "IPhone");
		Smartphone s2 = new Smartphone("22222", "Pixel");
		Smartphone s3 = new Smartphone("33333", "Samsung");

		List<Smartphone> smartphones = new ArrayList<>();
		smartphones.add(s1);
		smartphones.add(s2);
		smartphones.add(s3);

		// limpa a lista
		smartphones.clear();

		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone);
		}

		Smartphone s4 = new Smartphone("22222", "Pixel");

		// verificar se elemento já existe na lista
		System.out.println(smartphones.contains(s4));

		// pegar indice onde objeto está dentro da lista
		// retorna o indice caso encontrar, caso não exista, retorna -1
		int indexSmartphone4 = smartphones.indexOf(s4);
		System.out.println(indexSmartphone4);

		smartphones.add(s4);

		indexSmartphone4 = smartphones.indexOf(s4);
		System.out.println(indexSmartphone4);

		// pegar objeto da lista, por um indice em específico
		System.out.println(smartphones.get(indexSmartphone4));

	}

}
