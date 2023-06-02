package secao04_estrutura_controle.curso;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		for(int i = 1; i<=5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		System.out.println("\n");
		
		for(String valorDesafio = "#"; !"######".equals(valorDesafio); valorDesafio += "#" ) {
			System.out.println(valorDesafio);
		}
		
	}

}
