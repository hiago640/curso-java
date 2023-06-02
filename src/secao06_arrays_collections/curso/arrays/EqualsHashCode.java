package secao06_arrays_collections.curso.arrays;

public class EqualsHashCode {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Hiago Alexandre";
		u1.email = "hiago.alexandre@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Hiago Alexandre";
		u2.email = "hiago.alexandre@email.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
	}
	
}
