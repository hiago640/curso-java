package secao06_arrays_collections.curso.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		// Não pode duplicidade de chaves
		// Caso for inserido um novo registro com a mesma chave, o antigo será
		// substituído

		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo");
		usuarios.put(2, "Ana");
		usuarios.put(3, "Ana Júlia");
		usuarios.put(4, "Hiago");
		
		System.out.println(usuarios.size());

		System.out.println(usuarios.isEmpty());
		
		// mostra somente as chaves
		System.out.println(usuarios.keySet());
		
		// mostra somente os valores
		System.out.println(usuarios.values());
		
		//mostra chave-valor
		System.out.println(usuarios.entrySet());
		
		// verifica se contains
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsValue("Roberto"));
		
		// pega um valor a partir da chave
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui"));
		
		for(int chave : usuarios.keySet())
			System.out.println(chave);
		
		for(String valor: usuarios.values())
			System.out.println(valor);
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}

	}

}
