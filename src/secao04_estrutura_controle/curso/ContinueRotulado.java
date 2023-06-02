package secao04_estrutura_controle.curso;

public class ContinueRotulado {

	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 2)
					continue externo;
				
				System.out.print("[" + i + " " + j + "]") ;
			}
			System.out.println();
		}
		
		System.out.println("Fim");
		
	}
}
