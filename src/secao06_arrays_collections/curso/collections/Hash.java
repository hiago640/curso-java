package secao06_arrays_collections.curso.collections;

import java.util.HashSet;

import secao06_arrays_collections.curso.arrays.Usuario;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Guilherme"));
		usuarios.add(new Usuario("Ana"));
		
		boolean res = usuarios.contains(new Usuario("Guilherme"));
		
		System.out.println(res);
	}
	
}
