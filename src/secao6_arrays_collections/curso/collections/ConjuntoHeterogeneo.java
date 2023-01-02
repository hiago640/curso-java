package secao6_arrays_collections.curso.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoHeterogeneo {

	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add('x');
		conjunto.add("Teste");
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto.contains("Teste"));
		System.out.println(conjunto.contains('x'));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//uni�o entre dois conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		//intercess�o entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
	}
	
}
