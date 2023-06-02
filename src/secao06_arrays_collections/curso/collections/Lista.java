package secao06_arrays_collections.curso.collections;

import java.util.ArrayList;

import secao06_arrays_collections.curso.arrays.Usuario;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Hiago"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Ana"));
		
		System.out.println(lista.get(3));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Hiago")));
		System.out.println("Tem? " + lista.contains(new Usuario("Luiz")));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}
	}
	
}
