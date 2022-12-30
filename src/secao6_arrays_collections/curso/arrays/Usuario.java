package secao6_arrays_collections.curso.arrays;

import java.util.Objects;

public class Usuario {

	String nome;
	String email;

	public Usuario() {

	}
	
	public Usuario(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Usuario))
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}
	
}
