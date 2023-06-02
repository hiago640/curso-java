package secao06_arrays_collections.curso.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		// LIFO
		// L -> Last
		// I -> In
		// F -> First
		// O -> out

		livros.add("O Pequeno Príncipe");
		livros.push("Harry Potter");
		livros.push("O Hobbit");

		// Peek e Element -> obter o próximo elemento da pilha (sem remover)

		// Diferença é o comportamento, ocorre quando a pilha está vazia
		// .element() lançará uma exceção caso a pilha esteja vazia.
		// .peek() retorna falso caso a pilha esteja vazia.
		System.out.println(livros.peek());
		System.out.println(livros.element());

		// Poll e Remove -> obter o próximo elemento da Pilha

		// Diferença é o comportamento, ocorre quando a Pilha está vazia
		// .pop() lançará uma exceção caso a Pilha esteja vazia.
		// .remove() lançará uma exceção caso a Pilha esteja vazia.
		// .poll() retorna null caso a Pilha esteja vazia.
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		
	}

}
