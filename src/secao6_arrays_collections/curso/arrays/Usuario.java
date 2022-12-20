package secao6_arrays_collections.curso.arrays;

import java.util.Objects;

public class Usuario {
	
	String nome;
	String email;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	
	
}
