package secao06_arrays_collections.curso.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		// FIFO
		// F -> First
		// I -> In
		// F -> First
		// O -> out

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila

		// Diferença é o comportamento. Ocorre quando a fila esta cheia
		// .add() lançará uma exceção caso a fila esteja cheia.
		// .offer() retorna falso caso a fila esteja cheia.
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");

		// Peek e Element -> obter o próximo elemento da fila (sem remover)

		// Diferença é o comportamento, ocorre quando a fila está vazia
		// .element() lançará uma exceção caso a fila esteja vazia.
		// .peek() retorna falso caso a fila esteja vazia.
		System.out.println(fila.peek());
		System.out.println(fila.element());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();

		// Poll e Remove -> obter o próximo elemento da fila

		// Diferença é o comportamento, ocorre quando a fila está vazia
		// .remove() lançará uma exceção caso a fila esteja vazia.
		// .poll() retorna null caso a fila esteja vazia.
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
