package secao12_generics;

import java.util.Objects;

public class Par<C, V> {

	private C chave;
	private V valor;

	public Par(C chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public C getChave() {
		return chave;
	}

	public void setChave(C chave) {
		this.chave = chave;
	}

	public V getValor() {
		return valor;
	}

	public void setValor(V valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Par))
			return false;
		Par<C, V> other = (Par<C, V>) obj;
		return Objects.equals(chave, other.chave);
	}

}
