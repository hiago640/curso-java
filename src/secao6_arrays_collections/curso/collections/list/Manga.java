package secao6_arrays_collections.curso.collections.list;

import java.util.Objects;

public class Manga implements Comparable<Manga>{

	private Long id;
	private String nome;
	private double preco;
	
	public Manga(Long id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Manga))
			return false;
		Manga other = (Manga) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	@Override
	public int compareTo(Manga outroManga) {
		
		// negativo se o this for < outroManga
		// se this == outroManga retorna 0
		// positivo se o this for > outroManga
		
		return this.id.compareTo(outroManga.getId());
	}

	@Override
	public String toString() {
		return String.format("Manga [id=%s, nome=%s, preco=%s]", id, nome, preco);
	}
	
}
