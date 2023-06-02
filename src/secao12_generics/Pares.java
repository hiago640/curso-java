package secao12_generics;

import java.util.HashSet;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new HashSet<>();
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return;
		
		Par<C, V> novoPar = new Par<>(chave, valor);
		
		if(itens.contains(novoPar))
			itens.remove(novoPar);

		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Par<C, V> par = itens.stream().filter(p -> chave.equals(p.getChave())).findFirst().get();
		return par.getValor();
	}
}
