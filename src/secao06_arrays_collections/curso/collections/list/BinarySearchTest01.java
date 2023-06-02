package secao06_arrays_collections.curso.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);

		// busca na lista e retorna um índice caso encontre o que estamos procurando, ou
		// caso nao retorne, ele retorna algo seguindo a seguinte regra
		// (-(ponto de inserção) - 1)

		// para usar o BinarySearch, a lista deve estar ordenada
		Collections.sort(numeros);

		// index 0,1,2,3
		// value 0,2,3,4
		System.out.println(Collections.binarySearch(numeros, 2));

		System.out.println(Collections.binarySearch(numeros, 1));
		// retorna -2 pois, o valor 1, deve estar entre os índice 0, 1

	}

}
